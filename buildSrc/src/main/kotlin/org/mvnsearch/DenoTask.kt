package org.mvnsearch

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction
import java.io.File

open class DenoTask : DefaultTask() {
  @TaskAction
  fun execute() {
    val appName = project.name
    val scriptDir = File(project.projectDir, "buildSrc/src/scripts")
    val templateCode = File(scriptDir, "template.js").readText()
    val depsJsCode = File(scriptDir, "deps.js").readText()
    val compiledJsCode = File(project.buildDir, "js/packages/${appName}/kotlin/${appName}.js").readText()
    var denoCode = templateCode.replace("//deps.js", depsJsCode)
    denoCode = denoCode.replace("//compiledCode", compiledJsCode)
    val destDir = File(project.buildDir, "deno")
    if (!destDir.exists()) {
      destDir.mkdirs()
    }
    val denoFile = File(destDir, "${appName}.js")
    denoFile.writeText(denoCode)
    println("Deno file generated: $denoFile")
  }
}
