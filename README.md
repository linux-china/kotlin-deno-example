Kotlin Deno example
===================
Deno development with Kotlin.

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

* Run the code with Deno

```
$ deno run build/deno/kotlin-deno-demo.js
```

# Use cases

* Kotlin Deno App
* Kotlin as library: TypeScript to invoke JavaScript code compiled by Kotlin

# References

* lib.deno.d.ts: https://github.com/denoland/deno/releases/latest/download/lib.deno.d.ts
* dukat: Converter of TypeScript definition files to Kotlin declarations https://github.com/Kotlin/dukat
