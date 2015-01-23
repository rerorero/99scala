package org.scala99

/****************************
Flatten a nested list structure.
Example:
scala> flatten(List(List(1, 1), 2, List(3, List(5, 8))))
res0: List[Any] = List(1, 1, 2, 3, 5, 8)
*****************************/

object P07 {

  def flatten(l:List[Any]) : List[Any] = l match {
    case Nil => Nil
    case (x : List[Any]) :: xs => flatten(x) ::: flatten(xs)
    case x :: xs => x :: flatten(xs)
  }
}

