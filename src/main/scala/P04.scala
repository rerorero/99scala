package org.scala99

/****************************
Find the number of elements of a list.
Example:
scala> length(List(1, 1, 2, 3, 5, 8))
res0: Int = 6
*****************************/

object P04 {

  def length[A](l:List[A]) : Int = l match {
    case Nil => 0
    case x :: xs => length(xs) + 1
  }

}

