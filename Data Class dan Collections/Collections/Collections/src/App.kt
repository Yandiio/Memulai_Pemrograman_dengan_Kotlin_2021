class User

fun main() {
    val numberList = listOf(1, 2, 3, 4, 5)
    val charList = listOf('a', 'b', 'c')

    val anyList = listOf('a', "Kotlin", 3, true, User())
    val anyListOf = mutableListOf('a', "ryomei", true, User())

    println(anyList[3])

    anyListOf.add("sukuna")
    anyListOf.set(1, false)
    println(anyListOf)
}