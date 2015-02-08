package org.scala99

/****************************
 Insert an element at a given position into a list.
Example:
scala> insertAt('new, 1, List('a, 'b, 'c, 'd))
res0: List[Symbol] = List('a, 'new, 'b, 'c, 'd)
*****************************/

object P21 {
  def insertAt[A](elem: A, index: Int, l: List[A]) : List[A] = (index, l) match {
    case (0, xs) => elem :: xs
    case (_, Nil) => Nil
    case (i, x :: xs) => x :: insertAt(elem, i - 1, xs)
  }
}

