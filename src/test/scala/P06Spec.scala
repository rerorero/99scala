package org.scala99

import org.scalatest._

class P06Spec extends FunSuite {

  test ("P06: isEqualList") {
    assert(Common.isEqualList(List(1,1,2,3,5,8), List(1,1,2,3,5,8)))
    assert(Common.isEqualList(List(1), List(1)))
    assert(Common.isEqualList(List(), List()))

    assert(!Common.isEqualList(List(1,1,2,3,5,8), List(1,1,2,3,5,9)))
    assert(!Common.isEqualList(List(1,1,2,3,5), List(1,1,2,3,5,9)))
    assert(!Common.isEqualList(List(), List(1,1,2,3,5,9)))
    assert(!Common.isEqualList(List(1), List()))
  }

  test("P06: isPallindrome") {
    assert(P06.isPallindrome(List(1,2,2,1)))
    assert(P06.isPallindrome(List(1,2,3,2,1)))
    assert(P06.isPallindrome(List(1)))

    assert(!P06.isPallindrome(List(1,1,2,2)))
    assert(!P06.isPallindrome(List(1,2)))
  }

}

