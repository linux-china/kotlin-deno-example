plugins {
    `kotlin-dsl`
    `java-gradle-plugin`
}

repositories {
    mavenCentral()
}

apply {
    plugin("kotlin")
}

kotlinDslPluginOptions {
    experimentalWarning.set(false)
}

gradlePlugin {
    plugins {
        create("denoPlugin") {
            id = "deno-plugin"
            implementationClass = "org.mvnsearch.DenoPlugin"
        }
    }
}
