package org.scala99

import org.scalatest._

class P17Spec extends FunSuite {

  test ("P17: split") {
    val actual = P17.split(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
    val expect = (List('a, 'b, 'c),List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
    assert(actual equals expect)
  }

}

