plugins {
  kotlin("js") version "1.4.10"
  id("deno-plugin")
}

group = "org.mvnsearch"
version = "1.0.0-SNAPSHOT"

repositories {
  mavenCentral()
}

dependencies {
  implementation("org.jetbrains.kotlinx", "kotlinx-coroutines-core", "1.3.9")
  testImplementation(kotlin("test-js"))
}

kotlin {
  js {
    useCommonJs()
    binaries.executable()
    nodejs()
  }
}

tasks {
  //task from buildSrc
  register<org.mvnsearch.DenoTask>("deno") {
    dependsOn("build")
    group = "Deno"
    description = "Build Deno file from Kotlin"
  }
}
