object RationalNumbersApp {
  
  class Rational(n: Int, d: Int) {
    require(d != 0, "Denominator must be non-zero")
    
    private val g = gcd(n.abs, d.abs)
    val numerator: Int = n / g
    val denominator: Int = d / g

    def this(n: Int) = this(n, 1)

    def neg: Rational = new Rational(-numerator, denominator)

    override def toString: String = s"$numerator/$denominator"

    private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)
  }

  def main(args: Array[String]): Unit = {
    val x = new Rational(3, 4)  
    val y = new Rational(5, 2)  

    
    println(s"Original Rational Number x: $x")  
    println(s"Original Rational Number y: $y")  

    val negX = x.neg
    val negY = y.neg

    println(s"Negated Rational Number of x: $negX")  
    println(s"Negated Rational Number of y: $negY")  
  }
}
