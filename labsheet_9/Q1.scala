object Q1 {
  def main(args: Array[String]): Unit = {
    val calculateInterest: Double => Double = amount => amount match {
      case a if a <= 20000     => a * 0.02
      case a if a <= 200000    => a * 0.04
      case a if a <= 2000000   => a * 0.035
      case a if a > 2000000    => a * 0.065
    }

    val depositAmount = 1500000.0
    val interest = calculateInterest(depositAmount)
    println(f"The interest earned on Rs. $depositAmount%.2f is Rs. $interest%.2f")
  }
}
