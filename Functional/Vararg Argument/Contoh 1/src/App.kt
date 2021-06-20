// main function
fun main() {
    val number = sumNumbers(10, 20, 30, 40)
    print(number)
}

fun sumNumbers(vararg number: Int) : List<Int> {
    return number.map { it ->
        it * 2
    }
}