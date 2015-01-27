package org.scala99

import org.scalatest._

class P14Spec extends FunSuite {

  test ("P14: duplicate") {
    val expect = List('a, 'a, 'b, 'b, 'c, 'c, 'c, 'c, 'd, 'd)
    val actual = P14.duplicate(List('a, 'b, 'c, 'c, 'd))
    assert(expect equals actual)
  }

}

