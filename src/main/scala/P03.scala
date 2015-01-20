package org.scala99

/****************************
Find the Kth element of a list.
By convention, the first element in the list is element 0.
Example:

scala> nth(2, List(1, 1, 2, 3, 5, 8))
res0: Int = 2
*****************************/

object P03 {

  def nth[A](value : A, list : List[A]) : Int = findRecursive(value, 0, list)

  def findRecursive[A](elem: A, i : Int, list : List[A]) : Int = (i, list) match {
    case (_, Nil) => throw new RuntimeException
    case (i, x :: xs) => if (x == elem) i else findRecursive(elem, i+1, xs)
  }
}

