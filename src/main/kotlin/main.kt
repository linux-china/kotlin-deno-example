import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import user.UserManager

suspend fun main() = coroutineScope {
  val names = sequenceOf("first", "second", "third")
  names.map { it.length }
    .forEach { println(it) }
  val userManager = UserManager()
  println(userManager.findNickById(1))
  println(Deno.version.deno)
  launch { // launch a new coroutine in background and continue
    delay(1000L) // non-blocking delay for 1 second (default time unit is ms)
    println("Hello World!") // print after delay
  }
  println("digest md5 example:");
  println(createHash("md5").update("hello").toString())
}

@JsName("hello")
fun hello(name: String): String {
  return "Hello $name"
}
