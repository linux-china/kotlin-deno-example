import Kotlin from "https://jspm.dev/kotlin@1.4.0"
import KotlinxCoroutinesCore from "https://jspm.dev/kotlinx-coroutines-core@1.3.9"

//===== global imports ===========
//deps.js

//===== stub for commonjs ===========
const module = {
  exports: {}
};

function require(moduleName) {
  if (moduleName === 'kotlin') {
    return Kotlin;
  } else if (moduleName === 'kotlinx-coroutines-core') {
    return KotlinxCoroutinesCore;
  } else {
    return {};
  }
}

//===== compiled Javascript code from Kotlin ====
//compiledCode

//====== export default for library =======
export default module.exports;

