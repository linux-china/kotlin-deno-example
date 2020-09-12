Kotlin Deno example
===================
🦕Deno development with Kotlin.

# Features

* Deno completion:  convert lib.deno.d.ts to  Kotlin declarations

# How it work?

* Compile kotlin into Javascript with nodejs target
* Append stub for Deno for compiled JS code like following.

```javascript
// ========stub for Deno=======
import Kotlin from "https://jspm.dev/kotlin@1.4"

const module = {
    exports: {}
};

function require(moduleName) {
    if (moduleName === 'kotlin') {
        return Kotlin
    } else {
        return {};
    }
}

// ====== compiled JS code from Kotlin======

(function (_, Kotlin) {
   // ...
}(module.exports, require('kotlin')));

```

* Build the project

```
$ deno run --allow-run  --allow-read --allow-write --unstable scripts/build.ts
```

* Run the code with Deno

```
$ deno run build/deno/kotlin-deno-example.js
```

# How to invoke Deno stdlib?

* Declare "external fun" for Kotlin in src/main/kotlin/deno/lib.std.kt
* Add imports in "scripts/deps.js"

# import other npm packages or Deno modules

* Use dukat to generate Kotlin declarations from xxx.d.ts or maintain lib.xxx.kt manually
* import Deno modules in deps.js
* import npm packages in deps.js by https://jspm.dev/xxx@version

# Use cases

* Kotlin Deno App
* Kotlin as library: TypeScript to invoke JavaScript code compiled by Kotlin

# References

* Deno: https://deno.land/
* Kotlin: https://kotlinlang.org/
* lib.deno.d.ts: https://github.com/denoland/deno/releases/latest/download/lib.deno.d.ts
* dukat: Converter of TypeScript definition files to Kotlin declarations https://github.com/Kotlin/dukat
* jspm: provides a module CDN allowing any package from npm to be directly loaded in the browser and other JS environments https://jspm.org/
