package lesson3

/**
 * Udacity - Kotlin Bootcamp for Programmers
 * Lesson 3: Functions
 * Quiz: 6
 */

fun main(args: Array<String>) {
    println(whatShouldIDoToday2("Sunny", 0))
    println(whatShouldIDoToday2())
    println(whatShouldIDoToday2("Windy"))
}

/**
 * mood: a required string parameter
 * weather: a string parameter that defaults to "sunny"
 * temperature: an Integer parameter that defaults to 24 (Celsius).
 */
fun whatShouldIDoToday2(weather: String = "Sunny",
                       temperature: Int = 24) : String {

    println("What is your current mood on this $weather day that is $temperature Celsius out: ")

    val usersMood = readLine() ?: ""

    return when {
        goForWalk(usersMood, weather) -> "go for a walk"
        stayInBed(usersMood, weather, temperature) -> "stay in bed"
        punchTornado(usersMood, weather) -> "Punch a tornado"
        goSwimming(temperature) -> "go swimming"
        else -> "Stay home and read."
    }
}

fun goForWalk(mood: String, weather: String) = mood == "happy" && weather == "Sunny"
fun stayInBed(mood: String, weather: String, temperature: Int) = mood == "sad" && weather == "rainy" && temperature == 0
fun punchTornado(mood: String, weather: String) = mood == "mad" && weather == "Windy"
fun goSwimming(temperature: Int) =  temperature > 35