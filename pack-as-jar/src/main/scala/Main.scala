import world.HelloWorld

@main def hello: Unit = 
  val v = new HelloWorld
  v.hello_world

  println("Hello world!")
  println(msg)

def msg = "I was compiled by Scala 3. :)"
