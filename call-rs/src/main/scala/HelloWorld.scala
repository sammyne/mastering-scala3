package helloworld

class HelloWorld {
  @native def hi(): Unit

  @native def hello(who: String): String

  def goodbye(): Unit = {
    println("good bye :)")
  }
}
