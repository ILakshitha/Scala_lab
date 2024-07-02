object StringReverser {
  def reverseString(str: String): String = {
    if (str.isEmpty) ""
    else reverseString(str.tail) + str.head
  }

  def main(args: Array[String]): Unit = {
    
    //println("Enter string")

    val input = "Ishan"
    val reversed = reverseString(input)
    println(s"Reversed string: $reversed")
  }
}
