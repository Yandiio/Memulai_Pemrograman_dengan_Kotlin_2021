data class DataUser(val name : String, val age : Int)
class User (val name: String, val age: Int) {
    override fun toString(): String {
        return "User(name='$name', age=$age)"
    }
}

fun main() {
    val user = User("aldi", 29)
    val dataUser = DataUser("Yandi", 19)
    println("$user")
    println("$dataUser")
}