// main function
fun main() {
    val ranges = 1.rangeTo(10) step 2

    ranges.forEach{ it ->
        print("$it ")
    }
    println(ranges.step)

    val smallRange = 10.downTo(1) step 2
    if (8 in smallRange) {
        print ("value 8 is available")
    }
}