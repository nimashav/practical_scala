object LibraryManagement extends App {
  
  case class Book(title: String, author: String, isbn: String)

  var library: Set[Book] = Set(
    Book("Madolduwa", "Martin Wickramasinghe", "12345678"),
    Book("Snow White", "Harper Lee", "98765432"),
    Book("The jungle of the book", "Jorge lee", "23456789")
  )


  def addBook(book: Book): Unit = {
    library += book
  }


  def removeBook(isbn: String): Unit = {
    library = library.filterNot(_.isbn == isbn)
  }

  
  def isBookInLibrary(isbn: String): Boolean = {
    library.exists(_.isbn == isbn)
  }


  def displayLibrary(): Unit = {
    println("Current Library Collection:")
    library.foreach(book => println(s"Title: ${book.title}, Author: ${book.author}, ISBN: ${book.isbn}"))
  }


  def searchByTitle(title: String): Unit = {
    val result = library.find(_.title.equalsIgnoreCase(title))
    result match {
      case Some(book) => println(s"Book Found: Title: ${book.title}, Author: ${book.author}, ISBN: ${book.isbn}")
      case None => println("Book not found.")
    }
  }

  def displayBooksByAuthor(author: String): Unit = {
    val booksByAuthor = library.filter(_.author.equalsIgnoreCase(author))
    if (booksByAuthor.isEmpty) {
      println(s"No books found by author: $author")
    } else {
      println(s"Books by $author:")
      booksByAuthor.foreach(book => println(s"Title: ${book.title}, ISBN: ${book.isbn}"))
    }
  }
  displayLibrary()
  println()

  println("Adding a new book...")
  addBook(Book("Brave New World", "Aldous Huxley", "4567890123"))
  displayLibrary()
  println()

  println("Removing a book with ISBN 98765432...")
  removeBook("98765432")
  displayLibrary()
  println()

  println("Checking if a book with ISBN 12345678 is in the library...")
  println(isBookInLibrary("12345678"))
  println()

  println("Searching for a book with the title 'Madolduwa'...")
  searchByTitle("Madolduwa")
  println()

  println("Displaying all books by Martin Wickramasinghe...")
  displayBooksByAuthor("Martin Wickramasinghe")
}
