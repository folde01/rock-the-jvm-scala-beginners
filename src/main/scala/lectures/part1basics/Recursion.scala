package lectures.part1basics

import scala.annotation.tailrec

object Recursion extends App {
  // @tailrec
  def fac(n: Int): BigInt = {
    if (n <= 1) 1
    else {
      println(n + " needs " + (n-1))
      val result = n * fac(n - 1)
      println("done: " + n)
      result
    }
  }
//  println("fac(15):" + fac(15))
//  println("fac: " + fac(5000)) // stack overflow


  def facWithHelper(n: Int): BigInt = {
    @tailrec
    def loop(n: Int, acc: BigInt): BigInt = {
      if (n <= 1) acc
      else loop(n - 1, n * acc)
    }
    loop(n, 1)
  }
  println("facWithHelper " + facWithHelper(50000))
}
