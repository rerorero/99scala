package org.scala99

import org.scalatest._

class P19Spec extends FunSuite {

  test ("P19 rotate") {
    val actual = P19.rotate(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
    val expected = List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k, 'a, 'b, 'c)
    assert(actual equals expected)
  }

  test ("P19 rotate2") {
    val actual = P19.rotate(-2, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
    val expected = List('j, 'k, 'a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i)
    assert(actual equals expected)
  }

}

