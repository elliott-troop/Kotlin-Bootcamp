package lesson4.book

/**
 * Udacity - Kotlin Bootcamp for Programmers
 * Lesson 4: Classes
 * Quiz: 3
 */

// Create an open class Book that has an author and title
open class Book(val author: String, val title: String) {

    private var currentPage = 1

    open fun readPage() {
        currentPage++
    }
}

// Create a subclass of Book that also takes in a format
class EBook(author: String, title: String, val format: String = "text")
    : Book(author, title) {

    private var wordCount: Int = 1000

    // Override the readPage function from super class
    override fun readPage() {
        wordCount += 250
    }
}