package org.scala99

import org.scalatest._

class P10Spec extends FunSuite {

  test ("P10: encode") {
    val actual = P10.encode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
    val expect =  List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e))

    assert(actual equals expect)
  }

}

