package org.scala99

import org.scalatest._

class P22Spec extends FunSuite {

  test ("P22 range") {
    val actual = P22.range(4, 9)
    val expected = List(4, 5, 6, 7, 8, 9)
    assert(actual equals expected)
  }

}

