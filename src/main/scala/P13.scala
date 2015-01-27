package org.scala99

/****************************
Run-length encoding of a list (direct solution).
Implement the so-called run-length encoding data compression method directly. I.e. don't use other methods you've written (like P09's pack); do all the work directly.
Example:

scala> encodeDirect(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
res0: List[(Int, Symbol)] = List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e))
*****************************/

object P13 {

  def encodeDirect[A](l : List[A]) : List[(Int, A)] = l match {
    case Nil => Nil
    case x :: xs => {
      val (packed, rest) = l.span { _ == x }
      (packed.length, x) :: encodeDirect(rest)
    }
  }
}

