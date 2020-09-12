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

//compiled Code

export default module.exports;

