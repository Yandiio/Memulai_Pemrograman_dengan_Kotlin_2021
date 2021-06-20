fun main() {
    val capital = mapOf(
            "Jakarta" to "Indonesia",
            "London" to "England",
            "New Delhi" to "India"
    )

    val team = mapOf(
        "Amsterdam" to "Ajax",
        "Persib" to "Bandung",
        "Manchester" to "Man City"
    )

    println(team["Amsterdam"])

    println(capital["Jakarta"])
    println(capital.getValue("Jakarta"))

    val mapKeys = capital.keys
    val mapValues = capital.values

    val mutableTeam = team.toMutableMap()

    mutableTeam.put("Persija", "Jakarta")

    println(mapKeys)
    println(mapValues)
    print(mutableTeam)
}