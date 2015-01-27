package org.scala99

import org.scalatest._

class P16Spec extends FunSuite {

  test ("P16: drop") {
    val actual = P16.drop(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
    val expect = List('a, 'b, 'd, 'e, 'g, 'h, 'j, 'k)
    assert(actual equals expect)
  }

}

