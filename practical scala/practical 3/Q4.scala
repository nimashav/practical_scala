 import scala.io.StdIn.readLine

 object EvenSum{
  def main(args:Array[Strings]):Unit={
    def sumEvenNumbers(numbers:List[Int]):Int={
      numbers.filter(_%2==0).sum
    }
    println("Enter a list of integers separated by spaces:")
    val input=readLine()

    val numbers=input.split("").map(_.toInt).toList

    val evenSum=sumEvenNumbers(numbers)

    println(s"The sum of even numbers in thelist is: $evenSum")
  }
 }
 


