error id: file://<WORKSPACE>/labsheet_9/Q3.scala:[26..29) in Input.VirtualFile("file://<WORKSPACE>/labsheet_9/Q3.scala", "object 
  // Upper case
  def toUpper(name: String): String = name.toUpperCase

  // lower case
  def toLower(name: String): String = name.toLowerCase

  //format name function
  def formatNames(name: String)(formatFunc: String => String): String = formatFunc(name)

  def main(args: Array[String]): Unit = {
    // Applying different formats using the formatNames method and lambda functions

    // BENNY - convert whole name to upper case
    println(formatNames("Benny")(toUpper))

    // NIroshan - convert first two characters to upper case, rest to lower case
    println(formatNames("Niroshan")(name => name.substring(0, 2).toUpperCase + name.substring(2).toLowerCase))

    // saman - convert whole name to lower case
    println(formatNames("Saman")(toLower))

    // KumarA - convert first and last characters to upper case, rest to lower case
    println(formatNames("Kumara")(name => name.substring(0, 1).toUpperCase + name.substring(1, name.length - 1).toLowerCase + name.substring(name.length - 1).toUpperCase))
  }
}
")
file://<WORKSPACE>/labsheet_9/Q3.scala
file://<WORKSPACE>/labsheet_9/Q3.scala:3: error: expected identifier; obtained def
  def toUpper(name: String): String = name.toUpperCase
  ^
#### Short summary: 

expected identifier; obtained def