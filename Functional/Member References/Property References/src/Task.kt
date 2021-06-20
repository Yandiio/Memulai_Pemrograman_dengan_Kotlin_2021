var message = "Kotlin"
var mobile = "Android"
val girlband = "Red velvet"

fun main() {
    println(::message.name)
    println(::message.get())
    println(::girlband.get())

    ::mobile.set("Android Devs")

    ::message.set("Kotlin Academy")

    println(::message.get())
    println(::mobile.get())
}