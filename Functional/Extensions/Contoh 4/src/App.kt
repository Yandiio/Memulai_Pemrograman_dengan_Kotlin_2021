// main function
fun main() {
    val value: Int? = null

    println(value.slice)
    println(10.cross)
}

val Int?.slice: Int
    get() = this?.div(2) ?: 0

val Int?.cross: Int
    get() = this?.times(10) ?: 0