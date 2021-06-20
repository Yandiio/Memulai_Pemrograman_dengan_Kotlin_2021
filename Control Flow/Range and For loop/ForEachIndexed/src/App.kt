// main function
fun main() {
    val ranges = 1.rangeTo(10) step 3

    ranges.forEachIndexed { index, value ->
        println("value $value with index $index")
    }

    ranges.forEachIndexed { index, value ->
        println("value $value at index $index")
    }

    ranges.forEachIndexed { _ , index ->
        println("$index is index")
    }
}