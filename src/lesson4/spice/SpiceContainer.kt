package lesson4.spice

/**
 * Udacity - Kotlin Bootcamp for Programmers
 * Lesson 4: Classes
 * Quiz: 6
 */

/**
 * Data class containing a Spice object and String label
 */
data class SpiceContainer(val spice: Spice) {
    val label: String = spice.name
}

fun main(args: Array<String>) {
    val container1 = SpiceContainer(Spice("curry"))
    val container2 = SpiceContainer(Spice("red curry"))

    // example of decomposition
    val (spice) = container2

    println(container1)
    println(container2)
    println(spice)
}