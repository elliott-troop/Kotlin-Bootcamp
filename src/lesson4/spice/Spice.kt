package lesson4.spice

/**
 * Udacity - Kotlin Bootcamp for Programmers
 * Lesson 4: Classes
 * Quiz: 2
 */

class Spice(val name: String,
            val spiciness: String = "mild") {

    // getter that returns a numeric value for each type of spiciness
    val heat: Int
        get() = when(spiciness) {
            "medium" -> 1
            "mild" -> 5
            "hot" -> 10
            "blazing" -> 9001
            else -> 42
        }

    // init block
    init {
        println("Create a spice")
    }
}

fun main(args: Array<String>) {

    // Create a list of spices
    val spices = listOf(
        Spice("curry"),
        Spice("red curry", "hot"),
        Spice("green curry", "medium"),
        Spice("yellow curry", "blazing")
    )

    // Create a list of hot spices whose heat is greater than 5
    val spicySpices = spices.filter { it.heat > 5 }

    // Create a list of hot spices whose heat is less than or equal to 5
    val notSoSpicySpices = spices.filter { it.heat <= 5 }

    // Call to helper function
    makeSalt()
}

// Helper function
fun makeSalt() = Spice("salt")

