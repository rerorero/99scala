package org.scala99

/****************************
Find the last but one element of a list.
Example:
scala> penultimate(List(1, 1, 2, 3, 5, 8))
res0: Int = 5
*****************************/

object P02 {

  def penultimate[A](l:List[A]) : A = l match {
    case Nil => throw new RuntimeException
    case x :: Nil => throw new RuntimeException
    case x1 :: x2 :: Nil => x1
    case x :: xs => penultimate(xs)
  }

}

