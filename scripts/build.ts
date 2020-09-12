import {decode} from "https://deno.land/std@0.68.0/encoding/utf8.ts"
import {green, red} from "https://deno.land/std@0.68.0/fmt/colors.ts";
import {existsSync} from "https://deno.land/std@0.68.0/fs/mod.ts";

const moduleName = "kotlin-deno-example";
const distPath = "build/deno";
const distFileName = `${moduleName}.js`;

function log(text: string): void {
  console.log(`${green('[log]')} ${text}`);
}

function err(text: string): never {
  console.log(`${red('[err]')} ${text}`);
  return Deno.exit(1);
}

async function run(msg: string, cmd: string[]) {
  log(msg);
  const process = Deno.run({cmd});
  if (!(await process.status()).success) {
    err(`${msg} failed`);
  }
}

log("Begin to compile Kotlin into Javascript code by Gradle")
await run(
  "building Kotlin/JS with Gradle",
  ["./gradlew", "-x", "test", "clean", "build"],
);

const templateCode = decode(await Deno.readFile(`scripts/template.js`));
const compiledJsCode = decode(await Deno.readFile(`build/js/packages/${moduleName}/kotlin/${moduleName}.js`));
const depsCod = decode(await Deno.readFile(`scripts/deps.js`));

//code replacement
let denoCode = templateCode.replace("//deps.js", depsCod);
denoCode = denoCode.replace("//compiledCode", compiledJsCode);

if (!existsSync(distPath)) {
  await Deno.mkdir(distPath);
}

log("Generate Javascript code for Deno")
await Deno.writeTextFile(`${distPath}/${distFileName}`, denoCode);

log(`Deno file generated: ${distPath}/${distFileName}`);
