@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")

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

@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
external interface Performance {
    fun clearMarks(markName: String = definedExternally)
    fun clearMeasures(measureName: String = definedExternally)
    fun getEntries(): PerformanceEntryList
    fun getEntriesByName(name: String, type: String = definedExternally): PerformanceEntryList
    fun getEntriesByType(type: String): PerformanceEntryList
    fun mark(markName: String, options: PerformanceMarkOptions = definedExternally): PerformanceMark
    fun measure(measureName: String, options: PerformanceMeasureOptions = definedExternally): PerformanceMeasure
    fun measure(measureName: String, startMark: String = definedExternally, endMark: String = definedExternally): PerformanceMeasure
    fun now(): Number

    companion object {
        var prototype: Performance
    }
}

external interface PerformanceMarkOptions {
    var detail: Any?
        get() = definedExternally
        set(value) = definedExternally
    var startTime: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface PerformanceMeasureOptions {
    var detail: Any?
        get() = definedExternally
        set(value) = definedExternally
    var start: dynamic /* String? | Number? */
        get() = definedExternally
        set(value) = definedExternally
    var duration: Number?
        get() = definedExternally
        set(value) = definedExternally
    var end: dynamic /* String? | Number? */
        get() = definedExternally
        set(value) = definedExternally
}

external open class DOMException(message: String = definedExternally, name: String = definedExternally) : Error {
    override var name: String
    override var message: String
}

external interface EventInit {
    var bubbles: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var cancelable: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var composed: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external open class Event(type: String, eventInitDict: EventInit = definedExternally) {
    open var bubbles: Boolean
    open var cancelBubble: Boolean
    open var cancelable: Boolean
    open var composed: Boolean
    open var currentTarget: EventTarget?
    open var defaultPrevented: Boolean
    open var eventPhase: Number
    open var isTrusted: Boolean
    open var target: EventTarget?
    open var timeStamp: Number
    open var type: String
    open fun composedPath(): Array<EventTarget>
    open fun preventDefault()
    open fun stopImmediatePropagation()
    open fun stopPropagation()
    open var AT_TARGET: Number
    open var BUBBLING_PHASE: Number
    open var CAPTURING_PHASE: Number
    open var NONE: Number

    companion object {
        var AT_TARGET: Number
        var BUBBLING_PHASE: Number
        var CAPTURING_PHASE: Number
        var NONE: Number
    }
}

external open class EventTarget {
    open fun addEventListener(type: String, listener: EventListener?, options: Boolean = definedExternally)
    open fun addEventListener(type: String, listener: EventListener?, options: AddEventListenerOptions = definedExternally)
    open fun addEventListener(type: String, listener: EventListenerObject?, options: Boolean = definedExternally)
    open fun addEventListener(type: String, listener: EventListenerObject?, options: AddEventListenerOptions = definedExternally)
    open fun dispatchEvent(event: Event): Boolean
    open fun removeEventListener(type: String, callback: EventListener?, options: EventListenerOptions = definedExternally)
    open fun removeEventListener(type: String, callback: EventListener?, options: Boolean = definedExternally)
    open fun removeEventListener(type: String, callback: EventListenerObject?, options: EventListenerOptions = definedExternally)
    open fun removeEventListener(type: String, callback: EventListenerObject?, options: Boolean = definedExternally)
}

external interface EventListener {
    @nativeInvoke
    operator fun invoke(evt: Event): dynamic /* Unit | Promise<Unit> */
}

external interface EventListenerObject {
    fun handleEvent(evt: Event): dynamic /* Unit | Promise<Unit> */
}

external interface AddEventListenerOptions : EventListenerOptions {
    var once: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var passive: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface EventListenerOptions {
    var capture: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external fun atob(s: String): String

external fun btoa(s: String): String

external interface `T$8` {
    var fatal: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var ignoreBOM: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$9` {
    var stream: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external open class TextDecoder(label: String = definedExternally, options: `T$8` = definedExternally) {
    open var encoding: String
    open var fatal: Boolean
    open var ignoreBOM: Any
    open fun decode(input: ArrayBufferView = definedExternally, options: `T$9` = definedExternally): String
    open fun decode(input: ArrayBuffer = definedExternally, options: `T$9` = definedExternally): String
}

external interface `T$10` {
    var read: Number
    var written: Number
}

external open class TextEncoder {
    open var encoding: String
    open fun encode(input: String = definedExternally): Uint8Array
    open fun encodeInto(input: String, dest: Uint8Array): `T$10`
}

external open class AbortController {
    open var signal: AbortSignal
    open fun abort()
}

external interface AbortSignalEventMap {
    var abort: Event
}

@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
external interface AbortSignal : EventTarget {
    var aborted: Boolean
    var onabort: ((self: AbortSignal, ev: Event) -> Any)?
    fun <K : Any> addEventListener(type: K, listener: (self: AbortSignal, ev: Any) -> Any, options: Boolean = definedExternally)
    fun <K : Any> addEventListener(type: K, listener: (self: AbortSignal, ev: Any) -> Any, options: AddEventListenerOptions = definedExternally)
    fun addEventListener(type: String, listener: EventListener, options: Boolean = definedExternally)
    override fun addEventListener(type: String, listener: EventListener?, options: Boolean)
    fun addEventListener(type: String, listener: EventListener, options: AddEventListenerOptions = definedExternally)
    override fun addEventListener(type: String, listener: EventListener?, options: AddEventListenerOptions)
    fun addEventListener(type: String, listener: EventListenerObject, options: Boolean = definedExternally)
    override fun addEventListener(type: String, listener: EventListenerObject?, options: Boolean)
    fun addEventListener(type: String, listener: EventListenerObject, options: AddEventListenerOptions = definedExternally)
    override fun addEventListener(type: String, listener: EventListenerObject?, options: AddEventListenerOptions)
    fun <K : Any> removeEventListener(type: K, listener: (self: AbortSignal, ev: Any) -> Any, options: Boolean = definedExternally)
    fun <K : Any> removeEventListener(type: K, listener: (self: AbortSignal, ev: Any) -> Any, options: EventListenerOptions = definedExternally)
    fun removeEventListener(type: String, listener: EventListener, options: Boolean = definedExternally)
    override fun removeEventListener(type: String, callback: EventListener?, options: Boolean)
    fun removeEventListener(type: String, listener: EventListener, options: EventListenerOptions = definedExternally)
    override fun removeEventListener(type: String, callback: EventListener?, options: EventListenerOptions)
    fun removeEventListener(type: String, listener: EventListenerObject, options: Boolean = definedExternally)
    override fun removeEventListener(type: String, callback: EventListenerObject?, options: Boolean)
    fun removeEventListener(type: String, listener: EventListenerObject, options: EventListenerOptions = definedExternally)
    override fun removeEventListener(type: String, callback: EventListenerObject?, options: EventListenerOptions)

    companion object {
        var prototype: AbortSignal
    }
}

external fun setTimeout(cb: (args: Any) -> Unit, delay: Number = definedExternally, vararg args: Any): Number

external fun setInterval(cb: (args: Any) -> Unit, delay: Number = definedExternally, vararg args: Any): Number

external fun clearInterval(id: Number = definedExternally)

external fun clearTimeout(id: Number = definedExternally)

external interface VoidFunction {
    @nativeInvoke
    operator fun invoke()
}

external fun queueMicrotask(func: VoidFunction)

external var console: Console

external var crypto: Crypto

external fun addEventListener(type: String, callback: EventListener?, options: Boolean? = definedExternally)

external fun addEventListener(type: String, callback: EventListener?, options: AddEventListenerOptions? = definedExternally)

external fun addEventListener(type: String, callback: EventListenerObject?, options: Boolean? = definedExternally)

external fun addEventListener(type: String, callback: EventListenerObject?, options: AddEventListenerOptions? = definedExternally)

external fun dispatchEvent(event: Event): Boolean

external fun removeEventListener(type: String, callback: EventListener?, options: Boolean? = definedExternally)

external fun removeEventListener(type: String, callback: EventListener?, options: EventListenerOptions? = definedExternally)

external fun removeEventListener(type: String, callback: EventListenerObject?, options: Boolean? = definedExternally)

external fun removeEventListener(type: String, callback: EventListenerObject?, options: EventListenerOptions? = definedExternally)

external interface DomIterable<K, V> {
    fun keys(): IterableIterator<K>
    fun values(): IterableIterator<V>
    fun entries(): IterableIterator<dynamic /* JsTuple<K, V> */>
    fun forEach(callback: (value: V, key: K, parent: DomIterable<K, V> /* this */) -> Unit, thisArg: Any = definedExternally)
}

external interface ReadableStreamReadDoneResult<T> {
    var done: Boolean
    var value: T?
        get() = definedExternally
        set(value) = definedExternally
}

external interface ReadableStreamReadValueResult<T> {
    var done: Boolean
    var value: T
}

external interface ReadableStreamDefaultReader<R> {
    var closed: Promise<Unit>
    fun cancel(reason: Any = definedExternally): Promise<Unit>
    fun read(): Promise<dynamic /* ReadableStreamReadValueResult<R> | ReadableStreamReadDoneResult<R> */>
    fun releaseLock()
}

external interface ReadableStreamReader<R> {
    fun cancel(): Promise<Unit>
    fun read(): Promise<dynamic /* ReadableStreamReadValueResult<R> | ReadableStreamReadDoneResult<R> */>
    fun releaseLock()
}

external interface ReadableByteStreamControllerCallback {
    @nativeInvoke
    operator fun invoke(controller: ReadableByteStreamController): dynamic /* Unit | PromiseLike<Unit> */
}

external interface UnderlyingByteSource {
    var autoAllocateChunkSize: Number?
        get() = definedExternally
        set(value) = definedExternally
    var cancel: ReadableStreamErrorCallback?
        get() = definedExternally
        set(value) = definedExternally
    var pull: ReadableByteStreamControllerCallback?
        get() = definedExternally
        set(value) = definedExternally
    var start: ReadableByteStreamControllerCallback?
        get() = definedExternally
        set(value) = definedExternally
    var type: String /* "bytes" */
}

external interface UnderlyingSource<R> {
    var cancel: ReadableStreamErrorCallback?
        get() = definedExternally
        set(value) = definedExternally
    var pull: ReadableStreamDefaultControllerCallback<R>?
        get() = definedExternally
        set(value) = definedExternally
    var start: ReadableStreamDefaultControllerCallback<R>?
        get() = definedExternally
        set(value) = definedExternally
    var type: Any?
        get() = definedExternally
        set(value) = definedExternally
}

external interface ReadableStreamErrorCallback {
    @nativeInvoke
    operator fun invoke(reason: Any): dynamic /* Unit | PromiseLike<Unit> */
}

external interface ReadableStreamDefaultControllerCallback<R> {
    @nativeInvoke
    operator fun invoke(controller: ReadableStreamDefaultController<R>): dynamic /* Unit | PromiseLike<Unit> */
}

external interface ReadableStreamDefaultController<R> {
    var desiredSize: Number?
    fun close()
    fun enqueue(chunk: R)
    fun error(error: Any = definedExternally)
}

external interface ReadableByteStreamController {
    var byobRequest: Any?
    var desiredSize: Number?
    fun close()
    fun enqueue(chunk: ArrayBufferView)
    fun error(error: Any = definedExternally)
}

external interface PipeOptions {
    var preventAbort: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var preventCancel: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var preventClose: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var signal: AbortSignal?
        get() = definedExternally
        set(value) = definedExternally
}

external interface QueuingStrategySizeCallback<T> {
    @nativeInvoke
    operator fun invoke(chunk: T): Number
}

external interface QueuingStrategy<T> {
    var highWaterMark: Number?
        get() = definedExternally
        set(value) = definedExternally
    var size: QueuingStrategySizeCallback<T>?
        get() = definedExternally
        set(value) = definedExternally
}

external interface QueuingStrategy__0 : QueuingStrategy<Any>

external interface `T$11` {
    var highWaterMark: Number
}

external open class CountQueuingStrategy(options: `T$11`) : QueuingStrategy__0 {
    open fun size(chunk: Any): Number /* 1 */
}

external open class ByteLengthQueuingStrategy(options: `T$11`) : QueuingStrategy<ArrayBufferView> {
    open fun size(chunk: ArrayBufferView): Number
}

external interface `T$12` {
    var preventCancel: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$13` {
    var writable: WritableStream<Any>
    var readable: ReadableStream<Any>
}

@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
external interface ReadableStream<R> {
    var locked: Boolean
    fun cancel(reason: Any = definedExternally): Promise<Unit>
    fun getIterator(options: `T$12` = definedExternally): AsyncIterableIterator<R>
    fun getReader(): ReadableStreamDefaultReader<R>
    fun <T> pipeThrough(__0: `T$13`, options: PipeOptions = definedExternally): ReadableStream<T>
    fun pipeTo(dest: WritableStream<R>, options: PipeOptions = definedExternally): Promise<Unit>
    fun tee(): dynamic /* JsTuple<ReadableStream<R>, ReadableStream<R>> */

    companion object {
        var prototype: ReadableStream__0
    }
}

external interface ReadableStream__0 : ReadableStream<Any>

external interface WritableStreamDefaultControllerCloseCallback {
    @nativeInvoke
    operator fun invoke(): dynamic /* Unit | PromiseLike<Unit> */
}

external interface WritableStreamDefaultControllerStartCallback {
    @nativeInvoke
    operator fun invoke(controller: WritableStreamDefaultController): dynamic /* Unit | PromiseLike<Unit> */
}

external interface WritableStreamDefaultControllerWriteCallback<W> {
    @nativeInvoke
    operator fun invoke(chunk: W, controller: WritableStreamDefaultController): dynamic /* Unit | PromiseLike<Unit> */
}

external interface WritableStreamErrorCallback {
    @nativeInvoke
    operator fun invoke(reason: Any): dynamic /* Unit | PromiseLike<Unit> */
}

external interface UnderlyingSink<W> {
    var abort: WritableStreamErrorCallback?
        get() = definedExternally
        set(value) = definedExternally
    var close: WritableStreamDefaultControllerCloseCallback?
        get() = definedExternally
        set(value) = definedExternally
    var start: WritableStreamDefaultControllerStartCallback?
        get() = definedExternally
        set(value) = definedExternally
    var type: Any?
        get() = definedExternally
        set(value) = definedExternally
    var write: WritableStreamDefaultControllerWriteCallback<W>?
        get() = definedExternally
        set(value) = definedExternally
}

external open class WritableStream<W>(underlyingSink: UnderlyingSink<W> = definedExternally, strategy: QueuingStrategy<W> = definedExternally) {
    open var locked: Boolean
    open fun abort(reason: Any = definedExternally): Promise<Unit>
    open fun close(): Promise<Unit>
    open fun getWriter(): WritableStreamDefaultWriter<W>
}

external interface WritableStreamDefaultController {
    fun error(error: Any = definedExternally)
}

external interface WritableStreamDefaultWriter<W> {
    var closed: Promise<Unit>
    var desiredSize: Number?
    var ready: Promise<Unit>
    fun abort(reason: Any = definedExternally): Promise<Unit>
    fun close(): Promise<Unit>
    fun releaseLock()
    fun write(chunk: W): Promise<Unit>
}

external open class TransformStream<I, O>(transformer: Transformer<I, O> = definedExternally, writableStrategy: QueuingStrategy<I> = definedExternally, readableStrategy: QueuingStrategy<O> = definedExternally) {
    open var readable: ReadableStream<O>
    open var writable: WritableStream<I>
}

external interface TransformStreamDefaultController<O> {
    var desiredSize: Number?
    fun enqueue(chunk: O)
    fun error(reason: Any = definedExternally)
    fun terminate()
}

external interface Transformer<I, O> {
    var flush: TransformStreamDefaultControllerCallback<O>?
        get() = definedExternally
        set(value) = definedExternally
    var readableType: Any?
        get() = definedExternally
        set(value) = definedExternally
    var start: TransformStreamDefaultControllerCallback<O>?
        get() = definedExternally
        set(value) = definedExternally
    var transform: TransformStreamDefaultControllerTransformCallback<I, O>?
        get() = definedExternally
        set(value) = definedExternally
    var writableType: Any?
        get() = definedExternally
        set(value) = definedExternally
}

external interface TransformStreamDefaultControllerCallback<O> {
    @nativeInvoke
    operator fun invoke(controller: TransformStreamDefaultController<O>): dynamic /* Unit | PromiseLike<Unit> */
}

external interface TransformStreamDefaultControllerTransformCallback<I, O> {
    @nativeInvoke
    operator fun invoke(chunk: I, controller: TransformStreamDefaultController<O>): dynamic /* Unit | PromiseLike<Unit> */
}

external interface DOMStringList {
    var length: Number
    fun contains(string: String): Boolean
    fun item(index: Number): String?
    @nativeGetter
    operator fun get(index: Number): String?
    @nativeSetter
    operator fun set(index: Number, value: String)
}

external interface BlobPropertyBag {
    var type: String?
        get() = definedExternally
        set(value) = definedExternally
    var ending: String? /* "transparent" | "native" */
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
external interface Blob {
    var size: Number
    var type: String
    fun arrayBuffer(): Promise<ArrayBuffer>
    fun slice(start: Number = definedExternally, end: Number = definedExternally, contentType: String = definedExternally): Blob
    fun stream(): ReadableStream__0
    fun text(): Promise<String>

    companion object {
        var prototype: Blob
    }
}

external interface FilePropertyBag : BlobPropertyBag {
    var lastModified: Number?
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
external interface File : Blob {
    var lastModified: Number
    var name: String

    companion object {
        var prototype: File
    }
}

external interface FileReaderEventMap {
    var abort: ProgressEvent<FileReader>
    var error: ProgressEvent<FileReader>
    var load: ProgressEvent<FileReader>
    var loadend: ProgressEvent<FileReader>
    var loadstart: ProgressEvent<FileReader>
    var progress: ProgressEvent<FileReader>
}

@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
external interface FileReader : EventTarget {
    var error: DOMException?
    var onabort: ((self: FileReader, ev: ProgressEvent<FileReader>) -> Any)?
    var onerror: ((self: FileReader, ev: ProgressEvent<FileReader>) -> Any)?
    var onload: ((self: FileReader, ev: ProgressEvent<FileReader>) -> Any)?
    var onloadend: ((self: FileReader, ev: ProgressEvent<FileReader>) -> Any)?
    var onloadstart: ((self: FileReader, ev: ProgressEvent<FileReader>) -> Any)?
    var onprogress: ((self: FileReader, ev: ProgressEvent<FileReader>) -> Any)?
    var readyState: Number
    var result: dynamic /* String? | ArrayBuffer? */
        get() = definedExternally
        set(value) = definedExternally
    fun abort()
    fun readAsArrayBuffer(blob: Blob)
    fun readAsBinaryString(blob: Blob)
    fun readAsDataURL(blob: Blob)
    fun readAsText(blob: Blob, encoding: String = definedExternally)
    var DONE: Number
    var EMPTY: Number
    var LOADING: Number
    fun <K : Any> addEventListener(type: K, listener: (self: FileReader, ev: Any) -> Any, options: Boolean = definedExternally)
    fun <K : Any> addEventListener(type: K, listener: (self: FileReader, ev: Any) -> Any, options: AddEventListenerOptions = definedExternally)
    fun addEventListener(type: String, listener: EventListener, options: Boolean = definedExternally)
    override fun addEventListener(type: String, listener: EventListener?, options: Boolean)
    fun addEventListener(type: String, listener: EventListener, options: AddEventListenerOptions = definedExternally)
    override fun addEventListener(type: String, listener: EventListener?, options: AddEventListenerOptions)
    fun addEventListener(type: String, listener: EventListenerObject, options: Boolean = definedExternally)
    override fun addEventListener(type: String, listener: EventListenerObject?, options: Boolean)
    fun addEventListener(type: String, listener: EventListenerObject, options: AddEventListenerOptions = definedExternally)
    override fun addEventListener(type: String, listener: EventListenerObject?, options: AddEventListenerOptions)
    fun <K : Any> removeEventListener(type: K, listener: (self: FileReader, ev: Any) -> Any, options: Boolean = definedExternally)
    fun <K : Any> removeEventListener(type: K, listener: (self: FileReader, ev: Any) -> Any, options: EventListenerOptions = definedExternally)
    fun removeEventListener(type: String, listener: EventListener, options: Boolean = definedExternally)
    override fun removeEventListener(type: String, callback: EventListener?, options: Boolean)
    fun removeEventListener(type: String, listener: EventListener, options: EventListenerOptions = definedExternally)
    override fun removeEventListener(type: String, callback: EventListener?, options: EventListenerOptions)
    fun removeEventListener(type: String, listener: EventListenerObject, options: Boolean = definedExternally)
    override fun removeEventListener(type: String, callback: EventListenerObject?, options: Boolean)
    fun removeEventListener(type: String, listener: EventListenerObject, options: EventListenerOptions = definedExternally)
    override fun removeEventListener(type: String, callback: EventListenerObject?, options: EventListenerOptions)

    companion object {
        var prototype: FileReader
        var DONE: Number
        var EMPTY: Number
        var LOADING: Number
    }
}

external var isConsoleInstance: Any

external interface `T$14` {
    var depth: Number?
        get() = definedExternally
        set(value) = definedExternally
    var indentLevel: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$15` {
    var showHidden: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var depth: Number?
        get() = definedExternally
        set(value) = definedExternally
    var colors: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var indentLevel: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external open class Console {
    open var indentLevel: Number
    open var log: (args: Any) -> Unit
    open var debug: (args: Any) -> Unit
    open var info: (args: Any) -> Unit
    open var dir: (obj: Any, options: `T$14`) -> Unit
    open var dirxml: (obj: Any, options: `T$15`) -> Unit
    open var warn: (args: Any) -> Unit
    open var error: (args: Any) -> Unit
    open var assert: (condition: Boolean, args: Any) -> Unit
    open var count: (label: String) -> Unit
    open var countReset: (label: String) -> Unit
    open var table: (data: Any, properties: Array<String>?) -> Unit
    open var time: (label: String) -> Unit
    open var timeLog: (label: String, args: Any) -> Unit
    open var timeEnd: (label: String) -> Unit
    open var group: (label: Any) -> Unit
    open var groupCollapsed: (label: Any) -> Unit
    open var groupEnd: () -> Unit
    open var clear: () -> Unit
    open var trace: (args: Any) -> Unit
}

external interface Crypto {
    var subtle: Any?
    fun <T> getRandomValues(array: T): T
}

@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
external interface FormData : DomIterable<String, dynamic /* File | String */> {
    fun append(name: String, value: String, fileName: String = definedExternally)
    fun append(name: String, value: Blob, fileName: String = definedExternally)
    fun delete(name: String)
    fun get(name: String): dynamic /* File? | String? */
    fun getAll(name: String): Array<dynamic /* File | String */>
    fun has(name: String): Boolean
    fun set(name: String, value: String, fileName: String = definedExternally)
    fun set(name: String, value: Blob, fileName: String = definedExternally)

    companion object {
        var prototype: FormData
    }
}

external interface Body {
    var body: ReadableStream<Uint8Array>?
    var bodyUsed: Boolean
    fun arrayBuffer(): Promise<ArrayBuffer>
    fun blob(): Promise<Blob>
    fun formData(): Promise<FormData>
    fun json(): Promise<Any>
    fun text(): Promise<String>
}

@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
external interface Headers : DomIterable<String, String> {
    fun append(name: String, value: String)
    fun delete(name: String)
    override fun entries(): IterableIterator<dynamic /* JsTuple<String, String> */>
    fun get(name: String): String?
    fun has(name: String): Boolean
    override fun keys(): IterableIterator<String>
    fun set(name: String, value: String)
    override fun values(): IterableIterator<String>
    fun forEach(callbackfn: (value: String, key: String, parent: Headers /* this */) -> Unit, thisArg: Any = definedExternally)

    companion object {
        var prototype: Headers
    }
}

external interface RequestInit {
    var body: dynamic /* Blob? | ArrayBufferView? | ArrayBuffer? | FormData? | URLSearchParams? | ReadableStream<Uint8Array>? | String? */
        get() = definedExternally
        set(value) = definedExternally
    var cache: String? /* "default" | "force-cache" | "no-cache" | "no-store" | "only-if-cached" | "reload" */
        get() = definedExternally
        set(value) = definedExternally
    var credentials: String? /* "include" | "omit" | "same-origin" */
        get() = definedExternally
        set(value) = definedExternally
    var headers: dynamic /* Headers? | Array<Array<String>>? | Record<String, String>? */
        get() = definedExternally
        set(value) = definedExternally
    var integrity: String?
        get() = definedExternally
        set(value) = definedExternally
    var keepalive: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var method: String?
        get() = definedExternally
        set(value) = definedExternally
    var mode: String? /* "cors" | "navigate" | "no-cors" | "same-origin" */
        get() = definedExternally
        set(value) = definedExternally
    var redirect: String? /* "error" | "follow" | "manual" */
        get() = definedExternally
        set(value) = definedExternally
    var referrer: String?
        get() = definedExternally
        set(value) = definedExternally
    var referrerPolicy: String? /* "" | "no-referrer" | "no-referrer-when-downgrade" | "origin" | "origin-when-cross-origin" | "same-origin" | "strict-origin" | "strict-origin-when-cross-origin" | "unsafe-url" */
        get() = definedExternally
        set(value) = definedExternally
    var signal: AbortSignal?
        get() = definedExternally
        set(value) = definedExternally
    var window: Any?
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
external interface Request : Body {
    var cache: String /* "default" | "force-cache" | "no-cache" | "no-store" | "only-if-cached" | "reload" */
    var credentials: String /* "include" | "omit" | "same-origin" */
    var destination: String /* "" | "audio" | "audioworklet" | "document" | "embed" | "font" | "image" | "manifest" | "object" | "paintworklet" | "report" | "script" | "sharedworker" | "style" | "track" | "video" | "worker" | "xslt" */
    var headers: Headers
    var integrity: String
    var isHistoryNavigation: Boolean
    var isReloadNavigation: Boolean
    var keepalive: Boolean
    var method: String
    var mode: String /* "cors" | "navigate" | "no-cors" | "same-origin" */
    var redirect: String /* "error" | "follow" | "manual" */
    var referrer: String
    var referrerPolicy: String /* "" | "no-referrer" | "no-referrer-when-downgrade" | "origin" | "origin-when-cross-origin" | "same-origin" | "strict-origin" | "strict-origin-when-cross-origin" | "unsafe-url" */
    var signal: AbortSignal
    var url: String
    fun clone(): Request

    companion object {
        var prototype: Request
    }
}

external interface ResponseInit {
    var headers: dynamic /* Headers? | Array<Array<String>>? | Record<String, String>? */
        get() = definedExternally
        set(value) = definedExternally
    var status: Number?
        get() = definedExternally
        set(value) = definedExternally
    var statusText: String?
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
external interface Response : Body {
    var headers: Headers
    var ok: Boolean
    var redirected: Boolean
    var status: Number
    var statusText: String
    var trailer: Promise<Headers>
    var type: String /* "basic" | "cors" | "default" | "error" | "opaque" | "opaqueredirect" */
    var url: String
    fun clone(): Response

    companion object {
        var prototype: Response
        fun error(): Response
        fun redirect(url: String, status: Number = definedExternally): Response
    }
}

external fun fetch(input: Request, init: RequestInit = definedExternally): Promise<Response>

external fun fetch(input: URL, init: RequestInit = definedExternally): Promise<Response>

external fun fetch(input: String, init: RequestInit = definedExternally): Promise<Response>

@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
external interface URLSearchParams {
    fun append(name: String, value: String)
    fun delete(name: String)
    fun getAll(name: String): Array<String>
    fun get(name: String): String?
    fun has(name: String): Boolean
    fun set(name: String, value: String)
    fun sort()
    fun forEach(callbackfn: (value: String, key: String, parent: URLSearchParams /* this */) -> Unit, thisArg: Any = definedExternally)
    fun keys(): IterableIterator<String>
    fun values(): IterableIterator<String>
    fun entries(): IterableIterator<dynamic /* JsTuple<String, String> */>
    override fun toString(): String

    companion object {
        var prototype: URLSearchParams
        override fun toString(): String
    }
}

@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
external interface URL {
    var hash: String
    var host: String
    var hostname: String
    var href: String
    override fun toString(): String
    var origin: String
    var password: String
    var pathname: String
    var port: String
    var protocol: String
    var search: String
    var searchParams: URLSearchParams
    var username: String
    fun toJSON(): String

    companion object {
        var prototype: URL
        fun createObjectURL(obj: Any): String
        fun revokeObjectURL(url: String)
    }
}

external interface MessageEventInit : EventInit {
    var data: Any?
        get() = definedExternally
        set(value) = definedExternally
    var origin: String?
        get() = definedExternally
        set(value) = definedExternally
    var lastEventId: String?
        get() = definedExternally
        set(value) = definedExternally
}

external open class MessageEvent(type: String, eventInitDict: MessageEventInit = definedExternally) : Event {
    open var data: Any
    open var origin: String
    open var lastEventId: String
}

external interface ErrorEventInit : EventInit {
    var message: String?
        get() = definedExternally
        set(value) = definedExternally
    var filename: String?
        get() = definedExternally
        set(value) = definedExternally
    var lineno: Number?
        get() = definedExternally
        set(value) = definedExternally
    var colno: Number?
        get() = definedExternally
        set(value) = definedExternally
    var error: Any?
        get() = definedExternally
        set(value) = definedExternally
}

external open class ErrorEvent(type: String, eventInitDict: ErrorEventInit = definedExternally) : Event {
    open var message: String
    open var filename: String
    open var lineno: Number
    open var colno: Number
    open var error: Any
}

external interface PostMessageOptions {
    var transfer: Array<Any>?
        get() = definedExternally
        set(value) = definedExternally
}

external interface ProgressEventInit : EventInit {
    var lengthComputable: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var loaded: Number?
        get() = definedExternally
        set(value) = definedExternally
    var total: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$16` {
    var type: String? /* "classic" | "module" */
        get() = definedExternally
        set(value) = definedExternally
    var name: String?
        get() = definedExternally
        set(value) = definedExternally
    var deno: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external open class Worker(specifier: String, options: `T$16` = definedExternally) : EventTarget {
    open var onerror: (e: ErrorEvent) -> Unit
    open var onmessage: (e: MessageEvent) -> Unit
    open var onmessageerror: (e: MessageEvent) -> Unit
    open fun postMessage(message: Any, transfer: Array<ArrayBuffer>)
    open fun postMessage(message: Any, options: PostMessageOptions = definedExternally)
    open fun terminate()
}

typealias PerformanceEntryList = Array<PerformanceEntry>

external var performance: Performance

external open class PerformanceEntry {
    open var duration: Number
    open var entryType: String
    open var name: String
    open var startTime: Number
    open fun toJSON(): Any
}

external open class PerformanceMark(name: String, options: PerformanceMarkOptions = definedExternally) : PerformanceEntry {
    open var detail: Any
    override var entryType: String /* "mark" */
}

external open class PerformanceMeasure : PerformanceEntry {
    open var detail: Any
    override var entryType: String /* "measure" */
}

@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
external interface ProgressEvent<T : EventTarget> : Event {
    var lengthComputable: Boolean
    var loaded: Number
    var total: Number

    companion object {
        var prototype: ProgressEvent__0
    }
}

external interface ProgressEvent__0 : ProgressEvent<EventTarget>

external interface CustomEventInit<T> : EventInit {
    var detail: T?
        get() = definedExternally
        set(value) = definedExternally
}

external open class CustomEvent<T>(typeArg: String, eventInitDict: CustomEventInit<T> = definedExternally) : Event {
    open var detail: T
}

external interface Window : EventTarget {
    var window: Window /* Window & Any */
    var self: Window /* Window & Any */
    var onload: ((self: Window, ev: Event) -> Any)?
    var onunload: ((self: Window, ev: Event) -> Any)?
    var close: () -> Unit
    var closed: Boolean
    var Deno: Any
}

external var window: Window /* Window & Any */

external var self: Window /* Window & Any */

external var onload: ((self: Window, ev: Event) -> Any)?

external var onunload: ((self: Window, ev: Event) -> Any)?
