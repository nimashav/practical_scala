object EvenNumberFilter {
  def filterEvenNumbers(numbers: List[Int]): List[Int] = {
    numbers.filter(num => num % 2 == 0)
  }

  def main(args: Array[String]): Unit = {
    println("Enter a list of integers separated by spaces:")
    val inputLine = scala.io.StdIn.readLine()
    val input = inputLine.split(" ").toList.map(_.toInt)
    val output = filterEvenNumbers(input)
    println(s"Input: $input")
    println(s"Output: $output")
  }
}