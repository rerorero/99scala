package org.scala99

import org.scalatest._

class P13Spec extends FunSuite {

  test ("P13: encodeDirect") {
    val expect = List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e))
    val actual = P13.encodeDirect(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
    assert(expect equals actual)
  }

}

