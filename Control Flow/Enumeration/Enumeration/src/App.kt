// main function
fun main() {
    val color: Color = enumValueOf("GREEN")
    print(color)

    val colors: Array<Color> = enumValues<Color>()
    colors.forEach { color ->
        println("position $color is at ${color.ordinal}")
    }
}

enum class Color {
    RED, GREEN, BLUE
}