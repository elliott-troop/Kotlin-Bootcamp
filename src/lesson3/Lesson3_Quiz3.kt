package lesson3
/**
 * Udacity - Kotlin Bootcamp for Programmers
 * Lesson 3: Functions
 * Quiz 3
 */

fun main(args: Array<String>) {
    for (i in 0 until 10) {
        val returnedFortune = getFortuneCookie()
        println("Your fortune is $returnedFortune")

        if(returnedFortune == "Take it easy and enjoy life!")
            break
    }
}

/**
 * Chooses a fortune based on the birthday using specific conditions
 */
fun getFortuneCookie(): String {
    val fortunes = listOf(
        "You were born on the 28th or 31st day of the month",
        "You were born in the first week of the month",
        "Oh you old old...",
        "You will have a great day!",
        "Things will go well for you today.",
        "Enjoy a wonderful day of success.",
        "Be humble and all will turn out well.",
        "Today is a good day for exercising restraint.",
        "Take it easy and enjoy life!",
        "Treasure your friends because they are your greatest fortune.")

    val index = when(val birthday = getBirthday()) {
        28, 31 -> 0
        in 1..7 -> 1
        else -> birthday.rem(fortunes.size)
    }

    return fortunes[index]
}

/**
 * Gets the user's birthday
 */
fun getBirthday() : Int {
    print("Enter your birthday: ")
    return readLine()?.toIntOrNull() ?: 1
}