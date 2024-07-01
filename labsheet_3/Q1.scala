object StringReverser {
  def reverseString(str: String): String = {
    if (str.isEmpty) ""
    else reverseString(str.substring(1)) + str.charAt(0)
  }

  def main(args: Array[String]): Unit = {
    val input = "hello"
    val reversed = reverseString(input)
    println(s"Reversed string: $reversed")
  }
}
