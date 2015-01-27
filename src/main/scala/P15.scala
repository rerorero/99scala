package org.scala99

/****************************
Duplicate the elements of a list a given number of times.
Example:
scala> duplicateN(3, List('a, 'b, 'c, 'c, 'd))
res0: List[Symbol] = List('a, 'a, 'a, 'b, 'b, 'b, 'c, 'c, 'c, 'c, 'c, 'c, 'd, 'd, 'd)
*****************************/

object P15 {

  def duplicateN[A](num:Int, l:List[A]) : List[A] = l.flatMap { Common.timesList(num, _) }
}

