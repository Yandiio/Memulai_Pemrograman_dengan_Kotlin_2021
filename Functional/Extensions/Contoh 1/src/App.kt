// main function
fun main() {
    10.printInt()
    print("data".printString())
}

fun Int.printInt() {
    print("value $this")
}

fun String.printString() : String {
    return "value of String $this"
}