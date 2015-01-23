package org.scala99

import org.scalatest._

class P08Spec extends FunSuite {

  test ("P08: compress") {
    val result = P08.compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
    val expect = List('a, 'b, 'c, 'a, 'd, 'e)
    assert(result equals expect)
  }

}

