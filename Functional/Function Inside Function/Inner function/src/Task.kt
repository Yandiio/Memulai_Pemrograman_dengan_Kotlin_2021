fun sum(valueA: Int, valueB: Int, valueC: Int): Int {
    fun Int.validateNumber(){
        if (this == 0) {
            throw IllegalArgumentException("value must be better than 0")
        }
    }

    fun Int.validateNegative() {
        if (this < 0) {
            throw IllegalArgumentException("value cannot using negative")
        }
    }

    fun validateIsNumberOne(number : Int) {
        if (number != 1){
            throw IllegalArgumentException("value is not one, value is $number")
        }
    }

    valueA.validateNumber()
    valueB.validateNumber()
    valueC.validateNumber()

    valueA.validateNegative()
    valueB.validateNegative()
    valueC.validateNegative()

    validateIsNumberOne(valueA)
    validateIsNumberOne(valueB)

    return valueA + valueB + valueC
}

fun main () {
    val sum3 = sum(10, 20, 30)
    println("$sum3")
}