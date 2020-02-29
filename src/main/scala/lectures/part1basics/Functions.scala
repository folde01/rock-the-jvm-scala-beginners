package lectures.part1basics

import scala.annotation.tailrec

object Functions extends App {

  def aFunc(a: String, b: Int) = {
    a + "" + b
  }

  println(aFunc("aa", 2))

  def noParams(): Int = 42
  println(noParams())
  println(noParams)

  def repeater(s: String, n: Int): String = {
    if (n == 1) s
    else s + repeater(s, n-1)
  }

  println(repeater("a", 5))

  def greet(name: String, age: Int) = {
    "I'm " + name + " and I'm " + age + " year" + (if (age > 1) "s" else "") + " old"
  }

  println(greet("jo", 11))

  def factorial(n: Int): Int = {
    if (n == 0 || n == 1) 1
    else n * factorial(n - 1)
  }

  println(factorial(1))
  println(factorial(2))
  println(factorial(3))

  def fibonacci(n: Int): Int = {
    if (n == 1 || n == 2) 1
    else fibonacci(n - 1) + fibonacci(n - 2)
  }
  println(fibonacci(1))
  println(fibonacci(2))
  println(fibonacci(3))
  println(fibonacci(4))
  println(fibonacci(5))

  def foundDivisor(n: Int): Boolean = {

    if (n == 1) false
    else {
      n % (n - 1) == 0
    }
  }

  def isPrime(n: Int): Boolean = {
    // 2, 3, 5, 7, 11
    // 1: 1 % 1 == 0 .. c = 1
    // 2: 2 % 1 == 0, 2 % 2 == 0 .. c = 2
    // 3: 3 % 1 == 0, 3 % 2 == 1, 3 % 3 == 0 .. c = 2
    // 4: 4 % 1 == 0, 4 % 2 == 0, 4 % 3 == 1, 4 % 4 == 0 .. c = 3

    def factorCount(n: Int, count: Int, factor: Int): Int = {
      if (factor > n / 2) count + 1
      else {
        if (n % factor == 0) factorCount(n, count + 1, factor + 1)
        else factorCount(n, count, factor + 1)
      }
    }

    factorCount(n, 0, 1) == 2
  }

  for (n <- 1 to 20)
    println("isPrime(" + n + "): " + isPrime(n))


  // exercises - all with tail recursion:

  // 1. string concat
  def stringConcat(s: String, n: Int): String = {
    if (n == 1) s
    else s + stringConcat(s, n-1)
  }
  println(stringConcat("a", 4))

  def stringConcatTail(s: String, n: Int): String = {
    @tailrec
    def loop(s: String, n: Int, acc: String): String = {
      if (n == 1) acc + s
      else loop(s, n - 1, acc + s)
    }
    loop(s, n, "")
  }
  println(stringConcatTail("a", 10))
}
