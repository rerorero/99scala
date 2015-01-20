package org.scala99

import org.scalatest._

class P02Spec extends FunSuite {

  test ("find one element of a list which has more than 2 elements") {
    assert(P02.penultimate(List(1,1,2,3,5,8)) === 5)
  }

}

