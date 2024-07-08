object PatternMatching{
  def main(args: Array[String]): Unit ={
    println("Please enter an integer :")
    
    val input = scala.io.StdIn.readInt()

    input match {
      case x if x <=0 => println("Negative/Zero is input")
      case x if x%2 == 0 => println("Even number is given")
      case x if x%2 != 0 => println("Odd number is given")
    }
  }
}