package org.scala99

import org.scalatest._

class P21Spec extends FunSuite {

  test ("P21:InsertAt") {
    val actual =  P21.insertAt('new, 1, List('a, 'b, 'c, 'd))
    val expect = List('a, 'new, 'b, 'c, 'd)
    assert(actual equals expect)
  }

}

