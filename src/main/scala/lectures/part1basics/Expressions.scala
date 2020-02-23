package lectures.part1basics

object Expressions extends App {
  println(if(true) 4 else 5)
  var y = 2
  val x = (y = 3)
  println(x)

  val xx: Unit = while(true) {}

  val ddd: String = {
    val d = 2
    if (d == 2) "xx" else "sss"
  }

  val xxx = { 2 < 3 }
}
