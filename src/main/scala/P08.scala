package org.scala99

/****************************
Eliminate consecutive duplicates of list elements.
If a list contains repeated elements they should be replaced with a single copy of the element. The order of the elements should not be changed.
Example:

scala> compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
res0: List[Symbol] = List('a, 'b, 'c, 'a, 'd, 'e)
*****************************/

object P08 {

  def compRecursive[A](l:List[A], tail:Any) : List[A] = l match {
    case Nil => Nil
    case x :: xs if x == tail => compRecursive(xs, x)
    case x :: xs => x :: compRecursive(xs, x)
  }

  def compress[A](l:List[A]) : List[A] = compRecursive(l, Nil)
}

