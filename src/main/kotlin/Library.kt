package org.example

data class Library (
    val name: String,
    val books: List<Book>
) {
    // M1
    fun hasBook(isbn: String): Boolean {
        for (book in books) {
            if (book.isbn == isbn) {
                return true
            }
        }
        return false
    }

    // M2
    fun hasAuthor(authorNif: String): Boolean {
        for (book in books) {
            if (book.hasAuthor(authorNif)) { //Bucle interno para revisar los autores del libro
                return true
            }
        }
        return false
    }

}