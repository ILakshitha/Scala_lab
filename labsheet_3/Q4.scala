object EvenSumCalculator {
  def sumEvenNumbers(nums: List[Int]): Int = {
    nums.filter(_ % 2 == 0).sum
  }

  def main(args: Array[String]): Unit = {
    val numbers = List(1, 2, 3, 4, 5, 6)
    val sumOfEvens = sumEvenNumbers(numbers)
    println(s"The sum of all even numbers in the list is: $sumOfEvens")
  }
}
