<h1>EJERCICIOS: Clases de datos, objetos y scripts</h1> 

> [!NOTE]
> Me faltan ejercicios por acabar.

    Crea la siguiente estructura de data classes con sus métodos

        Book:

            Campos:

                ISBN: String

                Titulo: String

                Año: int

                autores: Set<Autor>

            Métodos:

                hasAuthor(nif): Dado un nif devuelve si el libro tiene ese autor

        Autor:

            Campos:

                NIF

                Nombre

                Apellidos

        Biblioteca:

            Campos:

                Nombre

                Libros: List<Libro>

            Métodos

                hasBook(isbn): dado un ISBN devuelve si el libro existe en la biblioteca

                hasAuthor(authorNif): dado un NIF devuelve si hay algún libro de ese autor

                countBooks(authroNif): dado un NIF devuelve el número de libros del autor

                countYearBooks(year): dado un año, devuelve el número de libros de ese año.

--- 

<p align="center">
  <a href="https://github.com/ag-hp/dam.git"><img src="https://img.shields.io/badge/VER_REPOSITORIO_COMPLETO-DESARROLLO_DE_APLICACIONES_MULTIPLATAFORMA-238636?style=for-the-badge&logo=github&logoColor=white&labelColor=000000" alt="Ver Repositorio Completo Desarrollo de Aplicaciones Multiplataforma"></a>
</p>            
