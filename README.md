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
import Kotlin from "https://jspm.dev/kotlin@1.4.0"

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

export default module.exports;
```

* Build the project

```
$ ./gradlew deno
```

* Run the code with Deno. Please add --no-check for Deno run to disable kotlin module check.

```
$ deno run --no-check build/deno/kotlin-deno-example.js
```

# How to invoke Deno stdlib?

* Declare "external fun" for Kotlin in src/main/kotlin/deno/lib.std.kt
* Add imports in "buildSrc/src/scripts/deps.js"

# Import other npm packages or Deno modules

* Use dukat to generate Kotlin declarations from xxx.d.ts or maintain lib.xxx.kt manually
* import Deno modules in deps.js
* import npm packages in deps.js by https://jspm.dev/xxx@version

# Use Kotlinx Coroutines library

* add dependency in build.gradle.kts

```
implementation("org.jetbrains.kotlinx", "kotlinx-coroutines-core", "1.3.9")
```

* Add kotlinx-coroutines-core import in templates.js

```javascript
import Kotlin from "https://jspm.dev/kotlin@1.4.0"
import KotlinxCoroutinesCore from "https://jspm.dev/kotlinx-coroutines-core@1.3.9"

//......

function require(moduleName) {
  if (moduleName === 'kotlin') {
    return Kotlin
  } else if (moduleName === 'kotlinx-coroutines-core') {
    return KotlinxCoroutinesCore;
  } else {
    return {};
  }
}
```

# Use cases

* Kotlin Deno App
* Kotlin as library: TypeScript to invoke JavaScript code compiled by Kotlin

# Dev Tips

* Enables continuous build: re-execute tasks when task file inputs change

```
./gradlew -t deno
```

* denon: Automatically restart your deno projects https://deno.land/x/denon

# References

* Deno: https://deno.land/
* Kotlin: https://kotlinlang.org/
* lib.deno.d.ts: https://github.com/denoland/deno/releases/latest/download/lib.deno.d.ts
* dukat: Converter of TypeScript definition files to Kotlin declarations https://github.com/Kotlin/dukat
* jspm: provides a module CDN allowing any package from npm to be directly loaded in the browser and other JS environments https://jspm.org/
