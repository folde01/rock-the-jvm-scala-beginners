package playground

object ScalaPlayground extends App {
  println("hello scala")

  def recursiveSum(ds: Seq[Double]): Double = {
    def helper(seq: Seq[Double], sum: Double, index: Int): Double =
      if (index == seq.length) sum
      else helper(seq, sum + seq(index), index + 1)

    helper(ds, 0, 0)
  }

  def factorial(n: Int): Int = {
    def go(m: Int, product: Int): Int = {
      if (m == 0 || m == 1) product
      else go(m - 1, product * m)
    }
    go(n, 1)
  }


  println(factorial(0))
  println(factorial(1))
  println(factorial(2))
  println(factorial(3))
}