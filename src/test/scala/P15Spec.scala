package org.scala99

import org.scalatest._

class P15Spec extends FunSuite {

  test ("P15: duplicateN") {
    val actual = P15.duplicateN(3, List('a, 'b, 'c, 'c, 'd))
    val expect = List('a, 'a, 'a, 'b, 'b, 'b, 'c, 'c, 'c, 'c, 'c, 'c, 'd, 'd, 'd)
    assert(actual equals expect)
  }

}

