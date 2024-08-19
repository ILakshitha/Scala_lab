error id: file://<WORKSPACE>/labsheet_9/Q2.scala:[38..39) in Input.VirtualFile("file://<WORKSPACE>/labsheet_9/Q2.scala", "import scala.io.StdIn.readInt

object {
  def main(args: Array[String]): Unit = {
    // Function to categorize the input number using pattern matching
    val categorizeNumber: Int => String = num => num match {
      case n if n <= 0 => "Negative/Zero is input"
      case n if n % 2 == 0 => "Even number"
      case n if n % 2 != 0 => "Odd number"
      
    }

    // Get user input
    println("Please enter an integer: ")
    
      val inputNumber = readInt() // Reading user input as an integer
      val result = categorizeNumber(inputNumber)
      println(result)
    
  }
}
")
file://<WORKSPACE>/labsheet_9/Q2.scala
file://<WORKSPACE>/labsheet_9/Q2.scala:3: error: expected identifier; obtained lbrace
object {
       ^
#### Short summary: 

expected identifier; obtained lbrace