package org.scala99

import org.scalatest._

class P18Spec extends FunSuite {

  test ("P18: slice") {
    val expect = List('d, 'e, 'f, 'g)
    val actual = P18.slice(3, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
    assert(actual equals expect)
  }

}

