package org.scala99

import org.scalatest._

class P11Spec extends FunSuite {

  test ("P11: encodedModified") {
    val l = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
    val expect = List((4,'a), 'b, (2,'c), (2,'a), 'd, (4,'e))
    val actual = P11.encodeModified(l)
    assert(expect equals actual)
  }

}

