package org.scala99

import org.scalatest._

class P03Spec extends FunSuite {

  test ("P03: Element found") {
    assert(P03.nth(2, List(1,1,2,3,5,8)) == 2)
    assert(P03.nth(1, List(1,1,2,3,5,8)) == 0)
    assert(P03.nth(8, List(1,1,2,3,5,8)) == 5)
  }

}

