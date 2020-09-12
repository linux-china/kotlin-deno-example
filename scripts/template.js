import Kotlin from "https://jspm.dev/kotlin@1.4"

//===== global imports ===========
//deps.js

//===== stub for commonjs ===========
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

//===== compiled Javascript code from Kotlin ====
//compiledCode

//====== export default for library =======
export default module.exports;

