typealias Arithmetic = (Int, Int) -> Int

val sum: Arithmetic = { valueA, valueB -> valueA + valueB }

val multiply: Arithmetic = { valueA, valueB -> valueA * valueB }

val minus: Arithmetic = { valueA, valueB -> valueA - valueB }

fun main() {
    val sumResult = sum.invoke(10, 10)
    val multiplyResult = multiply.invoke(20, 20)
    val minusResult = minus.invoke(29, 28)

    println(sumResult)
    println(multiplyResult)
    println(minusResult)
}