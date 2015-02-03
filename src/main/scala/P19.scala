package org.scala99

/****************************
Rotate a list N places to the left.
Examples:
scala> rotate(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
res0: List[Symbol] = List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k, 'a, 'b, 'c)

scala> rotate(-2, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
res1: List[Symbol] = List('j, 'k, 'a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i)
*****************************/

object P19 {
  def rotate[A](index: Int, l: List[A]) = {
    def rotateR(index: Int, cut: List[A], remain: List[A]) : List[A] = (index, remain) match {
      case (0, _) => remain ++ cut
      case (i, x :: xs) if i > 0 => rotateR(i - 1, cut ++ List(x), xs)
    }
    index match {
      case i if i >= 0 => rotateR(i, List.empty[A], l)
      case i => rotateR(l.size + i, List.empty[A], l)
    }
  }
}

