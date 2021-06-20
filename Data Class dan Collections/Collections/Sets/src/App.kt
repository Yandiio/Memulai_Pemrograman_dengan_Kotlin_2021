// main function
fun main() {
//    val integerSet = setOf(1, 2, 4, 2, 1, 5)
//    println(integerSet)

    val setA = setOf(1, 2, 4, 2, 1, 5)
    val setB = setOf(1, 2, 4, 5)
    println(setA == setB)

    println(3 in setA)

    val setC = setOf(1, 5, 7)
    val union = setA.union(setC)
    val intersect = setA.intersect(setC)

    val setD = mutableSetOf(2, 5, 3, 2)
    setD.add(8)

    println(union)
    println(intersect)
    println(setD)
}