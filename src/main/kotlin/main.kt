import user.UserManager

fun main() {
  val names = sequenceOf("first", "second", "third")
  names.map { it.length }
    .forEach { println(it) }
  val userManager = UserManager()
  println(userManager.findNickById(1))
  println(Deno.version.deno)
}

@JsName("hello")
fun hello(name: String): String {
  return "Hello $name"
}
