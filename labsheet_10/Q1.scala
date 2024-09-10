class Rational(n: Int, d: Int) {
  require(d != 0, "Denominator cannot be zero")

  private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)

  private val g = gcd(n.abs, d.abs)
  val numerator: Int = n / g
  val denominator: Int = d / g

  def neg: Rational = new Rational(-numerator, denominator)

  override def toString: String = s"$numerator/$denominator"
}

object RationalTest extends App {
  val x = new Rational(13, 12)
  println(s"Original: $x") // 3/4
  println(s"Negated: ${x.neg}") // -3/4
}
