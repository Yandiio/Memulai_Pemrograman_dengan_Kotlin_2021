fun main() {
    val text = "Hello Kotlin"
    val result = text.also {
        println("value length -> ${it.length}")
    }

    println("text -> $result")

    val texts = "Hello Java"
    val results = texts.also {
        println("value length ${it.length}")
    }

    println("text $results")
}