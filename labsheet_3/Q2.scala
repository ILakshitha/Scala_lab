object Q2{

def filterLongStrings(strings: List[String]): List[String] = {
  strings.filter(_.length > 5)
}

def main(args:Array[String])={
  
val inputList = List("Scala", "programming", "is", "fun", "and", "educational")
val result = filterLongStrings(inputList)
println(result)  // Output: List(programming, educational)
}

}