package org.scala99

import org.scalatest._

class P20Spec extends FunSuite {

  test ("P20 removeAt") {
    val actual =  P20.removeAt(1, List('a, 'b, 'c, 'd))
    val expect = (List('a, 'c, 'd),'b)
    assert(actual equals expect)
  }

}

