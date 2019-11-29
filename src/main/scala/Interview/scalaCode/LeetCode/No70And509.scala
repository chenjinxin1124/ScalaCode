package scalaCode.LeetCode

/**
  * @Author: chenjinxin
  * @Date: Created in 上午10:41 19-11-27
  * @Description:
  */

import Array._

object No70And509 extends App {

  def f(a: ((Int, Int), (Int, Int)), b: ((Int, Int), (Int, Int))) = {
    ((a._1._1 * b._1._1 + a._1._2 * b._2._1, a._1._1 * b._1._2 + a._1._2 * b._2._2), (a._2._1 * b._1._1 + a._2._2 * b._2._1, a._2._1 * b._1._2 + a._2._2 * b._2._2))
  }

  def fib(n: Long) = {
    var t = n
    var a: ((Int, Int), (Int, Int)) = ((1, 1), (1, 0))
    var b = a
    while (t != 0) {
      if (t % 2 == 1) {
        a = f(a, b)
      }
      b = f(b, b)
      t = t >> 1
    }
    a
  }

  for( i <- 1 to 10){
    println(fib(i-1))
  }

}
