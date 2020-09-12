@file:JsQualifier("WebAssembly")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
package WebAssembly

import kotlin.js.*
import kotlin.js.Json
import org.khronos.webgl.*
import org.w3c.dom.*
import org.w3c.dom.events.*
import org.w3c.dom.parsing.*
import org.w3c.dom.svg.*
import org.w3c.dom.url.*
import org.w3c.fetch.*
import org.w3c.files.*
import org.w3c.notifications.*
import org.w3c.performance.*
import org.w3c.workers.*
import org.w3c.xhr.*
import PromiseLike

@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
external interface CompileError {
    companion object {
        var prototype: CompileError
    }
}

@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
external interface Global {
    var value: Any
    fun valueOf(): Any

    companion object {
        var prototype: Global
    }
}

@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
external interface Instance {
    var exports: Exports

    companion object {
        var prototype: Instance
    }
}

@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
external interface LinkError {
    companion object {
        var prototype: LinkError
    }
}

@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
external interface Memory {
    var buffer: ArrayBuffer
    fun grow(delta: Number): Number

    companion object {
        var prototype: Memory
    }
}

@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
external interface Module {
    companion object {
        var prototype: Module
        fun customSections(moduleObject: Module, sectionName: String): Array<ArrayBuffer>
        fun exports(moduleObject: Module): Array<ModuleExportDescriptor>
        fun imports(moduleObject: Module): Array<ModuleImportDescriptor>
    }
}

@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
external interface RuntimeError {
    companion object {
        var prototype: RuntimeError
    }
}

@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
external interface Table {
    var length: Number
    fun get(index: Number): Function<*>?
    fun grow(delta: Number): Number
    fun set(index: Number, value: Function<*>?)

    companion object {
        var prototype: Table
    }
}

external interface GlobalDescriptor {
    var mutable: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var value: String /* "f32" | "f64" | "i32" | "i64" */
}

external interface MemoryDescriptor {
    var initial: Number
    var maximum: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface ModuleExportDescriptor {
    var kind: String /* "function" | "global" | "memory" | "table" */
    var name: String
}

external interface ModuleImportDescriptor {
    var kind: String /* "function" | "global" | "memory" | "table" */
    var module: String
    var name: String
}

external interface TableDescriptor {
    var element: String /* "anyfunc" */
    var initial: Number
    var maximum: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface WebAssemblyInstantiatedSource {
    var instance: Instance
    var module: Module
}

external fun compile(bytes: ArrayBufferView): Promise<Module>

external fun compile(bytes: ArrayBuffer): Promise<Module>

external fun compileStreaming(source: Response): Promise<Module>

external fun compileStreaming(source: Promise<Response>): Promise<Module>

external fun instantiate(bytes: ArrayBufferView, importObject: Imports = definedExternally): Promise<WebAssemblyInstantiatedSource>

external fun instantiate(bytes: ArrayBuffer, importObject: Imports = definedExternally): Promise<WebAssemblyInstantiatedSource>

external fun instantiate(moduleObject: Module, importObject: Imports = definedExternally): Promise<Instance>

external fun instantiateStreaming(response: Response, importObject: Imports = definedExternally): Promise<WebAssemblyInstantiatedSource>

external fun instantiateStreaming(response: PromiseLike<Response>, importObject: Imports = definedExternally): Promise<WebAssemblyInstantiatedSource>

external fun validate(bytes: ArrayBufferView): Boolean

external fun validate(bytes: ArrayBuffer): Boolean