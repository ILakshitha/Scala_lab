file://<WORKSPACE>/labsheet_7/Q3.scala
### dotty.tools.dotc.core.TypeError$$anon$1: Toplevel definition main is defined in
  <WORKSPACE>/labsheet_7/Q1.scala
and also in
  <WORKSPACE>/labsheet_7/Q2.scala
One of these files should be removed from the classpath.

occurred in the presentation compiler.

presentation compiler configuration:
Scala version: 3.3.3
Classpath:
<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/scala3-library_3/3.3.3/scala3-library_3-3.3.3.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/scala-library/2.13.12/scala-library-2.13.12.jar [exists ]
Options:



action parameters:
offset: 124
uri: file://<WORKSPACE>/labsheet_7/Q3.scala
text:
```scala
object Main {
  def main(args: Array[String]): Unit = {
    val numbers = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val primes@@ = filterPrime(numbers)
    println(primes)  // Output: List(2, 3, 5, 7)
  }

  def filterPrime(numbers: List[Int]): List[Int] = {
    def isPrime(n: Int): Boolean = {
      if (n <= 1) false
      else if (n == 2) true
      else !(2 to math.sqrt(n).toInt).exists(x => n % x == 0)
    }

    numbers.filter(isPrime)
  }
}

```



#### Error stacktrace:

```

```
#### Short summary: 

dotty.tools.dotc.core.TypeError$$anon$1: Toplevel definition main is defined in
  <WORKSPACE>/labsheet_7/Q1.scala
and also in
  <WORKSPACE>/labsheet_7/Q2.scala
One of these files should be removed from the classpath.