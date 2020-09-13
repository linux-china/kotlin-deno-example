build:
  ./gradlew -x test clean build deno

run:
  deno run --no-check build/deno/kotlin-deno-example.js

generate:
  dukat -d src/main/kotlin/deno src/main/kotlin/deno/lib.deno.d.ts

setup:
  brew install deno
  npm install -g dukat
