package org.example

data class Library (
    val name: String,
    val books: List<Book>
) {
    // 1ºmetodo
    fun hasBook(isbn: String): Boolean {
        for (book in books) {
            if (book.isbn == isbn) {
                return true
            }
        }
        return false
    }

    // 2ºmetodo
    fun hasAuthor(authorNif: String): Boolean {
        for (book in books) {
            if (book.hasAuthor(authorNif)) { //Bucle interno para revisar los autores del libro
                return true
            }
        }
        return false
    }

}