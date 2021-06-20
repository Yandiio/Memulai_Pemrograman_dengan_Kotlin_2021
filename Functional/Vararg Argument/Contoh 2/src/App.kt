// main function
fun main() {
    sets(10, 10, name = "Kotlin")
    size(10, 2, 5)
}

fun sets(vararg number: Int, name: String): Int {
    println(name)
    return number.sum()
}

fun size(vararg number: Int) : Int {
    return number.size
}