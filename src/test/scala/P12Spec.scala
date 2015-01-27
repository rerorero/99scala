package org.scala99

import org.scalatest._

class P12Spec extends FunSuite {

  test ("P12: decode") {
    val l = List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e))
    val expect = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
    assert(P12.decode(l) equals expect)
  }

}

