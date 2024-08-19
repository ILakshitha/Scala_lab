import scala.io.StdIn.readInt

object Q2{
  def main(args: Array[String]): Unit = {
    
    val categorizeNumber: Int => String = num => num match {
      case n if n <= 0 => "Negative/Zero is input"
      case n if n % 2 == 0 => "Even number"
      case n if n % 2 != 0 => "Odd number"
      
    }

   
    println("Please enter an integer: ")
    
      val inputNumber = readInt() 
      val result = categorizeNumber(inputNumber)
      println(result)
    
  }
}
