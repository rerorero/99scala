package org.scala99

/****************************
Drop every Nth element from a list.
Example:
scala> drop(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
res0: List[Symbol] = List('a, 'b, 'd, 'e, 'g, 'h, 'j, 'k)
*****************************/

object P16 {

  def drop[A](num:Int, l:List[A]) : List[A] = l.zipWithIndex
    .filter(tpl => ((tpl._2 + 1) % num != 0))
    .map { _._1 }
}

