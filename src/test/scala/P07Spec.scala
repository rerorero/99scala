package org.scala99

import org.scalatest._

class P07Spec extends FunSuite {

  test ("P07: flatten") {
    val l = List(List(1, 1), 2, List(3, List(5, 8)))
    assert(P07.flatten(l).equals(List(1,1,2,3,5,8)))
  }

}

