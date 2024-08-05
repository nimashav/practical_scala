object PrimeNumbers{
  def filterPrime(Numbers: List[Int]) : List[Int] = {
    def isPrime(n: Int): Boolean = {
      if(n <= 1) false
      else if (n == 2) true
      else !(2 until n).exists(i => n % i == 0)
    }

    Numbers.filter(num => isPrime(num))
  }

  def main(args: Array[String]): Unit = {
    println("Enter Integer List seperated by spaces: ")
    val inputLine=scala.io.StdIn.readLine()
    val input=inputLine.split(" ").toList.map(_.toInt)
    val output=filterPrime(input)
    println(s"Input: $input")
    println(s"Output: $output")
  }
}