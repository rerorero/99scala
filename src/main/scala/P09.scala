package org.scala99

/****************************
Pack consecutive duplicates of list elements into sublists.
If a list contains repeated elements they should be placed in separate sublists.
Example:

scala> pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
res0: List[List[Symbol]] = List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e))
*****************************/

object P09 {

  def pack[A](l:List[A]) : List[List[A]] = l match {
    case Nil => List(List.empty[A])
    case x :: xs => {
      l.span { _ == x } match {
        case (xss, Nil) => List(xss)
        case (xss, ys) => xss :: pack(ys)
      }
    }
  }
}

