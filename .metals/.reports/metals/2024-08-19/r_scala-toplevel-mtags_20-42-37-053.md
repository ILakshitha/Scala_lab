error id: file://<WORKSPACE>/labsheet_9/Q3.scala:[133..136) in Input.VirtualFile("file://<WORKSPACE>/labsheet_9/Q3.scala", "object Q3{

  def toUpper(name: String): String = name.toUpperCase

  def  //def toLower(name: String): String = name.toLowerCase

  def formatNames(name: String)(formatFunc: String => String): String = formatFunc(name)

  def main(args: Array[String]): Unit = {
   
    println(formatNames("Benny")(toUpper))

    println(formatNames("Niroshan")(name => name.substring(0, 2).toUpperCase + name.substring(2).toLowerCase))

    println(formatNames("Saman")(toLower))

    println(formatNames("Kumara")(name => name.substring(0, 1).toUpperCase + name.substring(1, name.length - 1).toLowerCase + name.substring(name.length - 1).toUpperCase))
  }
}
")
file://<WORKSPACE>/labsheet_9/Q3.scala
file://<WORKSPACE>/labsheet_9/Q3.scala:7: error: expected identifier; obtained def
  def formatNames(name: String)(formatFunc: String => String): String = formatFunc(name)
  ^
#### Short summary: 

expected identifier; obtained def