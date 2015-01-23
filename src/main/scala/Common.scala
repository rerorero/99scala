package org.scala99

object Common {

  def foldl[A, B](init:B, l:List[A])(f:(A,B)=>B) : B = (init, l) match {
    case (acc, Nil) => acc
    case (acc, x :: xs) => foldl(f(x, acc), xs)(f)
  }

  def foldr[A, B](init:B, l:List[A])(f:(A,B)=>B) : B = (init, l) match {
    case (acc, Nil) => acc
    case (acc, x :: xs) => f(x, foldr(acc, xs)(f))
  }

  def isEqualList[A](x:List[A], y:List[A]) : Boolean = (x, y) match {
    case (Nil, Nil) => true
    case (Nil, _) => false
    case (_, Nil) => false
    case (x :: xs, y :: ys) => (x == y) && isEqualList(xs, ys)
  }

}
