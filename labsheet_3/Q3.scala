object ArithmeticMeanCalculator {
  def calculateMean(num1: Int, num2: Int): Double = {
    val mean = (num1 + num2) / 2.0
    Math.round(mean*100.0)/100.0
  }

  def main(args: Array[String]): Unit = {
    val num1 = -5
    val num2 = 10
    val mean = calculateMean(num1, num2)
    println(s"The arithmetic mean of $num1 and $num2 is $mean")
  }
}
