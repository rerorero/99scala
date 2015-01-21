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

}
