package lesson3

/**
 * Udacity - Kotlin Bootcamp for Programmers
 * Lesson 3: Functions
 * Quiz: Fit More Fish
 */

fun main(args: Array<String>) {
    println(whatShouldIDoToday("happy", "Sunny", 0))
    println(whatShouldIDoToday("sad"))
}

/**
 * mood: a required string parameter
 * weather: a string parameter that defaults to "sunny"
 * temperature: an Integer parameter that defaults to 24 (Celsius).
 */
fun whatShouldIDoToday(mood: String,
                       weather: String = "Sunny",
                       temperature: Int = 24) : String {

    return when {
        mood == "happy" && weather == "Sunny" -> "go for a walk"
        else -> "Stay home and read."
    }
}