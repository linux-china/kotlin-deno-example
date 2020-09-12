@file:JsQualifier("Deno")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
package Deno

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
import ErrorConstructor
import AsyncIterableIterator
import IterableIterator
import Iterable
import AsyncIterable

external object errors {
    var NotFound: ErrorConstructor
    var PermissionDenied: ErrorConstructor
    var ConnectionRefused: ErrorConstructor
    var ConnectionReset: ErrorConstructor
    var ConnectionAborted: ErrorConstructor
    var NotConnected: ErrorConstructor
    var AddrInUse: ErrorConstructor
    var AddrNotAvailable: ErrorConstructor
    var BrokenPipe: ErrorConstructor
    var AlreadyExists: ErrorConstructor
    var InvalidData: ErrorConstructor
    var TimedOut: ErrorConstructor
    var Interrupted: ErrorConstructor
    var WriteZero: ErrorConstructor
    var UnexpectedEof: ErrorConstructor
    var BadResource: ErrorConstructor
    var Http: ErrorConstructor
    var Busy: ErrorConstructor
}

external var pid: Number

external var noColor: Boolean

external interface TestDefinition {
    var fn: () -> dynamic
    var name: String
    var ignore: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var only: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var sanitizeOps: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var sanitizeResources: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external fun test(t: TestDefinition)

external fun test(name: String, fn: () -> dynamic)

external fun exit(code: Number = definedExternally): Any

external interface `T$0` {
    @nativeGetter
    operator fun get(index: String): String?
    @nativeSetter
    operator fun set(index: String, value: String)
}

external object env {
    fun get(key: String): String?
    fun set(key: String, value: String)
    fun delete(key: String)
    fun toObject(): `T$0`
}

external fun execPath(): String

external fun chdir(directory: String)

external fun cwd(): String

external enum class SeekMode {
    Start /* = 0 */,
    Current /* = 1 */,
    End /* = 2 */
}

external interface Reader {
    fun read(p: Uint8Array): Promise<Number?>
}

external interface ReaderSync {
    fun readSync(p: Uint8Array): Number?
}

external interface Writer {
    fun write(p: Uint8Array): Promise<Number>
}

external interface WriterSync {
    fun writeSync(p: Uint8Array): Number
}

external interface Closer {
    fun close()
}

external interface Seeker {
    fun seek(offset: Number, whence: SeekMode): Promise<Number>
}

external interface SeekerSync {
    fun seekSync(offset: Number, whence: SeekMode): Number
}

external interface `T$1` {
    var bufSize: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external fun copy(src: Reader, dst: Writer, options: `T$1` = definedExternally): Promise<Number>

external fun iter(r: Reader, options: `T$1` = definedExternally): AsyncIterableIterator<Uint8Array>

external fun iterSync(r: ReaderSync, options: `T$1` = definedExternally): IterableIterator<Uint8Array>

external fun openSync(path: String, options: OpenOptions = definedExternally): File

external fun openSync(path: URL, options: OpenOptions = definedExternally): File

external fun open(path: String, options: OpenOptions = definedExternally): Promise<File>

external fun open(path: URL, options: OpenOptions = definedExternally): Promise<File>

external fun createSync(path: String): File

external fun createSync(path: URL): File

external fun create(path: String): Promise<File>

external fun create(path: URL): Promise<File>

external fun readSync(rid: Number, buffer: Uint8Array): Number?

external fun read(rid: Number, buffer: Uint8Array): Promise<Number?>

external fun writeSync(rid: Number, data: Uint8Array): Number

external fun write(rid: Number, data: Uint8Array): Promise<Number>

external fun seekSync(rid: Number, offset: Number, whence: SeekMode): Number

external fun seek(rid: Number, offset: Number, whence: SeekMode): Promise<Number>

external fun close(rid: Number)

external open class File(rid: Number) : Reader, ReaderSync, Writer, WriterSync, Seeker, SeekerSync, Closer {
    open var rid: Number
    override fun write(p: Uint8Array): Promise<Number>
    override fun writeSync(p: Uint8Array): Number
    override fun read(p: Uint8Array): Promise<Number?>
    override fun readSync(p: Uint8Array): Number?
    override fun seek(offset: Number, whence: SeekMode): Promise<Number>
    override fun seekSync(offset: Number, whence: SeekMode): Number
    override fun close()
}

external interface `T$2` {
    var rid: Number
}

external var stdin: Reader /* Reader & ReaderSync & Closer & `T$2` */

external var stdout: Writer /* Writer & WriterSync & Closer & `T$2` */

external var stderr: Writer /* Writer & WriterSync & Closer & `T$2` */

external interface OpenOptions {
    var read: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var write: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var append: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var truncate: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var create: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var createNew: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var mode: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external fun isatty(rid: Number): Boolean

external interface `T$3` {
    var copy: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external open class Buffer(ab: ArrayBuffer = definedExternally) : Reader, ReaderSync, Writer, WriterSync {
    open fun bytes(options: `T$3` = definedExternally): Uint8Array
    open fun empty(): Boolean
    open var length: Number
    open var capacity: Number
    open fun truncate(n: Number)
    open fun reset()
    override fun readSync(p: Uint8Array): Number?
    override fun read(p: Uint8Array): Promise<Number?>
    override fun writeSync(p: Uint8Array): Number
    override fun write(p: Uint8Array): Promise<Number>
    open fun grow(n: Number)
    open fun readFrom(r: Reader): Promise<Number>
    open fun readFromSync(r: ReaderSync): Number
}

external fun readAll(r: Reader): Promise<Uint8Array>

external fun readAllSync(r: ReaderSync): Uint8Array

external fun writeAll(w: Writer, arr: Uint8Array): Promise<Unit>

external fun writeAllSync(w: WriterSync, arr: Uint8Array)

external interface MkdirOptions {
    var recursive: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var mode: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external fun mkdirSync(path: String, options: MkdirOptions = definedExternally)

external fun mkdirSync(path: URL, options: MkdirOptions = definedExternally)

external fun mkdir(path: String, options: MkdirOptions = definedExternally): Promise<Unit>

external fun mkdir(path: URL, options: MkdirOptions = definedExternally): Promise<Unit>

external interface MakeTempOptions {
    var dir: String?
        get() = definedExternally
        set(value) = definedExternally
    var prefix: String?
        get() = definedExternally
        set(value) = definedExternally
    var suffix: String?
        get() = definedExternally
        set(value) = definedExternally
}

external fun makeTempDirSync(options: MakeTempOptions = definedExternally): String

external fun makeTempDir(options: MakeTempOptions = definedExternally): Promise<String>

external fun makeTempFileSync(options: MakeTempOptions = definedExternally): String

external fun makeTempFile(options: MakeTempOptions = definedExternally): Promise<String>

external fun chmodSync(path: String, mode: Number)

external fun chmodSync(path: URL, mode: Number)

external fun chmod(path: String, mode: Number): Promise<Unit>

external fun chmod(path: URL, mode: Number): Promise<Unit>

external fun chownSync(path: String, uid: Number?, gid: Number?)

external fun chownSync(path: URL, uid: Number?, gid: Number?)

external fun chown(path: String, uid: Number?, gid: Number?): Promise<Unit>

external fun chown(path: URL, uid: Number?, gid: Number?): Promise<Unit>

external interface RemoveOptions {
    var recursive: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external fun removeSync(path: String, options: RemoveOptions = definedExternally)

external fun removeSync(path: URL, options: RemoveOptions = definedExternally)

external fun remove(path: String, options: RemoveOptions = definedExternally): Promise<Unit>

external fun remove(path: URL, options: RemoveOptions = definedExternally): Promise<Unit>

external fun renameSync(oldpath: String, newpath: String)

external fun rename(oldpath: String, newpath: String): Promise<Unit>

external fun readTextFileSync(path: String): String

external fun readTextFileSync(path: URL): String

external fun readTextFile(path: String): Promise<String>

external fun readTextFile(path: URL): Promise<String>

external fun readFileSync(path: String): Uint8Array

external fun readFileSync(path: URL): Uint8Array

external fun readFile(path: String): Promise<Uint8Array>

external fun readFile(path: URL): Promise<Uint8Array>

external interface FileInfo {
    var isFile: Boolean
    var isDirectory: Boolean
    var isSymlink: Boolean
    var size: Number
    var mtime: Date?
    var atime: Date?
    var birthtime: Date?
    var dev: Number?
    var ino: Number?
    var mode: Number?
    var nlink: Number?
    var uid: Number?
    var gid: Number?
    var rdev: Number?
    var blksize: Number?
    var blocks: Number?
}

external fun realPathSync(path: String): String

external fun realPath(path: String): Promise<String>

external interface DirEntry {
    var name: String
    var isFile: Boolean
    var isDirectory: Boolean
    var isSymlink: Boolean
}

external fun readDirSync(path: String): Iterable<DirEntry>

external fun readDirSync(path: URL): Iterable<DirEntry>

external fun readDir(path: String): AsyncIterable<DirEntry>

external fun readDir(path: URL): AsyncIterable<DirEntry>

external fun copyFileSync(fromPath: String, toPath: String)

external fun copyFileSync(fromPath: String, toPath: URL)

external fun copyFileSync(fromPath: URL, toPath: String)

external fun copyFileSync(fromPath: URL, toPath: URL)

external fun copyFile(fromPath: String, toPath: String): Promise<Unit>

external fun copyFile(fromPath: String, toPath: URL): Promise<Unit>

external fun copyFile(fromPath: URL, toPath: String): Promise<Unit>

external fun copyFile(fromPath: URL, toPath: URL): Promise<Unit>

external fun readLinkSync(path: String): String

external fun readLink(path: String): Promise<String>

external fun lstat(path: String): Promise<FileInfo>

external fun lstat(path: URL): Promise<FileInfo>

external fun lstatSync(path: String): FileInfo

external fun lstatSync(path: URL): FileInfo

external fun stat(path: String): Promise<FileInfo>

external fun stat(path: URL): Promise<FileInfo>

external fun statSync(path: String): FileInfo

external fun statSync(path: URL): FileInfo

external interface WriteFileOptions {
    var append: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var create: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var mode: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external fun writeFileSync(path: String, data: Uint8Array, options: WriteFileOptions = definedExternally)

external fun writeFileSync(path: URL, data: Uint8Array, options: WriteFileOptions = definedExternally)

external fun writeFile(path: String, data: Uint8Array, options: WriteFileOptions = definedExternally): Promise<Unit>

external fun writeFile(path: URL, data: Uint8Array, options: WriteFileOptions = definedExternally): Promise<Unit>

external fun writeTextFileSync(path: String, data: String, options: WriteFileOptions = definedExternally)

external fun writeTextFileSync(path: URL, data: String, options: WriteFileOptions = definedExternally)

external fun writeTextFile(path: String, data: String, options: WriteFileOptions = definedExternally): Promise<Unit>

external fun writeTextFile(path: URL, data: String, options: WriteFileOptions = definedExternally): Promise<Unit>

external fun truncateSync(name: String, len: Number = definedExternally)

external fun truncate(name: String, len: Number = definedExternally): Promise<Unit>

external interface NetAddr {
    var transport: String /* "tcp" | "udp" */
    var hostname: String
    var port: Number
}

external interface UnixAddr {
    var transport: String /* "unix" | "unixpacket" */
    var path: String
}

external interface Listener : AsyncIterable<Conn> {
    fun accept(): Promise<Conn>
    fun close()
    var addr: dynamic /* NetAddr | UnixAddr */
        get() = definedExternally
        set(value) = definedExternally
    var rid: Number
}

external interface Conn : Reader, Writer, Closer {
    var localAddr: dynamic /* NetAddr | UnixAddr */
        get() = definedExternally
        set(value) = definedExternally
    var remoteAddr: dynamic /* NetAddr | UnixAddr */
        get() = definedExternally
        set(value) = definedExternally
    var rid: Number
    fun closeWrite()
}

external interface ListenOptions {
    var port: Number
    var hostname: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$4` {
    var transport: String? /* "tcp" */
        get() = definedExternally
        set(value) = definedExternally
}

external fun listen(options: ListenOptions /* ListenOptions & `T$4` */): Listener

external interface ListenTlsOptions : ListenOptions {
    var certFile: String
    var keyFile: String
    var transport: String? /* "tcp" */
        get() = definedExternally
        set(value) = definedExternally
}

external fun listenTls(options: ListenTlsOptions): Listener

external interface ConnectOptions {
    var port: Number
    var hostname: String?
        get() = definedExternally
        set(value) = definedExternally
    var transport: String? /* "tcp" */
        get() = definedExternally
        set(value) = definedExternally
}

external fun connect(options: ConnectOptions): Promise<Conn>

external interface ConnectTlsOptions {
    var port: Number
    var hostname: String?
        get() = definedExternally
        set(value) = definedExternally
    var certFile: String?
        get() = definedExternally
        set(value) = definedExternally
}

external fun connectTls(options: ConnectTlsOptions): Promise<Conn>

external interface Metrics {
    var opsDispatched: Number
    var opsDispatchedSync: Number
    var opsDispatchedAsync: Number
    var opsDispatchedAsyncUnref: Number
    var opsCompleted: Number
    var opsCompletedSync: Number
    var opsCompletedAsync: Number
    var opsCompletedAsyncUnref: Number
    var bytesSentControl: Number
    var bytesSentData: Number
    var bytesReceived: Number
}

external fun metrics(): Metrics

external interface ResourceMap {
    @nativeGetter
    operator fun get(rid: Number): Any?
    @nativeSetter
    operator fun set(rid: Number, value: Any)
}

external fun resources(): ResourceMap

external interface FsEvent {
    var kind: String /* "any" | "access" | "create" | "modify" | "remove" */
    var paths: Array<String>
}

external interface `T$5` {
    var recursive: Boolean
}

external fun watchFs(paths: String, options: `T$5` = definedExternally): AsyncIterableIterator<FsEvent>

external fun watchFs(paths: Array<String>, options: `T$5` = definedExternally): AsyncIterableIterator<FsEvent>

external open class Process<T : RunOptions> {
    open var rid: Number
    open var pid: Number
    open var stdin: Any
    open var stdout: Any
    open var stderr: Any
    open fun status(): Promise<dynamic /* `T$6` | `T$7` */>
    open fun output(): Promise<Uint8Array>
    open fun stderrOutput(): Promise<Uint8Array>
    open fun close()
    open fun kill(signo: Number)
}

external interface `T$6` {
    var success: Boolean
    var code: Number /* 0 */
    var signal: Any?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$7` {
    var success: Boolean
    var code: Number
    var signal: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface RunOptions {
    var cmd: dynamic /* Array<String> | dynamic */
        get() = definedExternally
        set(value) = definedExternally
    var cwd: String?
        get() = definedExternally
        set(value) = definedExternally
    var env: `T$0`?
        get() = definedExternally
        set(value) = definedExternally
    var stdout: dynamic /* String | String | String | Number? */
        get() = definedExternally
        set(value) = definedExternally
    var stderr: dynamic /* String | String | String | Number? */
        get() = definedExternally
        set(value) = definedExternally
    var stdin: dynamic /* String | String | String | Number? */
        get() = definedExternally
        set(value) = definedExternally
}

external fun <T : RunOptions> run(opt: T): Process<T>

external interface InspectOptions {
    var depth: Number?
        get() = definedExternally
        set(value) = definedExternally
    var sorted: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var trailingComma: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var compact: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var iterableLimit: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external fun inspect(value: Any, options: InspectOptions = definedExternally): String

external object build {
    var target: String
    var arch: String /* "x86_64" */
    var os: String /* "darwin" | "linux" | "windows" */
    var vendor: String
    var env: String?
}

external interface Version {
    var deno: String
    var v8: String
    var typescript: String
}

external var version: Version

external var args: Array<String>

external var customInspect: Any

external var mainModule: String