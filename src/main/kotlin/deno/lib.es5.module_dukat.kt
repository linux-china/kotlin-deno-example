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
import Intl.DateTimeFormatOptions

external interface PropertyDescriptor {
    var configurable: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var enumerable: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var value: Any?
        get() = definedExternally
        set(value) = definedExternally
    var writable: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    val get: (() -> Any)?
        get() = definedExternally
    val set: ((v: Any) -> Unit)?
        get() = definedExternally
}

external interface PropertyDescriptorMap {
    @nativeGetter
    operator fun get(s: String): PropertyDescriptor?
    @nativeSetter
    operator fun set(s: String, value: PropertyDescriptor)
}

external interface Object {
    var constructor: Function
    override fun toString(): String
    fun toLocaleString(): String
    fun valueOf(): Object
    fun hasOwnProperty(v: String): Boolean
    fun hasOwnProperty(v: Number): Boolean
    fun hasOwnProperty(v: Any): Boolean
    fun isPrototypeOf(v: Object): Boolean
    fun propertyIsEnumerable(v: String): Boolean
    fun propertyIsEnumerable(v: Number): Boolean
    fun propertyIsEnumerable(v: Any): Boolean
}

external interface `T$17`<T> {
    @nativeGetter
    operator fun get(k: String): T?
    @nativeSetter
    operator fun set(k: String, value: T)
}

external interface `T$18` {
    @nativeGetter
    operator fun get(x: String): PropertyDescriptor?
    @nativeSetter
    operator fun set(x: String, value: PropertyDescriptor)
}

external interface ObjectConstructor {
    fun <T> fromEntries(entries: Iterable<Any>): `T$17`<T>
    fun fromEntries(entries: Iterable<Any>): Any
    fun <T> values(o: `T$17`<T>): Array<T>
    fun <T> values(o: ArrayLike<T>): Array<T>
    fun values(o: Any): Array<Any>
    fun <T> entries(o: `T$17`<T>): Array<dynamic /* JsTuple<String, T> */>
    fun <T> entries(o: ArrayLike<T>): Array<dynamic /* JsTuple<String, T> */>
    fun entries(o: Any): Array<dynamic /* JsTuple<String, Any> */>
    fun <T> getOwnPropertyDescriptors(o: T): Any /* Any & `T$18` */
    fun <T, U> assign(target: T, source: U): T /* T & U */
    fun <T, U, V> assign(target: T, source1: U, source2: V): T /* T & U & V */
    fun <T, U, V, W> assign(target: T, source1: U, source2: V, source3: W): T /* T & U & V & W */
    fun assign(target: Any?, vararg sources: Any): Any
    fun getOwnPropertySymbols(o: Any): Array<Any>
    fun keys(o: Any): Array<String>
    fun `is`(value1: Any, value2: Any): Boolean
    fun setPrototypeOf(o: Any, proto: Any?): Any
    @nativeInvoke
    operator fun invoke(): Any
    @nativeInvoke
    operator fun invoke(value: Any): Any
    var prototype: Object
    fun getPrototypeOf(o: Any): Any
    fun getOwnPropertyDescriptor(o: Any, p: String): PropertyDescriptor?
    fun getOwnPropertyDescriptor(o: Any, p: Number): PropertyDescriptor?
    fun getOwnPropertyDescriptor(o: Any, p: Any): PropertyDescriptor?
    fun getOwnPropertyNames(o: Any): Array<String>
    fun create(o: Any?): Any
    fun create(o: Any?, properties: PropertyDescriptorMap /* PropertyDescriptorMap & ThisType<Any> */): Any
    fun defineProperty(o: Any, p: String, attributes: PropertyDescriptor /* PropertyDescriptor & ThisType<Any> */): Any
    fun defineProperty(o: Any, p: Number, attributes: PropertyDescriptor /* PropertyDescriptor & ThisType<Any> */): Any
    fun defineProperty(o: Any, p: Any, attributes: PropertyDescriptor /* PropertyDescriptor & ThisType<Any> */): Any
    fun defineProperties(o: Any, properties: PropertyDescriptorMap /* PropertyDescriptorMap & ThisType<Any> */): Any
    fun <T> seal(o: T): T
    fun <T> freeze(a: Array<T>): Any
    fun <T : Function> freeze(f: T): dynamic
    fun <T> preventExtensions(o: T): T
    fun isSealed(o: Any): Boolean
    fun isFrozen(o: Any): Boolean
    fun isExtensible(o: Any): Boolean
    fun keys(o: Any?): Array<String>
}

external interface Function {
    var name: String
    fun apply(thisArg: Any, argArray: Any = definedExternally): Any
    fun call(thisArg: Any, vararg argArray: Any): Any
    fun bind(thisArg: Any, vararg argArray: Any): Any
    override fun toString(): String
    var prototype: Any
    var length: Number
    var arguments: Any
    var caller: Function
}

external interface FunctionConstructor {
    @nativeInvoke
    operator fun invoke(vararg args: String): Function
    var prototype: Function
}

external interface ImportMeta {
    var url: String
    var main: Boolean
}

external interface Date {
    fun toLocaleString(locales: String = definedExternally, options: DateTimeFormatOptions = definedExternally): String
    fun toLocaleString(locales: Array<String> = definedExternally, options: DateTimeFormatOptions = definedExternally): String
    fun toLocaleDateString(locales: String = definedExternally, options: DateTimeFormatOptions = definedExternally): String
    fun toLocaleDateString(locales: Array<String> = definedExternally, options: DateTimeFormatOptions = definedExternally): String
    fun toLocaleTimeString(locales: String = definedExternally, options: DateTimeFormatOptions = definedExternally): String
    fun toLocaleTimeString(locales: Array<String> = definedExternally, options: DateTimeFormatOptions = definedExternally): String
    override fun toString(): String
    fun toDateString(): String
    fun toTimeString(): String
    fun toLocaleString(): String
    fun toLocaleDateString(): String
    fun toLocaleTimeString(): String
    fun valueOf(): Number
    fun getTime(): Number
    fun getFullYear(): Number
    fun getUTCFullYear(): Number
    fun getMonth(): Number
    fun getUTCMonth(): Number
    fun getDate(): Number
    fun getUTCDate(): Number
    fun getDay(): Number
    fun getUTCDay(): Number
    fun getHours(): Number
    fun getUTCHours(): Number
    fun getMinutes(): Number
    fun getUTCMinutes(): Number
    fun getSeconds(): Number
    fun getUTCSeconds(): Number
    fun getMilliseconds(): Number
    fun getUTCMilliseconds(): Number
    fun getTimezoneOffset(): Number
    fun setTime(time: Number): Number
    fun setMilliseconds(ms: Number): Number
    fun setUTCMilliseconds(ms: Number): Number
    fun setSeconds(sec: Number, ms: Number = definedExternally): Number
    fun setUTCSeconds(sec: Number, ms: Number = definedExternally): Number
    fun setMinutes(min: Number, sec: Number = definedExternally, ms: Number = definedExternally): Number
    fun setUTCMinutes(min: Number, sec: Number = definedExternally, ms: Number = definedExternally): Number
    fun setHours(hours: Number, min: Number = definedExternally, sec: Number = definedExternally, ms: Number = definedExternally): Number
    fun setUTCHours(hours: Number, min: Number = definedExternally, sec: Number = definedExternally, ms: Number = definedExternally): Number
    fun setDate(date: Number): Number
    fun setUTCDate(date: Number): Number
    fun setMonth(month: Number, date: Number = definedExternally): Number
    fun setUTCMonth(month: Number, date: Number = definedExternally): Number
    fun setFullYear(year: Number, month: Number = definedExternally, date: Number = definedExternally): Number
    fun setUTCFullYear(year: Number, month: Number = definedExternally, date: Number = definedExternally): Number
    fun toUTCString(): String
    fun toISOString(): String
    fun toJSON(key: Any = definedExternally): String
}

external interface DateConstructor {
    @nativeInvoke
    operator fun invoke(): String
    var prototype: Date
    fun parse(s: String): Number
    fun UTC(year: Number, month: Number, date: Number = definedExternally, hours: Number = definedExternally, minutes: Number = definedExternally, seconds: Number = definedExternally, ms: Number = definedExternally): Number
    fun now(): Number
}

external interface Error {
    var name: String
    var message: String
    var stack: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface ErrorConstructor {
    fun captureStackTrace(error: Object, constructor: Function = definedExternally)
    @nativeInvoke
    operator fun invoke(message: String = definedExternally): Error
    var prototype: Error
}

external interface ReadonlyArray<T> {
    fun <U, This> flatMap(callback: (self: This, value: T, index: Number, array: Array<T>) -> dynamic, thisArg: This = definedExternally): Array<U>
    fun <A, D : Number> flat(depth: D = definedExternally): Array<FlatArray<A, D>>
    fun includes(searchElement: T, fromIndex: Number = definedExternally): Boolean
    fun entries(): IterableIterator<dynamic /* JsTuple<Number, T> */>
    fun keys(): IterableIterator<Number>
    fun values(): IterableIterator<T>
    fun <S : T> find(predicate: (self: Unit, value: T, index: Number, obj: Any) -> Boolean, thisArg: Any = definedExternally): S?
    fun find(predicate: (value: T, index: Number, obj: Any) -> Any, thisArg: Any = definedExternally): T?
    fun findIndex(predicate: (value: T, index: Number, obj: Any) -> Any, thisArg: Any = definedExternally): Number
    var length: Number
    override fun toString(): String
    fun toLocaleString(): String
    fun concat(vararg items: ConcatArray<T>): Array<T>
    fun concat(vararg items: dynamic /* T | ConcatArray<T> */): Array<T>
    fun join(separator: String = definedExternally): String
    fun slice(start: Number = definedExternally, end: Number = definedExternally): Array<T>
    fun indexOf(searchElement: T, fromIndex: Number = definedExternally): Number
    fun lastIndexOf(searchElement: T, fromIndex: Number = definedExternally): Number
    fun every(callbackfn: (value: T, index: Number, array: Any) -> Any, thisArg: Any = definedExternally): Boolean
    fun some(callbackfn: (value: T, index: Number, array: Any) -> Any, thisArg: Any = definedExternally): Boolean
    fun forEach(callbackfn: (value: T, index: Number, array: Any) -> Unit, thisArg: Any = definedExternally)
    fun <U> map(callbackfn: (value: T, index: Number, array: Any) -> U, thisArg: Any = definedExternally): Array<U>
    fun <S : T> filter(callbackfn: (value: T, index: Number, array: Any) -> Boolean, thisArg: Any = definedExternally): Array<S>
    fun filter(callbackfn: (value: T, index: Number, array: Any) -> Any, thisArg: Any = definedExternally): Array<T>
    fun reduce(callbackfn: (previousValue: T, currentValue: T, currentIndex: Number, array: Any) -> T): T
    fun reduce(callbackfn: (previousValue: T, currentValue: T, currentIndex: Number, array: Any) -> T, initialValue: T): T
    fun <U> reduce(callbackfn: (previousValue: U, currentValue: T, currentIndex: Number, array: Any) -> U, initialValue: U): U
    fun reduceRight(callbackfn: (previousValue: T, currentValue: T, currentIndex: Number, array: Any) -> T): T
    fun reduceRight(callbackfn: (previousValue: T, currentValue: T, currentIndex: Number, array: Any) -> T, initialValue: T): T
    fun <U> reduceRight(callbackfn: (previousValue: U, currentValue: T, currentIndex: Number, array: Any) -> U, initialValue: U): U
    @nativeGetter
    operator fun get(n: Number): T?
    @nativeSetter
    operator fun set(n: Number, value: T)
}

external interface ConcatArray<T> {
    var length: Number
    @nativeGetter
    operator fun get(n: Number): T?
    @nativeSetter
    operator fun set(n: Number, value: T)
    fun join(separator: String = definedExternally): String
    fun slice(start: Number = definedExternally, end: Number = definedExternally): Array<T>
}

external interface Array<T> {
    fun <U, This> flatMap(callback: (self: This, value: T, index: Number, array: Array<T>) -> dynamic, thisArg: This = definedExternally): Array<U>
    fun <A, D : Number> flat(depth: D = definedExternally): Array<FlatArray<A, D>>
    fun includes(searchElement: T, fromIndex: Number = definedExternally): Boolean
    fun entries(): IterableIterator<dynamic /* JsTuple<Number, T> */>
    fun keys(): IterableIterator<Number>
    fun values(): IterableIterator<T>
    fun <S : T> find(predicate: (self: Unit, value: T, index: Number, obj: Array<T>) -> Boolean, thisArg: Any = definedExternally): S?
    fun find(predicate: (value: T, index: Number, obj: Array<T>) -> Any, thisArg: Any = definedExternally): T?
    fun findIndex(predicate: (value: T, index: Number, obj: Array<T>) -> Any, thisArg: Any = definedExternally): Number
    fun fill(value: T, start: Number = definedExternally, end: Number = definedExternally): Array<T> /* this */
    fun copyWithin(target: Number, start: Number, end: Number = definedExternally): Array<T> /* this */
    var length: Number
    override fun toString(): String
    fun toLocaleString(): String
    fun pop(): T?
    fun push(vararg items: T): Number
    fun concat(vararg items: ConcatArray<T>): Array<T>
    fun concat(vararg items: dynamic /* T | ConcatArray<T> */): Array<T>
    fun join(separator: String = definedExternally): String
    fun reverse(): Array<T>
    fun shift(): T?
    fun slice(start: Number = definedExternally, end: Number = definedExternally): Array<T>
    fun sort(compareFn: (a: T, b: T) -> Number = definedExternally): Array<T> /* this */
    fun splice(start: Number, deleteCount: Number = definedExternally): Array<T>
    fun splice(start: Number, deleteCount: Number, vararg items: T): Array<T>
    fun unshift(vararg items: T): Number
    fun indexOf(searchElement: T, fromIndex: Number = definedExternally): Number
    fun lastIndexOf(searchElement: T, fromIndex: Number = definedExternally): Number
    fun every(callbackfn: (value: T, index: Number, array: Array<T>) -> Any, thisArg: Any = definedExternally): Boolean
    fun some(callbackfn: (value: T, index: Number, array: Array<T>) -> Any, thisArg: Any = definedExternally): Boolean
    fun forEach(callbackfn: (value: T, index: Number, array: Array<T>) -> Unit, thisArg: Any = definedExternally)
    fun <U> map(callbackfn: (value: T, index: Number, array: Array<T>) -> U, thisArg: Any = definedExternally): Array<U>
    fun <S : T> filter(callbackfn: (value: T, index: Number, array: Array<T>) -> Boolean, thisArg: Any = definedExternally): Array<S>
    fun filter(callbackfn: (value: T, index: Number, array: Array<T>) -> Any, thisArg: Any = definedExternally): Array<T>
    fun reduce(callbackfn: (previousValue: T, currentValue: T, currentIndex: Number, array: Array<T>) -> T): T
    fun reduce(callbackfn: (previousValue: T, currentValue: T, currentIndex: Number, array: Array<T>) -> T, initialValue: T): T
    fun <U> reduce(callbackfn: (previousValue: U, currentValue: T, currentIndex: Number, array: Array<T>) -> U, initialValue: U): U
    fun reduceRight(callbackfn: (previousValue: T, currentValue: T, currentIndex: Number, array: Array<T>) -> T): T
    fun reduceRight(callbackfn: (previousValue: T, currentValue: T, currentIndex: Number, array: Array<T>) -> T, initialValue: T): T
    fun <U> reduceRight(callbackfn: (previousValue: U, currentValue: T, currentIndex: Number, array: Array<T>) -> U, initialValue: U): U
    @nativeGetter
    operator fun get(n: Number): T?
    @nativeSetter
    operator fun set(n: Number, value: T)
}

external interface ArrayConstructor {
    fun <T> from(iterable: Iterable<T>): Array<T>
    fun <T> from(iterable: ArrayLike<T>): Array<T>
    fun <T, U> from(iterable: Iterable<T>, mapfn: (v: T, k: Number) -> U, thisArg: Any = definedExternally): Array<U>
    fun <T, U> from(iterable: ArrayLike<T>, mapfn: (v: T, k: Number) -> U, thisArg: Any = definedExternally): Array<U>
    fun <T> of(vararg items: T): Array<T>
    @nativeInvoke
    operator fun invoke(arrayLength: Number = definedExternally): Array<Any>
    @nativeInvoke
    operator fun <T> invoke(arrayLength: Number): Array<T>
    @nativeInvoke
    operator fun <T> invoke(vararg items: T): Array<T>
    fun isArray(arg: Any): Boolean
    var prototype: Array<Any>
}

external interface TypedPropertyDescriptor<T> {
    var enumerable: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var configurable: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var writable: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var value: T?
        get() = definedExternally
        set(value) = definedExternally
    var get: (() -> T)?
        get() = definedExternally
        set(value) = definedExternally
    var set: ((value: T) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
}

external interface PromiseLike<T> {
    fun then(onfulfilled: ((value: T) -> dynamic)? = definedExternally, onrejected: ((reason: Any) -> dynamic)? = definedExternally): PromiseLike<dynamic /* TResult1 | TResult2 */>
}

external interface Promise<T> {
    fun finally(onfinally: (() -> Unit)? = definedExternally): Promise<T>
    fun then(onfulfilled: ((value: T) -> dynamic)? = definedExternally, onrejected: ((reason: Any) -> dynamic)? = definedExternally): Promise<dynamic /* TResult1 | TResult2 */>
    fun catch(onrejected: ((reason: Any) -> dynamic)? = definedExternally): Promise<dynamic /* T | TResult */>
}

external interface ArrayLike<T> {
    var length: Number
    @nativeGetter
    operator fun get(n: Number): T?
    @nativeSetter
    operator fun set(n: Number, value: T)
}

typealias Partial<T> = Any

typealias Readonly<T> = Any

typealias Record<K, T> = Any

external interface ThisType<T>

external interface ArrayBuffer {
    var byteLength: Number
    fun slice(begin: Number, end: Number = definedExternally): ArrayBuffer
}

external interface ArrayBufferTypes {
    var SharedArrayBuffer: SharedArrayBuffer
    var ArrayBuffer: ArrayBuffer
}

typealias ArrayBufferLike = Any

external interface ArrayBufferConstructor {
    var prototype: ArrayBuffer
    fun isView(arg: Any): Boolean
}

external interface ArrayBufferView {
    var buffer: ArrayBufferLike
    var byteLength: Number
    var byteOffset: Number
}

external interface DataView {
    fun getBigInt64(byteOffset: Number, littleEndian: Boolean = definedExternally): Any
    fun getBigUint64(byteOffset: Number, littleEndian: Boolean = definedExternally): Any
    fun setBigInt64(byteOffset: Number, value: Any, littleEndian: Boolean = definedExternally)
    fun setBigUint64(byteOffset: Number, value: Any, littleEndian: Boolean = definedExternally)
    var buffer: ArrayBuffer
    var byteLength: Number
    var byteOffset: Number
    fun getFloat32(byteOffset: Number, littleEndian: Boolean = definedExternally): Number
    fun getFloat64(byteOffset: Number, littleEndian: Boolean = definedExternally): Number
    fun getInt8(byteOffset: Number): Number
    fun getInt16(byteOffset: Number, littleEndian: Boolean = definedExternally): Number
    fun getInt32(byteOffset: Number, littleEndian: Boolean = definedExternally): Number
    fun getUint8(byteOffset: Number): Number
    fun getUint16(byteOffset: Number, littleEndian: Boolean = definedExternally): Number
    fun getUint32(byteOffset: Number, littleEndian: Boolean = definedExternally): Number
    fun setFloat32(byteOffset: Number, value: Number, littleEndian: Boolean = definedExternally)
    fun setFloat64(byteOffset: Number, value: Number, littleEndian: Boolean = definedExternally)
    fun setInt8(byteOffset: Number, value: Number)
    fun setInt16(byteOffset: Number, value: Number, littleEndian: Boolean = definedExternally)
    fun setInt32(byteOffset: Number, value: Number, littleEndian: Boolean = definedExternally)
    fun setUint8(byteOffset: Number, value: Number)
    fun setUint16(byteOffset: Number, value: Number, littleEndian: Boolean = definedExternally)
    fun setUint32(byteOffset: Number, value: Number, littleEndian: Boolean = definedExternally)
}

external interface DataViewConstructor

external interface Int8Array {
    fun includes(searchElement: Number, fromIndex: Number = definedExternally): Boolean
    fun entries(): IterableIterator<dynamic /* JsTuple<Number, Number> */>
    fun keys(): IterableIterator<Number>
    fun values(): IterableIterator<Number>
    var BYTES_PER_ELEMENT: Number
    var buffer: ArrayBufferLike
    var byteLength: Number
    var byteOffset: Number
    fun copyWithin(target: Number, start: Number, end: Number = definedExternally): Int8Array /* this */
    fun every(callbackfn: (value: Number, index: Number, array: Int8Array) -> Any, thisArg: Any = definedExternally): Boolean
    fun fill(value: Number, start: Number = definedExternally, end: Number = definedExternally): Int8Array /* this */
    fun filter(callbackfn: (value: Number, index: Number, array: Int8Array) -> Any, thisArg: Any = definedExternally): Int8Array
    fun find(predicate: (value: Number, index: Number, obj: Int8Array) -> Boolean, thisArg: Any = definedExternally): Number?
    fun findIndex(predicate: (value: Number, index: Number, obj: Int8Array) -> Boolean, thisArg: Any = definedExternally): Number
    fun forEach(callbackfn: (value: Number, index: Number, array: Int8Array) -> Unit, thisArg: Any = definedExternally)
    fun indexOf(searchElement: Number, fromIndex: Number = definedExternally): Number
    fun join(separator: String = definedExternally): String
    fun lastIndexOf(searchElement: Number, fromIndex: Number = definedExternally): Number
    var length: Number
    fun map(callbackfn: (value: Number, index: Number, array: Int8Array) -> Number, thisArg: Any = definedExternally): Int8Array
    fun reduce(callbackfn: (previousValue: Number, currentValue: Number, currentIndex: Number, array: Int8Array) -> Number): Number
    fun reduce(callbackfn: (previousValue: Number, currentValue: Number, currentIndex: Number, array: Int8Array) -> Number, initialValue: Number): Number
    fun <U> reduce(callbackfn: (previousValue: U, currentValue: Number, currentIndex: Number, array: Int8Array) -> U, initialValue: U): U
    fun reduceRight(callbackfn: (previousValue: Number, currentValue: Number, currentIndex: Number, array: Int8Array) -> Number): Number
    fun reduceRight(callbackfn: (previousValue: Number, currentValue: Number, currentIndex: Number, array: Int8Array) -> Number, initialValue: Number): Number
    fun <U> reduceRight(callbackfn: (previousValue: U, currentValue: Number, currentIndex: Number, array: Int8Array) -> U, initialValue: U): U
    fun reverse(): Int8Array
    fun set(array: ArrayLike<Number>, offset: Number = definedExternally)
    fun slice(start: Number = definedExternally, end: Number = definedExternally): Int8Array
    fun some(callbackfn: (value: Number, index: Number, array: Int8Array) -> Any, thisArg: Any = definedExternally): Boolean
    fun sort(compareFn: (a: Number, b: Number) -> Number = definedExternally): Int8Array /* this */
    fun subarray(begin: Number = definedExternally, end: Number = definedExternally): Int8Array
    fun toLocaleString(): String
    override fun toString(): String
    fun valueOf(): Int8Array
    @nativeGetter
    operator fun get(index: Number): Number?
    @nativeSetter
    operator fun set(index: Number, value: Number)
}

external interface Int8ArrayConstructor {
    fun from(arrayLike: Iterable<Number>, mapfn: (v: Number, k: Number) -> Number = definedExternally, thisArg: Any = definedExternally): Int8Array
    var prototype: Int8Array
    var BYTES_PER_ELEMENT: Number
    fun of(vararg items: Number): Int8Array
    fun from(arrayLike: ArrayLike<Number>): Int8Array
    fun <T> from(arrayLike: ArrayLike<T>, mapfn: (v: T, k: Number) -> Number, thisArg: Any = definedExternally): Int8Array
}

external interface Uint8Array {
    fun includes(searchElement: Number, fromIndex: Number = definedExternally): Boolean
    fun entries(): IterableIterator<dynamic /* JsTuple<Number, Number> */>
    fun keys(): IterableIterator<Number>
    fun values(): IterableIterator<Number>
    var BYTES_PER_ELEMENT: Number
    var buffer: ArrayBufferLike
    var byteLength: Number
    var byteOffset: Number
    fun copyWithin(target: Number, start: Number, end: Number = definedExternally): Uint8Array /* this */
    fun every(callbackfn: (value: Number, index: Number, array: Uint8Array) -> Any, thisArg: Any = definedExternally): Boolean
    fun fill(value: Number, start: Number = definedExternally, end: Number = definedExternally): Uint8Array /* this */
    fun filter(callbackfn: (value: Number, index: Number, array: Uint8Array) -> Any, thisArg: Any = definedExternally): Uint8Array
    fun find(predicate: (value: Number, index: Number, obj: Uint8Array) -> Boolean, thisArg: Any = definedExternally): Number?
    fun findIndex(predicate: (value: Number, index: Number, obj: Uint8Array) -> Boolean, thisArg: Any = definedExternally): Number
    fun forEach(callbackfn: (value: Number, index: Number, array: Uint8Array) -> Unit, thisArg: Any = definedExternally)
    fun indexOf(searchElement: Number, fromIndex: Number = definedExternally): Number
    fun join(separator: String = definedExternally): String
    fun lastIndexOf(searchElement: Number, fromIndex: Number = definedExternally): Number
    var length: Number
    fun map(callbackfn: (value: Number, index: Number, array: Uint8Array) -> Number, thisArg: Any = definedExternally): Uint8Array
    fun reduce(callbackfn: (previousValue: Number, currentValue: Number, currentIndex: Number, array: Uint8Array) -> Number): Number
    fun reduce(callbackfn: (previousValue: Number, currentValue: Number, currentIndex: Number, array: Uint8Array) -> Number, initialValue: Number): Number
    fun <U> reduce(callbackfn: (previousValue: U, currentValue: Number, currentIndex: Number, array: Uint8Array) -> U, initialValue: U): U
    fun reduceRight(callbackfn: (previousValue: Number, currentValue: Number, currentIndex: Number, array: Uint8Array) -> Number): Number
    fun reduceRight(callbackfn: (previousValue: Number, currentValue: Number, currentIndex: Number, array: Uint8Array) -> Number, initialValue: Number): Number
    fun <U> reduceRight(callbackfn: (previousValue: U, currentValue: Number, currentIndex: Number, array: Uint8Array) -> U, initialValue: U): U
    fun reverse(): Uint8Array
    fun set(array: ArrayLike<Number>, offset: Number = definedExternally)
    fun slice(start: Number = definedExternally, end: Number = definedExternally): Uint8Array
    fun some(callbackfn: (value: Number, index: Number, array: Uint8Array) -> Any, thisArg: Any = definedExternally): Boolean
    fun sort(compareFn: (a: Number, b: Number) -> Number = definedExternally): Uint8Array /* this */
    fun subarray(begin: Number = definedExternally, end: Number = definedExternally): Uint8Array
    fun toLocaleString(): String
    override fun toString(): String
    fun valueOf(): Uint8Array
    @nativeGetter
    operator fun get(index: Number): Number?
    @nativeSetter
    operator fun set(index: Number, value: Number)
}

external interface Uint8ArrayConstructor {
    fun from(arrayLike: Iterable<Number>, mapfn: (v: Number, k: Number) -> Number = definedExternally, thisArg: Any = definedExternally): Uint8Array
    var prototype: Uint8Array
    var BYTES_PER_ELEMENT: Number
    fun of(vararg items: Number): Uint8Array
    fun from(arrayLike: ArrayLike<Number>): Uint8Array
    fun <T> from(arrayLike: ArrayLike<T>, mapfn: (v: T, k: Number) -> Number, thisArg: Any = definedExternally): Uint8Array
}

external interface Uint8ClampedArray {
    fun includes(searchElement: Number, fromIndex: Number = definedExternally): Boolean
    fun entries(): IterableIterator<dynamic /* JsTuple<Number, Number> */>
    fun keys(): IterableIterator<Number>
    fun values(): IterableIterator<Number>
    var BYTES_PER_ELEMENT: Number
    var buffer: ArrayBufferLike
    var byteLength: Number
    var byteOffset: Number
    fun copyWithin(target: Number, start: Number, end: Number = definedExternally): Uint8ClampedArray /* this */
    fun every(callbackfn: (value: Number, index: Number, array: Uint8ClampedArray) -> Any, thisArg: Any = definedExternally): Boolean
    fun fill(value: Number, start: Number = definedExternally, end: Number = definedExternally): Uint8ClampedArray /* this */
    fun filter(callbackfn: (value: Number, index: Number, array: Uint8ClampedArray) -> Any, thisArg: Any = definedExternally): Uint8ClampedArray
    fun find(predicate: (value: Number, index: Number, obj: Uint8ClampedArray) -> Boolean, thisArg: Any = definedExternally): Number?
    fun findIndex(predicate: (value: Number, index: Number, obj: Uint8ClampedArray) -> Boolean, thisArg: Any = definedExternally): Number
    fun forEach(callbackfn: (value: Number, index: Number, array: Uint8ClampedArray) -> Unit, thisArg: Any = definedExternally)
    fun indexOf(searchElement: Number, fromIndex: Number = definedExternally): Number
    fun join(separator: String = definedExternally): String
    fun lastIndexOf(searchElement: Number, fromIndex: Number = definedExternally): Number
    var length: Number
    fun map(callbackfn: (value: Number, index: Number, array: Uint8ClampedArray) -> Number, thisArg: Any = definedExternally): Uint8ClampedArray
    fun reduce(callbackfn: (previousValue: Number, currentValue: Number, currentIndex: Number, array: Uint8ClampedArray) -> Number): Number
    fun reduce(callbackfn: (previousValue: Number, currentValue: Number, currentIndex: Number, array: Uint8ClampedArray) -> Number, initialValue: Number): Number
    fun <U> reduce(callbackfn: (previousValue: U, currentValue: Number, currentIndex: Number, array: Uint8ClampedArray) -> U, initialValue: U): U
    fun reduceRight(callbackfn: (previousValue: Number, currentValue: Number, currentIndex: Number, array: Uint8ClampedArray) -> Number): Number
    fun reduceRight(callbackfn: (previousValue: Number, currentValue: Number, currentIndex: Number, array: Uint8ClampedArray) -> Number, initialValue: Number): Number
    fun <U> reduceRight(callbackfn: (previousValue: U, currentValue: Number, currentIndex: Number, array: Uint8ClampedArray) -> U, initialValue: U): U
    fun reverse(): Uint8ClampedArray
    fun set(array: ArrayLike<Number>, offset: Number = definedExternally)
    fun slice(start: Number = definedExternally, end: Number = definedExternally): Uint8ClampedArray
    fun some(callbackfn: (value: Number, index: Number, array: Uint8ClampedArray) -> Any, thisArg: Any = definedExternally): Boolean
    fun sort(compareFn: (a: Number, b: Number) -> Number = definedExternally): Uint8ClampedArray /* this */
    fun subarray(begin: Number = definedExternally, end: Number = definedExternally): Uint8ClampedArray
    fun toLocaleString(): String
    override fun toString(): String
    fun valueOf(): Uint8ClampedArray
    @nativeGetter
    operator fun get(index: Number): Number?
    @nativeSetter
    operator fun set(index: Number, value: Number)
}

external interface Uint8ClampedArrayConstructor {
    fun from(arrayLike: Iterable<Number>, mapfn: (v: Number, k: Number) -> Number = definedExternally, thisArg: Any = definedExternally): Uint8ClampedArray
    var prototype: Uint8ClampedArray
    var BYTES_PER_ELEMENT: Number
    fun of(vararg items: Number): Uint8ClampedArray
    fun from(arrayLike: ArrayLike<Number>): Uint8ClampedArray
    fun <T> from(arrayLike: ArrayLike<T>, mapfn: (v: T, k: Number) -> Number, thisArg: Any = definedExternally): Uint8ClampedArray
}

external interface Int16Array {
    fun includes(searchElement: Number, fromIndex: Number = definedExternally): Boolean
    fun entries(): IterableIterator<dynamic /* JsTuple<Number, Number> */>
    fun keys(): IterableIterator<Number>
    fun values(): IterableIterator<Number>
    var BYTES_PER_ELEMENT: Number
    var buffer: ArrayBufferLike
    var byteLength: Number
    var byteOffset: Number
    fun copyWithin(target: Number, start: Number, end: Number = definedExternally): Int16Array /* this */
    fun every(callbackfn: (value: Number, index: Number, array: Int16Array) -> Any, thisArg: Any = definedExternally): Boolean
    fun fill(value: Number, start: Number = definedExternally, end: Number = definedExternally): Int16Array /* this */
    fun filter(callbackfn: (value: Number, index: Number, array: Int16Array) -> Any, thisArg: Any = definedExternally): Int16Array
    fun find(predicate: (value: Number, index: Number, obj: Int16Array) -> Boolean, thisArg: Any = definedExternally): Number?
    fun findIndex(predicate: (value: Number, index: Number, obj: Int16Array) -> Boolean, thisArg: Any = definedExternally): Number
    fun forEach(callbackfn: (value: Number, index: Number, array: Int16Array) -> Unit, thisArg: Any = definedExternally)
    fun indexOf(searchElement: Number, fromIndex: Number = definedExternally): Number
    fun join(separator: String = definedExternally): String
    fun lastIndexOf(searchElement: Number, fromIndex: Number = definedExternally): Number
    var length: Number
    fun map(callbackfn: (value: Number, index: Number, array: Int16Array) -> Number, thisArg: Any = definedExternally): Int16Array
    fun reduce(callbackfn: (previousValue: Number, currentValue: Number, currentIndex: Number, array: Int16Array) -> Number): Number
    fun reduce(callbackfn: (previousValue: Number, currentValue: Number, currentIndex: Number, array: Int16Array) -> Number, initialValue: Number): Number
    fun <U> reduce(callbackfn: (previousValue: U, currentValue: Number, currentIndex: Number, array: Int16Array) -> U, initialValue: U): U
    fun reduceRight(callbackfn: (previousValue: Number, currentValue: Number, currentIndex: Number, array: Int16Array) -> Number): Number
    fun reduceRight(callbackfn: (previousValue: Number, currentValue: Number, currentIndex: Number, array: Int16Array) -> Number, initialValue: Number): Number
    fun <U> reduceRight(callbackfn: (previousValue: U, currentValue: Number, currentIndex: Number, array: Int16Array) -> U, initialValue: U): U
    fun reverse(): Int16Array
    fun set(array: ArrayLike<Number>, offset: Number = definedExternally)
    fun slice(start: Number = definedExternally, end: Number = definedExternally): Int16Array
    fun some(callbackfn: (value: Number, index: Number, array: Int16Array) -> Any, thisArg: Any = definedExternally): Boolean
    fun sort(compareFn: (a: Number, b: Number) -> Number = definedExternally): Int16Array /* this */
    fun subarray(begin: Number = definedExternally, end: Number = definedExternally): Int16Array
    fun toLocaleString(): String
    override fun toString(): String
    fun valueOf(): Int16Array
    @nativeGetter
    operator fun get(index: Number): Number?
    @nativeSetter
    operator fun set(index: Number, value: Number)
}

external interface Int16ArrayConstructor {
    fun from(arrayLike: Iterable<Number>, mapfn: (v: Number, k: Number) -> Number = definedExternally, thisArg: Any = definedExternally): Int16Array
    var prototype: Int16Array
    var BYTES_PER_ELEMENT: Number
    fun of(vararg items: Number): Int16Array
    fun from(arrayLike: ArrayLike<Number>): Int16Array
    fun <T> from(arrayLike: ArrayLike<T>, mapfn: (v: T, k: Number) -> Number, thisArg: Any = definedExternally): Int16Array
}

external interface Uint16Array {
    fun includes(searchElement: Number, fromIndex: Number = definedExternally): Boolean
    fun entries(): IterableIterator<dynamic /* JsTuple<Number, Number> */>
    fun keys(): IterableIterator<Number>
    fun values(): IterableIterator<Number>
    var BYTES_PER_ELEMENT: Number
    var buffer: ArrayBufferLike
    var byteLength: Number
    var byteOffset: Number
    fun copyWithin(target: Number, start: Number, end: Number = definedExternally): Uint16Array /* this */
    fun every(callbackfn: (value: Number, index: Number, array: Uint16Array) -> Any, thisArg: Any = definedExternally): Boolean
    fun fill(value: Number, start: Number = definedExternally, end: Number = definedExternally): Uint16Array /* this */
    fun filter(callbackfn: (value: Number, index: Number, array: Uint16Array) -> Any, thisArg: Any = definedExternally): Uint16Array
    fun find(predicate: (value: Number, index: Number, obj: Uint16Array) -> Boolean, thisArg: Any = definedExternally): Number?
    fun findIndex(predicate: (value: Number, index: Number, obj: Uint16Array) -> Boolean, thisArg: Any = definedExternally): Number
    fun forEach(callbackfn: (value: Number, index: Number, array: Uint16Array) -> Unit, thisArg: Any = definedExternally)
    fun indexOf(searchElement: Number, fromIndex: Number = definedExternally): Number
    fun join(separator: String = definedExternally): String
    fun lastIndexOf(searchElement: Number, fromIndex: Number = definedExternally): Number
    var length: Number
    fun map(callbackfn: (value: Number, index: Number, array: Uint16Array) -> Number, thisArg: Any = definedExternally): Uint16Array
    fun reduce(callbackfn: (previousValue: Number, currentValue: Number, currentIndex: Number, array: Uint16Array) -> Number): Number
    fun reduce(callbackfn: (previousValue: Number, currentValue: Number, currentIndex: Number, array: Uint16Array) -> Number, initialValue: Number): Number
    fun <U> reduce(callbackfn: (previousValue: U, currentValue: Number, currentIndex: Number, array: Uint16Array) -> U, initialValue: U): U
    fun reduceRight(callbackfn: (previousValue: Number, currentValue: Number, currentIndex: Number, array: Uint16Array) -> Number): Number
    fun reduceRight(callbackfn: (previousValue: Number, currentValue: Number, currentIndex: Number, array: Uint16Array) -> Number, initialValue: Number): Number
    fun <U> reduceRight(callbackfn: (previousValue: U, currentValue: Number, currentIndex: Number, array: Uint16Array) -> U, initialValue: U): U
    fun reverse(): Uint16Array
    fun set(array: ArrayLike<Number>, offset: Number = definedExternally)
    fun slice(start: Number = definedExternally, end: Number = definedExternally): Uint16Array
    fun some(callbackfn: (value: Number, index: Number, array: Uint16Array) -> Any, thisArg: Any = definedExternally): Boolean
    fun sort(compareFn: (a: Number, b: Number) -> Number = definedExternally): Uint16Array /* this */
    fun subarray(begin: Number = definedExternally, end: Number = definedExternally): Uint16Array
    fun toLocaleString(): String
    override fun toString(): String
    fun valueOf(): Uint16Array
    @nativeGetter
    operator fun get(index: Number): Number?
    @nativeSetter
    operator fun set(index: Number, value: Number)
}

external interface Uint16ArrayConstructor {
    fun from(arrayLike: Iterable<Number>, mapfn: (v: Number, k: Number) -> Number = definedExternally, thisArg: Any = definedExternally): Uint16Array
    var prototype: Uint16Array
    var BYTES_PER_ELEMENT: Number
    fun of(vararg items: Number): Uint16Array
    fun from(arrayLike: ArrayLike<Number>): Uint16Array
    fun <T> from(arrayLike: ArrayLike<T>, mapfn: (v: T, k: Number) -> Number, thisArg: Any = definedExternally): Uint16Array
}

external interface Int32Array {
    fun includes(searchElement: Number, fromIndex: Number = definedExternally): Boolean
    fun entries(): IterableIterator<dynamic /* JsTuple<Number, Number> */>
    fun keys(): IterableIterator<Number>
    fun values(): IterableIterator<Number>
    var BYTES_PER_ELEMENT: Number
    var buffer: ArrayBufferLike
    var byteLength: Number
    var byteOffset: Number
    fun copyWithin(target: Number, start: Number, end: Number = definedExternally): Int32Array /* this */
    fun every(callbackfn: (value: Number, index: Number, array: Int32Array) -> Any, thisArg: Any = definedExternally): Boolean
    fun fill(value: Number, start: Number = definedExternally, end: Number = definedExternally): Int32Array /* this */
    fun filter(callbackfn: (value: Number, index: Number, array: Int32Array) -> Any, thisArg: Any = definedExternally): Int32Array
    fun find(predicate: (value: Number, index: Number, obj: Int32Array) -> Boolean, thisArg: Any = definedExternally): Number?
    fun findIndex(predicate: (value: Number, index: Number, obj: Int32Array) -> Boolean, thisArg: Any = definedExternally): Number
    fun forEach(callbackfn: (value: Number, index: Number, array: Int32Array) -> Unit, thisArg: Any = definedExternally)
    fun indexOf(searchElement: Number, fromIndex: Number = definedExternally): Number
    fun join(separator: String = definedExternally): String
    fun lastIndexOf(searchElement: Number, fromIndex: Number = definedExternally): Number
    var length: Number
    fun map(callbackfn: (value: Number, index: Number, array: Int32Array) -> Number, thisArg: Any = definedExternally): Int32Array
    fun reduce(callbackfn: (previousValue: Number, currentValue: Number, currentIndex: Number, array: Int32Array) -> Number): Number
    fun reduce(callbackfn: (previousValue: Number, currentValue: Number, currentIndex: Number, array: Int32Array) -> Number, initialValue: Number): Number
    fun <U> reduce(callbackfn: (previousValue: U, currentValue: Number, currentIndex: Number, array: Int32Array) -> U, initialValue: U): U
    fun reduceRight(callbackfn: (previousValue: Number, currentValue: Number, currentIndex: Number, array: Int32Array) -> Number): Number
    fun reduceRight(callbackfn: (previousValue: Number, currentValue: Number, currentIndex: Number, array: Int32Array) -> Number, initialValue: Number): Number
    fun <U> reduceRight(callbackfn: (previousValue: U, currentValue: Number, currentIndex: Number, array: Int32Array) -> U, initialValue: U): U
    fun reverse(): Int32Array
    fun set(array: ArrayLike<Number>, offset: Number = definedExternally)
    fun slice(start: Number = definedExternally, end: Number = definedExternally): Int32Array
    fun some(callbackfn: (value: Number, index: Number, array: Int32Array) -> Any, thisArg: Any = definedExternally): Boolean
    fun sort(compareFn: (a: Number, b: Number) -> Number = definedExternally): Int32Array /* this */
    fun subarray(begin: Number = definedExternally, end: Number = definedExternally): Int32Array
    fun toLocaleString(): String
    override fun toString(): String
    fun valueOf(): Int32Array
    @nativeGetter
    operator fun get(index: Number): Number?
    @nativeSetter
    operator fun set(index: Number, value: Number)
}

external interface Int32ArrayConstructor {
    fun from(arrayLike: Iterable<Number>, mapfn: (v: Number, k: Number) -> Number = definedExternally, thisArg: Any = definedExternally): Int32Array
    var prototype: Int32Array
    var BYTES_PER_ELEMENT: Number
    fun of(vararg items: Number): Int32Array
    fun from(arrayLike: ArrayLike<Number>): Int32Array
    fun <T> from(arrayLike: ArrayLike<T>, mapfn: (v: T, k: Number) -> Number, thisArg: Any = definedExternally): Int32Array
}

external interface Uint32Array {
    fun includes(searchElement: Number, fromIndex: Number = definedExternally): Boolean
    fun entries(): IterableIterator<dynamic /* JsTuple<Number, Number> */>
    fun keys(): IterableIterator<Number>
    fun values(): IterableIterator<Number>
    var BYTES_PER_ELEMENT: Number
    var buffer: ArrayBufferLike
    var byteLength: Number
    var byteOffset: Number
    fun copyWithin(target: Number, start: Number, end: Number = definedExternally): Uint32Array /* this */
    fun every(callbackfn: (value: Number, index: Number, array: Uint32Array) -> Any, thisArg: Any = definedExternally): Boolean
    fun fill(value: Number, start: Number = definedExternally, end: Number = definedExternally): Uint32Array /* this */
    fun filter(callbackfn: (value: Number, index: Number, array: Uint32Array) -> Any, thisArg: Any = definedExternally): Uint32Array
    fun find(predicate: (value: Number, index: Number, obj: Uint32Array) -> Boolean, thisArg: Any = definedExternally): Number?
    fun findIndex(predicate: (value: Number, index: Number, obj: Uint32Array) -> Boolean, thisArg: Any = definedExternally): Number
    fun forEach(callbackfn: (value: Number, index: Number, array: Uint32Array) -> Unit, thisArg: Any = definedExternally)
    fun indexOf(searchElement: Number, fromIndex: Number = definedExternally): Number
    fun join(separator: String = definedExternally): String
    fun lastIndexOf(searchElement: Number, fromIndex: Number = definedExternally): Number
    var length: Number
    fun map(callbackfn: (value: Number, index: Number, array: Uint32Array) -> Number, thisArg: Any = definedExternally): Uint32Array
    fun reduce(callbackfn: (previousValue: Number, currentValue: Number, currentIndex: Number, array: Uint32Array) -> Number): Number
    fun reduce(callbackfn: (previousValue: Number, currentValue: Number, currentIndex: Number, array: Uint32Array) -> Number, initialValue: Number): Number
    fun <U> reduce(callbackfn: (previousValue: U, currentValue: Number, currentIndex: Number, array: Uint32Array) -> U, initialValue: U): U
    fun reduceRight(callbackfn: (previousValue: Number, currentValue: Number, currentIndex: Number, array: Uint32Array) -> Number): Number
    fun reduceRight(callbackfn: (previousValue: Number, currentValue: Number, currentIndex: Number, array: Uint32Array) -> Number, initialValue: Number): Number
    fun <U> reduceRight(callbackfn: (previousValue: U, currentValue: Number, currentIndex: Number, array: Uint32Array) -> U, initialValue: U): U
    fun reverse(): Uint32Array
    fun set(array: ArrayLike<Number>, offset: Number = definedExternally)
    fun slice(start: Number = definedExternally, end: Number = definedExternally): Uint32Array
    fun some(callbackfn: (value: Number, index: Number, array: Uint32Array) -> Any, thisArg: Any = definedExternally): Boolean
    fun sort(compareFn: (a: Number, b: Number) -> Number = definedExternally): Uint32Array /* this */
    fun subarray(begin: Number = definedExternally, end: Number = definedExternally): Uint32Array
    fun toLocaleString(): String
    override fun toString(): String
    fun valueOf(): Uint32Array
    @nativeGetter
    operator fun get(index: Number): Number?
    @nativeSetter
    operator fun set(index: Number, value: Number)
}

external interface Uint32ArrayConstructor {
    fun from(arrayLike: Iterable<Number>, mapfn: (v: Number, k: Number) -> Number = definedExternally, thisArg: Any = definedExternally): Uint32Array
    var prototype: Uint32Array
    var BYTES_PER_ELEMENT: Number
    fun of(vararg items: Number): Uint32Array
    fun from(arrayLike: ArrayLike<Number>): Uint32Array
    fun <T> from(arrayLike: ArrayLike<T>, mapfn: (v: T, k: Number) -> Number, thisArg: Any = definedExternally): Uint32Array
}

external interface Float32Array {
    fun includes(searchElement: Number, fromIndex: Number = definedExternally): Boolean
    fun entries(): IterableIterator<dynamic /* JsTuple<Number, Number> */>
    fun keys(): IterableIterator<Number>
    fun values(): IterableIterator<Number>
    var BYTES_PER_ELEMENT: Number
    var buffer: ArrayBufferLike
    var byteLength: Number
    var byteOffset: Number
    fun copyWithin(target: Number, start: Number, end: Number = definedExternally): Float32Array /* this */
    fun every(callbackfn: (value: Number, index: Number, array: Float32Array) -> Any, thisArg: Any = definedExternally): Boolean
    fun fill(value: Number, start: Number = definedExternally, end: Number = definedExternally): Float32Array /* this */
    fun filter(callbackfn: (value: Number, index: Number, array: Float32Array) -> Any, thisArg: Any = definedExternally): Float32Array
    fun find(predicate: (value: Number, index: Number, obj: Float32Array) -> Boolean, thisArg: Any = definedExternally): Number?
    fun findIndex(predicate: (value: Number, index: Number, obj: Float32Array) -> Boolean, thisArg: Any = definedExternally): Number
    fun forEach(callbackfn: (value: Number, index: Number, array: Float32Array) -> Unit, thisArg: Any = definedExternally)
    fun indexOf(searchElement: Number, fromIndex: Number = definedExternally): Number
    fun join(separator: String = definedExternally): String
    fun lastIndexOf(searchElement: Number, fromIndex: Number = definedExternally): Number
    var length: Number
    fun map(callbackfn: (value: Number, index: Number, array: Float32Array) -> Number, thisArg: Any = definedExternally): Float32Array
    fun reduce(callbackfn: (previousValue: Number, currentValue: Number, currentIndex: Number, array: Float32Array) -> Number): Number
    fun reduce(callbackfn: (previousValue: Number, currentValue: Number, currentIndex: Number, array: Float32Array) -> Number, initialValue: Number): Number
    fun <U> reduce(callbackfn: (previousValue: U, currentValue: Number, currentIndex: Number, array: Float32Array) -> U, initialValue: U): U
    fun reduceRight(callbackfn: (previousValue: Number, currentValue: Number, currentIndex: Number, array: Float32Array) -> Number): Number
    fun reduceRight(callbackfn: (previousValue: Number, currentValue: Number, currentIndex: Number, array: Float32Array) -> Number, initialValue: Number): Number
    fun <U> reduceRight(callbackfn: (previousValue: U, currentValue: Number, currentIndex: Number, array: Float32Array) -> U, initialValue: U): U
    fun reverse(): Float32Array
    fun set(array: ArrayLike<Number>, offset: Number = definedExternally)
    fun slice(start: Number = definedExternally, end: Number = definedExternally): Float32Array
    fun some(callbackfn: (value: Number, index: Number, array: Float32Array) -> Any, thisArg: Any = definedExternally): Boolean
    fun sort(compareFn: (a: Number, b: Number) -> Number = definedExternally): Float32Array /* this */
    fun subarray(begin: Number = definedExternally, end: Number = definedExternally): Float32Array
    fun toLocaleString(): String
    override fun toString(): String
    fun valueOf(): Float32Array
    @nativeGetter
    operator fun get(index: Number): Number?
    @nativeSetter
    operator fun set(index: Number, value: Number)
}

external interface Float32ArrayConstructor {
    fun from(arrayLike: Iterable<Number>, mapfn: (v: Number, k: Number) -> Number = definedExternally, thisArg: Any = definedExternally): Float32Array
    var prototype: Float32Array
    var BYTES_PER_ELEMENT: Number
    fun of(vararg items: Number): Float32Array
    fun from(arrayLike: ArrayLike<Number>): Float32Array
    fun <T> from(arrayLike: ArrayLike<T>, mapfn: (v: T, k: Number) -> Number, thisArg: Any = definedExternally): Float32Array
}

external interface Float64Array {
    fun includes(searchElement: Number, fromIndex: Number = definedExternally): Boolean
    fun entries(): IterableIterator<dynamic /* JsTuple<Number, Number> */>
    fun keys(): IterableIterator<Number>
    fun values(): IterableIterator<Number>
    var BYTES_PER_ELEMENT: Number
    var buffer: ArrayBufferLike
    var byteLength: Number
    var byteOffset: Number
    fun copyWithin(target: Number, start: Number, end: Number = definedExternally): Float64Array /* this */
    fun every(callbackfn: (value: Number, index: Number, array: Float64Array) -> Any, thisArg: Any = definedExternally): Boolean
    fun fill(value: Number, start: Number = definedExternally, end: Number = definedExternally): Float64Array /* this */
    fun filter(callbackfn: (value: Number, index: Number, array: Float64Array) -> Any, thisArg: Any = definedExternally): Float64Array
    fun find(predicate: (value: Number, index: Number, obj: Float64Array) -> Boolean, thisArg: Any = definedExternally): Number?
    fun findIndex(predicate: (value: Number, index: Number, obj: Float64Array) -> Boolean, thisArg: Any = definedExternally): Number
    fun forEach(callbackfn: (value: Number, index: Number, array: Float64Array) -> Unit, thisArg: Any = definedExternally)
    fun indexOf(searchElement: Number, fromIndex: Number = definedExternally): Number
    fun join(separator: String = definedExternally): String
    fun lastIndexOf(searchElement: Number, fromIndex: Number = definedExternally): Number
    var length: Number
    fun map(callbackfn: (value: Number, index: Number, array: Float64Array) -> Number, thisArg: Any = definedExternally): Float64Array
    fun reduce(callbackfn: (previousValue: Number, currentValue: Number, currentIndex: Number, array: Float64Array) -> Number): Number
    fun reduce(callbackfn: (previousValue: Number, currentValue: Number, currentIndex: Number, array: Float64Array) -> Number, initialValue: Number): Number
    fun <U> reduce(callbackfn: (previousValue: U, currentValue: Number, currentIndex: Number, array: Float64Array) -> U, initialValue: U): U
    fun reduceRight(callbackfn: (previousValue: Number, currentValue: Number, currentIndex: Number, array: Float64Array) -> Number): Number
    fun reduceRight(callbackfn: (previousValue: Number, currentValue: Number, currentIndex: Number, array: Float64Array) -> Number, initialValue: Number): Number
    fun <U> reduceRight(callbackfn: (previousValue: U, currentValue: Number, currentIndex: Number, array: Float64Array) -> U, initialValue: U): U
    fun reverse(): Float64Array
    fun set(array: ArrayLike<Number>, offset: Number = definedExternally)
    fun slice(start: Number = definedExternally, end: Number = definedExternally): Float64Array
    fun some(callbackfn: (value: Number, index: Number, array: Float64Array) -> Any, thisArg: Any = definedExternally): Boolean
    fun sort(compareFn: (a: Number, b: Number) -> Number = definedExternally): Float64Array /* this */
    fun subarray(begin: Number = definedExternally, end: Number = definedExternally): Float64Array
    override fun toString(): String
    fun valueOf(): Float64Array
    @nativeGetter
    operator fun get(index: Number): Number?
    @nativeSetter
    operator fun set(index: Number, value: Number)
}

external interface Float64ArrayConstructor {
    fun from(arrayLike: Iterable<Number>, mapfn: (v: Number, k: Number) -> Number = definedExternally, thisArg: Any = definedExternally): Float64Array
    var prototype: Float64Array
    var BYTES_PER_ELEMENT: Number
    fun of(vararg items: Number): Float64Array
    fun from(arrayLike: ArrayLike<Number>): Float64Array
    fun <T> from(arrayLike: ArrayLike<T>, mapfn: (v: T, k: Number) -> Number, thisArg: Any = definedExternally): Float64Array
}
