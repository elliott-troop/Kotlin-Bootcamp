package lesson3

fun main(args: Array<String>) {

    val spices = listOf("curry", "pepper", "cayenne", "ginger", "red curry", "green curry", "red pepper" )

    // Create a filter that gets all the curries
    // and sorts them by string length
    println(spices.filter { it.contains("curry") }.sortedBy { it.length })

    //Filter the list of spices to return all the spices
    // that start with 'c' and end in 'e'.
    // Do it in two different ways.
    println(spices.filter { it.startsWith('c') }.filter { it.endsWith('e') })
    println(spices.filter { it.startsWith('c') && it.endsWith('e') })

    // Take the first three elements of the list and
    // return the ones that start with 'c'

    println(spices.take(3).filter { it.startsWith('c') })
}