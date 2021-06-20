// main function
fun main() {
    val colorRed = Color.RED
    val colorGreen = Color.GREEN
    val colorBlue = Color.BLUE
    val colorYellow = Color.YELLOW

    colorRed.printValue()
    colorGreen.printValue()
    colorBlue.printValue()
    colorYellow.printValue()
}

enum class Color(val value: Int) {
    RED(0xFF0000) {
        override fun printValue() {
            println("value of RED is $value")
        }
    },
    GREEN(0x00FF00) {
        override fun printValue() {
            println("value of GREEN is $value")
        }
    },
    BLUE(0x0000FF) {
        override fun printValue() {
            println("value of BLUE is $value")
        }
    },
    YELLOW(0x0FF00F) {
        override fun printValue() {
            println("value of YELLOW is $value")
        }
    };
    abstract fun printValue()
}