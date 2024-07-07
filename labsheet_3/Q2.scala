object Q2{

def filterLongStrings(strings: List[String]): List[String] = {
  strings.filter(_.length > 5)
}

def main(args:Array[String])={
  
val inputList = List("Ishan", "Lakshitha", "mahesh", "isuru", "asd", "bodima")
val result = filterLongStrings(inputList)
println(result)
}

}