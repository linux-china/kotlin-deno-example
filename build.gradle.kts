plugins {
  kotlin("js") version "1.4.10"
}
group = "org.mvnsearch"
version = "1.0.0-SNAPSHOT"

repositories {
  mavenCentral()
}

dependencies {
  testImplementation(kotlin("test-js"))
}

kotlin {
  js {
    useCommonJs()
    binaries.executable()
    nodejs()
  }
}
