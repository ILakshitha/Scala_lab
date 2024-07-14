object StringFormatter {
  
  // Method to convert a string to uppercase
  def toUpper(input: String): String = {
    input.toUpperCase
  }

  // Method to convert a string to lowercase
  def toLower(input: String): String = {
    input.toLowerCase
  }

  // Method to apply a formatting function to a name
  def formatNames(name: String)(formatFunction: String => String): String = {
    formatFunction(name)
  }

  def main(args: Array[String]): Unit = {
    // Test inputs
    val names = List("Benny", "Niroshan", "Saman", "Kumara")

    // Formatting and printing names
    names.foreach { name =>
      val formattedNameUpper = formatNames(name)(toUpper)
      val formattedNameLower = formatNames(name)(toLower)
      println(s"Original: $name, Uppercase: $formattedNameUpper, Lowercase: $formattedNameLower")
    }
  }
}
