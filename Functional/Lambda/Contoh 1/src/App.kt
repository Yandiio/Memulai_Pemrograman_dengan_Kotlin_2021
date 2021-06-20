// main function
fun main() {
    printMessage("Hello From Lambda")
    printNumber(12)
}

val printMessage = { message: String -> println(message) }
val printNumber = { number : Int -> println(number)}