file://<WORKSPACE>/labsheet_9/Q3.scala
### dotty.tools.dotc.core.TypeError$$anon$1: Toplevel definition main is defined in
  <WORKSPACE>/labsheet_8/Q1.scala
and also in
  <WORKSPACE>/labsheet_9/Q3.scala
One of these files should be removed from the classpath.

occurred in the presentation compiler.

presentation compiler configuration:
Scala version: 3.3.3
Classpath:
<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/scala3-library_3/3.3.3/scala3-library_3-3.3.3.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/scala-library/2.13.12/scala-library-2.13.12.jar [exists ]
Options:



action parameters:
offset: 225
uri: file://<WORKSPACE>/labsheet_9/Q3.scala
text:
```scala
object Q3{
  // Upper case
  def toUpper(name: String): String = name.toUpperCase

  // lower case
  def toLower(name: String): String = name.toLowerCase

  //format name function
  def formatNames(name: String)(formatFunc: S@@tring => String): String = formatFunc(name)

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

```



#### Error stacktrace:

```

```
#### Short summary: 

dotty.tools.dotc.core.TypeError$$anon$1: Toplevel definition main is defined in
  <WORKSPACE>/labsheet_8/Q1.scala
and also in
  <WORKSPACE>/labsheet_9/Q3.scala
One of these files should be removed from the classpath.