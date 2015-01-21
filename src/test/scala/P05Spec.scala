package org.scala99

import org.scalatest._

class P05Spec extends FunSuite {

  test ("P05: Reverse list") {
    assert(P05.reverse(List(1,1,2,3,5,8)) === List(8,5,3,2,1,1))
  }

}

