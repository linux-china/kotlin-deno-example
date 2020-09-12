build:
  deno run --allow-run  --allow-read --allow-write --unstable scripts/build.ts

run:
  deno run build/deno/kotlin-deno-example.js

generate:
  dukat -d src/main/kotlin/deno src/main/kotlin/deno/lib.deno.d.ts

setup:
  brew install deno
  npm install -g dukat
