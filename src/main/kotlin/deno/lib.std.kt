@file:Suppress("PackageDirectoryMismatch")

external fun encode(input: String): String
external fun decode(input: String): String

external fun createHash(algorithm: String): Hasher;

external interface Hasher {
  fun update(data: String): Hasher;
  fun update(data: ArrayBuffer): Hasher;
  fun digest(): ArrayBuffer;
  override fun toString(): String;
  fun toString(format: String): String;
}
