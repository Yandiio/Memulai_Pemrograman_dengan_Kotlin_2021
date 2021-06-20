fun main() {
    val list = (1..1000000).toList()
    list.filter { it % 5 == 0 }.map { it + it }.forEach { println(it) }
}