object PatternMatchingExample {

  def main(args: Array[String]): Unit = {

    print("Please enter an integer: ")
    val input = scala.io.StdIn.readInt()

    val checkNumber: Int => String = number => number match {
      case n if n <= 0    => "Negative/Zero is input"
      case n if n % 2 == 0 => "Even number is given"
      case _              => "Odd number is given"
    }

    println(checkNumber(input))
  }
}
