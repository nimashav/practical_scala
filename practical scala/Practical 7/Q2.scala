object SquareNumbers{
  def calculateSquare(Numbers: List[Int]) : List[Int] = {
    Numbers.map(num => num * num)
  }

  def main(args: Array[String]): Unit = {
    println("Enter Integer List seperated by spaces: ")
    val inputLine=scala.io.StdIn.readLine()
    val input=inputLine.split(" ").toList.map(_.toInt)
    val output=calculateSquare(input)
    println(s"Input: $input")
    println(s"Output: $output")
  }
}