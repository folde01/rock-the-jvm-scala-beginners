package playground

object ScalaPlayground extends App {
  println("hello scala")

  def recursiveSum(ds: Seq[Double]): Double = {
    def helper(seq: Seq[Double], sum: Double, index: Int): Double =
      if (index == seq.length) sum
      else helper(seq, sum + seq(index), index + 1)

    helper(ds, 0, 0)
  }

  println(recursiveSum(Seq(1,2)))
}