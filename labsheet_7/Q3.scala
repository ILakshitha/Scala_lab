object Main {
  def main(args: Array[String]): Unit = {
    val numbers = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val primes = filterPrime(numbers)
    println(primes)  // Output: List(2, 3, 5, 7)
  }

  def filterPrime(numbers: List[Int]): List[Int] = {
    def isPrime(n: Int): Boolean = {
      if (n <= 1) false
      else if (n == 2) true
      else !(2 to math.sqrt(n).toInt).exists(x => n % x == 0)
    }

    numbers.filter(isPrime)
  }
}
