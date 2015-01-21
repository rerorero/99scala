package org.scala99

/****************************
Reverse a list.
Example:
scala> reverse(List(1, 1, 2, 3, 5, 8))
res0: List[Int] = List(8, 5, 3, 2, 1, 1)
*****************************/

object P05 {

  def reverse[A](l:List[A]) : List[A] = Common.foldl(List.empty[A], l) { (e, acc) => e::acc }

}

