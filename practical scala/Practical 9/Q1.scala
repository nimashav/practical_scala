object InterestCalculator {

  def main(args: Array[String]): Unit = {
    
    val calculateInterest: Double => Double = depositAmount => {
      depositAmount match {
        case amount if amount <= 20000    => amount * 0.02
        case amount if amount <= 200000   => amount * 0.04
        case amount if amount <= 2000000  => amount * 0.035
        case amount if amount > 2000000   => amount * 0.065
      }
    }

    val depositAmount1 = 15000.0
    val depositAmount2 = 50000.0
    val depositAmount3 = 500000.0
    val depositAmount4 = 3000000.0

    println(s"Interest for Rs. $depositAmount1: Rs. ${calculateInterest(depositAmount1)}")
    println(s"Interest for Rs. $depositAmount2: Rs. ${calculateInterest(depositAmount2)}")
    println(s"Interest for Rs. $depositAmount3: Rs. ${calculateInterest(depositAmount3)}")
    println(s"Interest for Rs. $depositAmount4: Rs. ${calculateInterest(depositAmount4)}")
  }
}


