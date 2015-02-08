package org.scala99

/****************************
Create a list containing all integers within a given range.
Example:
scala> range(4, 9)
res0: List[Int] = List(4, 5, 6, 7, 8, 9)
*****************************/

object P22 {
  def range(from:Int, to:Int) : List[Int] = (to - from) match {
    case 0 => List(to)
    case _ => from :: range(from + 1, to)
  }
}

