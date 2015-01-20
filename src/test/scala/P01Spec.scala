package org.scala99

import org.scalatest._

/****************************

P01 (*) Find the last element of a list.
Example:
scala> last(List(1, 1, 2, 3, 5, 8))

*****************************/

class P01Spec extends FunSuite {

  test ("last returns last") {
    assert(P01.last(List(1,3,4,5,8)) === 8)
  }

  test("last returns Nil with empty list") {
    intercept[RuntimeException] {
      P01.last(List())
    }
  }

}

