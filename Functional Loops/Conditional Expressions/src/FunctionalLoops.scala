import org.scalatest.{FlatSpec, Matchers}

object FunctionalLoops extends FlatSpec with Matchers {
    def factorial(n: Int): Int =
        if (n == 0) 1
        else n * factorial(n - 1)

    def main(args: Array[String]): Unit = {
        println(factorial(5))
    }
}