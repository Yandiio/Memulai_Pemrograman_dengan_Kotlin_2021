// main function
fun main() {
    val message = "Hello Kotlin!"
    val result = with(message) {
        "First character is ${this[0]}" +
                " and last character is ${this[this.length - 1]}"
    }

    val number = 1
    val results = with(number) {
        this + this
    }

    number.let {
        it + it
    }

    println("$results\n$number")
}