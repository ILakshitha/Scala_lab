file://<WORKSPACE>/labsheet_8/Q2.scala
### dotty.tools.dotc.core.TypeError$$anon$1: Toplevel definition main is defined in
  <WORKSPACE>/labsheet_7/Q2.scala
and also in
  <WORKSPACE>/labsheet_8/Q1.scala
One of these files should be removed from the classpath.

occurred in the presentation compiler.

presentation compiler configuration:
Scala version: 3.3.3
Classpath:
<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/scala3-library_3/3.3.3/scala3-library_3-3.3.3.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/scala-library/2.13.12/scala-library-2.13.12.jar [exists ]
Options:



action parameters:
offset: 229
uri: file://<WORKSPACE>/labsheet_8/Q2.scala
text:
```scala
import scala.io.StdIn

object NumberCategorizer {
  def main(args: Array[String]): Unit = {
    println("Please enter an integer: ")
    val input = StdIn.readInt()

    val categorize: Int => String = {
      case n if n % 3 == @@0 && n % 5 == 0 => "Multiple of Both Three and Five"
      case n if n % 3 == 0               => "Multiple of Three"
      case n if n % 5 == 0               => "Multiple of Five"
      case _                             => "Not a Multiple of Three or Five"
    }

    println(categorize(input))
  }
}

```



#### Error stacktrace:

```

```
#### Short summary: 

dotty.tools.dotc.core.TypeError$$anon$1: Toplevel definition main is defined in
  <WORKSPACE>/labsheet_7/Q2.scala
and also in
  <WORKSPACE>/labsheet_8/Q1.scala
One of these files should be removed from the classpath.