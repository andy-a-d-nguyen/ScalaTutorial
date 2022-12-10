import org.scalatest.{FlatSpec, Matchers}

import scala.annotation.tailrec

object RationalArithmetic extends FlatSpec with Matchers {
    class Rational(x: Int, y: Int) {
        @tailrec
        private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)

        private val g = gcd(x, y)

        def numer: Int = x / g

        def denom: Int = y / g

        def +(r: Rational) =
            new Rational(
                numer * r.denom + r.numer * denom,
                denom * r.denom
            )

        def -(r: Rational) =
            new Rational(
                numer * r.denom - r.numer * denom,
                denom * r.denom
            )

        def *(r: Rational) =
            new Rational(
                numer * r.numer,
                denom * r.denom
            )

        def /(r: Rational) =
            new Rational(
                numer * r.denom,
                denom * r.numer
            )
    }

    def main(args: Array[String]): Unit = {
        val firstRational = new Rational(3, 4)
        val secondRational = new Rational(11, 13)

        println((firstRational * secondRational).numer)
        println((firstRational * secondRational).denom)
        println((firstRational / secondRational).numer)
        println((firstRational / secondRational).denom)
    }
}