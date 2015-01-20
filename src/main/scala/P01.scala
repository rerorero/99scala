package org.scala99

/****************************

P01 (*) Find the last element of a list.
Example:
scala> last(List(1, 1, 2, 3, 5, 8))

*****************************/

object P01 {

  def last[A](l:List[A]) : A = l match {
    case Nil => throw new RuntimeException("Empty");
    case tail :: Nil => tail
    case x :: xs => last(xs)
  }
}

