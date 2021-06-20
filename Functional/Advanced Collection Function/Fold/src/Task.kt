fun main() {
    val numbers = listOf(1, 2, 3)
    val fold = numbers.foldRight(10) { item, current ->
        println("current $current")
        println("item $item")
        println()
        item + current
    }

    val numbersOneToTwenty = listOf(1, 2, 3)
    val foldingNumber = numbersOneToTwenty.fold(10) { item, current ->
        println("current number $current")
        println("item $item")
        item + current
    }

    println("Fold result: $fold")
    println("Fold negative result: $foldingNumber")
}