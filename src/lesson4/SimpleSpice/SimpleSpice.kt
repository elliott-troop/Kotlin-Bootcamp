package lesson4.SimpleSpice

/**
 * Udacity - Kotlin Bootcamp for Programmers
 * Lesson 4: Classes
 * Quiz: 1
 */

class SimpleSpice {
    val name: String = "curry"
    val spiciness: String = "mild"

    // getter that returns a numeric value for each type of spiciness
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