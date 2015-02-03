package org.scala99

/****************************
Remove the Kth element from a list.
Return the list and the removed element in a Tuple. Elements are numbered from 0.
Example:

scala> removeAt(1, List('a, 'b, 'c, 'd))
res0: (List[Symbol], Symbol) = (List('a, 'c, 'd),'b)
*****************************/

object P20 {

  def removeAt[A](cur: Int, ls: List[A]) : (List[A], A) = (cur, ls) match {
    case (_, Nil) => throw new NoSuchElementException
    case (0, x :: xs) => (xs, x)
    case (cur, x :: xs) => {
      val (t, e) = removeAt(cur - 1, xs)
      (x :: t, e)
    }
  }
}

