package org.scala99

import org.scalatest._

class P04Spec extends FunSuite {

  test ("P04 length") {
    assert(P04.length(List(1,1,2,3,5,8)) === 6)
    assert(P04.length(List()) === 0)
  }

}

