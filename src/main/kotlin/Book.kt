package org.example

data class Book( // clase
    val isbn: String,
    val titule: String,
    val year: Int,
    val authors: Set<Author>
) { // Cuerpo del metodo

    fun hasAuthor(nif: String): Boolean { //Lo que está fuera del parentisis te lo devuelve
        for (author in authors) {
            if (author.nif == nif) {
                return true
            }
        }
        return false
    }
}