package org.scala99

import org.scalatest._

class P09Spec extends FunSuite {

  test ("some test") {
    val result = P09.pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
    val expect = List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e))
    assert(result equals expect)
  }

}

