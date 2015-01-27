package org.scala99

/****************************
Modified run-length encoding.
Modify the result of problem P10 in such a way that if an element has no duplicates it is simply copied into the result list. Only elements with duplicates are transferred as (N, E) terms.
Example:

scala> encodeModified(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
res0: List[Any] = List((4,'a), 'b, (2,'c), (2,'a), 'd, (4,'e))
*****************************/

object P11 {

  def p11Element[A](length:Integer, elem:A) : Any = length match {
    case len if 1 == len => elem
    case len => (len, elem)
  }

  def encodeModified[A](l:List[A]) : List[Any] = l match {
    case Nil => List()
    case x :: xs => {
      l.span { _ == x } match {
        case (xss, Nil) => List(p11Element(xss.length, x))
        case (xss, yss) => p11Element(xss.length, x) :: encodeModified(yss)
      }
    }
  }
}

