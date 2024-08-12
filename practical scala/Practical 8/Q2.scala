object NumberCategorizer {
  def main(args: Array[String]): Unit = {
  
    println("Enter an integer:")

    val input = scala.io.StdIn.readInt()

    val isMultipleOfThree = (n: Int) => n % 3 == 0
    val isMultipleOfFive = (n: Int) => n % 5 == 0

    val message = (isMultipleOfThree(input), isMultipleOfFive(input)) match {
      case (true, true)  => "Multiple of Both Three and Five"
      case (true, false) => "Multiple of Three"
      case (false, true) => "Multiple of Five"
      case (false, false) => "Not a Multiple of Three or Five"
    }

    println(message)
  }
}
