package org.scala99

/****************************
 Split a list into two parts.
The length of the first part is given. Use a Tuple for your result.
Example:

scala> split(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
res0: (List[Symbol], List[Symbol]) = (List('a, 'b, 'c),List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
*****************************/

object P17 {

  def split[A](num:Int, l:List[A]) : (List[A], List[A]) = (num, l) match {
    case (_, Nil) => (Nil, Nil)
    case (0, list) => (Nil, list)
    case (n, x :: xs) => {
      val (head, tail) = split(n-1, xs)
      (x :: head, tail)
    }
  }
}

