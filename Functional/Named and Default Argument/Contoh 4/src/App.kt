// main function
fun main() {
    val fullName = getFullName(first = "Dicoding")
    print(fullName)

    val playerName = getPlayerName()
    println(playerName)
// Output: Declan Rice, Age 24

    val playerNames = getPlayerName(firstName = "Padi")
    println(playerNames)
}

fun getFullName(first: String = "Kotlin", middle: String = " is ", last: String = "Awesome"): String {
    return "$first $middle $last"
}

fun getPlayerName(firstName: String = "Declan", lastName: String = "Rice", age: Int = 22) : String {
    return "$firstName $lastName, Age: $age"
}
