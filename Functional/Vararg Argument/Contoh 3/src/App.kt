// main function
fun main() {
    val number = intArrayOf(10, 20, 30, 40)
    println(sets(10, 20, 20, *number , 10)
    )

    val arrayNumbers = intArrayOf(20, 30, 40, 50)
    var listOfNumbers = getListNumber(10, 20, 30, *arrayNumbers)
    print(listOfNumbers)
}

fun sets(vararg number: Int): Int {
    return number.sum()
}

fun getListNumber(vararg number : Int) : Int {
    return number.sum()
}