data class DataUser(val name : String, val age : Int, val college: String)

fun main(){
    val dataUser = DataUser("nrohmen", 17, "UNPAD")

    val name = dataUser.component1()
    val age = dataUser.component2()
    val college = dataUser.component3()

    println("My name is $name, I am $age years old and I going to $college")
}