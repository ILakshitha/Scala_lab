error id: file://<WORKSPACE>/labsheet_9/Q1.scala:[8..9) in Input.VirtualFile("file://<WORKSPACE>/labsheet_9/Q1.scala", "object  {
  def main(args: Array[String]): Unit = {
    val calculateInterest: Double => Double = amount => amount match {
      case a if a <= 20000     => a * 0.02
      case a if a <= 200000    => a * 0.04
      case a if a <= 2000000   => a * 0.035
      case a if a > 2000000    => a * 0.065
    }

    // Example usage
    val depositAmount = 1500000.0
    val interest = calculateInterest(depositAmount)
    println(s"The interest earned on Rs. $depositAmount is Rs. $interest")
  }
}
")
file://<WORKSPACE>/labsheet_9/Q1.scala
file://<WORKSPACE>/labsheet_9/Q1.scala:1: error: expected identifier; obtained lbrace
object  {
        ^
#### Short summary: 

expected identifier; obtained lbrace