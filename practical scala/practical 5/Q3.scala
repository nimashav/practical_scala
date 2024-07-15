object Fibonacci {
  def main(args: Array[String]): Unit = {
    val n = 10 
    for (i <- 0 until n) {
      println(fibonacci(i))
    }
  }

  def fibonacci(n: Int): Int = {
    if (n <= 1) {
      n
    } else {
      fibonacci(n - 1) + fibonacci(n - 2)
    }
  }
}
