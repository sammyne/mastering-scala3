package com.github.sammyne.helloworld

import com.github.sbt.jni.syntax.NativeLoader

class HelloWorld(val v: Int) extends NativeLoader("helloworld") {
  @native def increment(x: Int): Int

  @native def addV(x: Int): Int
}
