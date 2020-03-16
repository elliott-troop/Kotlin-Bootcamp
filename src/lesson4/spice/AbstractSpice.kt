package lesson4.spice

/**
 * Udacity - Kotlin Bootcamp for Programmers
 * Lesson 4: Classes
 * Quiz: 6
 */

fun main(args: Array<String>) {
    delegate()
}

fun delegate() {
    val mySpice = Curry("curry", "hot")
    println(mySpice.name)
}

/**
 * Abstract class with
 */
abstract class AbstractSpice(val name: String, val spiciness: String = "mild", color: SpiceColor)
    : SpiceColor by color {

    abstract fun prepareSpice()
}

class Curry(name: String, spiciness: String, color: SpiceColor = YellowSpiceColor)
    : AbstractSpice(name, spiciness, color), Grinder
{

    // override abstract class in AbstractSpice
    override fun prepareSpice() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    // override function in Grinder interface
    override fun grind() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}

/**
 * Interface with empty function body
 */
interface Grinder {
    fun grind()
}

/**
 * Interface with property
 */
interface SpiceColor {
    val color: Color
}

/**
 * Singleton object that implements SpiceColor
 */
object YellowSpiceColor: SpiceColor {
    override val color = Color.YELLOW
}

/**
 * Enum class for colors
 */
enum class Color(val rgb: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF),
    YELLOW(0xFFFF00)
}