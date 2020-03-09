package lesson3

import kotlin.random.Random

/**
 * Udacity - Kotlin Bootcamp for Programmers
 * Lesson 3: Functions
 * Quiz: 8
 */

fun main(args: Array<String>) {

    // Create a lambda and assign it to rollDice,
    // which returns a dice roll (number between 1 and 12).
    val rollDice1: () -> Int = {Random.nextInt(1,13)}

    // Extend the lambda to take an argument indicating the
    // number of sides of the dice used for the roll.
    val rollDice2: (Int) -> Int = { sides ->
        Random.nextInt(1, sides) + 1
    }

    // If you haven't done so, fix the lambda to return 0
    // if the number of sides passed in is 0
    val rollDice3: (Int) -> Int = { sides ->
        if(sides == 0) 0 else Random.nextInt(sides) + 1
    }

    gamePlay(rollDice3(8))
}

/**
 * Takes a roll of the dice as an argument and prints it out.
 */
fun gamePlay(roll: Int) = println(roll)