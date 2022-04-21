import helloworld.HelloWorld

object Hello {
  def main(args: Array[String]): Unit = {
    if (args.length <= 0) {
      println("missing library path")
      return
    }

    println(s"load ${args(0)}")
    System.load(args(0))

    val h = new HelloWorld
    h.goodbye
    h.hi

    println(h.hello("sammyne"))
  }
}
