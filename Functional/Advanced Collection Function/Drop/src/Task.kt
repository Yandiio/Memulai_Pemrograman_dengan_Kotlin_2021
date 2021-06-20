fun main() {
    val user = listOf(12, 13, 14 , 15)
    val number = listOf(1, 2, 3, 4, 5, user)
    val drop = number.dropLast(3)
    val dropOnlyOne = number.drop(4)

    println(dropOnlyOne)
}