package Lesson3

/**
 * Udacity - Kotlin Bootcamp for Programmers
 * Lesson 3: Functions
 * Quiz: Fit More Fish
 */

fun main(args: Array<String>) {
    println(canAddFish(10.0, listOf(3, 3, 3)))
    println(canAddFish(8.0, listOf(2, 2, 2), hasDecorations = false))
    println(canAddFish(9.0, listOf(1, 1, 3), 3))
    println(canAddFish(10.0, listOf(), 7, true))
}

/**
 * tankSize (in gallons)
 * currentFish (a list of Ints representing the length of each fish currently in the tank)
 * fishSize (the length of the new fish we want to add to the tank)
 * hasDecorations (true if the the tank has decorations, false if not)
 */
fun canAddFish(tankSize: Double,
                currentFish: List<Int>,
                fishSize: Int = 2,
                hasDecorations: Boolean = true) : Boolean {

    //get sum of currentFish list
    val totalFishLength = currentFish.sum()

    // If the tank has decorations,
    // it can hold up to 80% of the tank size in gallons
    return if(hasDecorations) {
        (totalFishLength + fishSize).toDouble() <= tankSize * .8
    }
    // If the tank doesn't have decorations,
    // it can hold 100% of the tank size in gallons
    else {
        (totalFishLength + fishSize).toDouble() <= tankSize
    }
}