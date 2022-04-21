package com.github.sammyne.helloworld

object Main extends App {
  println("Hello, World!")

  val h = new HelloWorld(123)

  println(h.increment(456))
  // println(h.addV(456))
}
