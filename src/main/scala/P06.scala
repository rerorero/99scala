package org.scala99

/****************************
Find out whether a list is a palindrome.
Example:
scala> isPalindrome(List(1, 2, 3, 2, 1))
res0: Boolean = true
*****************************/

object P06 {

  def isPallindrome[A](l:List[A]) : Boolean = Common.isEqualList(l, P05.reverse(l))
}

