fun main() {
    val numbers = 1.rangeTo(10)
    val evenNumbers = numbers.filter(Int::isEvenNumber)

    val oddNumber = numbers.filter(Int::isOddNumber)

    println("$evenNumbers\n$oddNumber")
}

fun Int.isEvenNumber() = this % 2 == 0

fun Int.isOddNumber() = this % 2 == 1