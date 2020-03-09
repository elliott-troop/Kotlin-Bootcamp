package lesson4.SimpleSpice

class SimpleSpice {
    val name: String = "curry"
    val spiciness: String = "mild"

    val heat: Int
        get() = when(spiciness) {
            "medium" -> 1
            "mild" -> 5
            "hot" -> 10
            else -> 9001
        }
}

fun main(args: Array<String>) {
    val mySpice = SimpleSpice()
    println("Name: ${mySpice.name}, Heat: ${mySpice.heat}")
}