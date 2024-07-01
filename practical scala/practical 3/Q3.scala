import scala.io.StdIn.readLine

object ArithmeticMean{
  def calculateMean(n1:Int,n2:Int):Double={
    val mean=(n1+n2)/2.0
    BigDecimal(mean).setScale(2,BigDecimal.RoundingMode.HALF_UP).toDouble
  }

  def main(args:Array[String]):Unit={
    println("Enter the first integer:")
    val n1=readLine().toInt
    println("Enter the second integer:")
    val n2=readLine().toInt

    val mean=calculateMean(n1,n2)
    println(s"The arithmetic maen of $n1 and $n2 is: $mean")
  }
}

