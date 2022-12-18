package lectures.part1basics

object CBNvsCBV {

  // Call by value

  def aFunction(arg: Int): Int = arg + 1
  val aComputation = aFunction(23 + 67)

  // Call by name
  def aByNameFunction(arg: => Int): Int = arg + 1
  val anotherComputation = aByNameFunction(23 + 67)

  def printTwiceByValue(x: Long): Unit = {
    println("By value: " + x)
    println("By value: " + x)
  }

  def printTwiceByName(x: => Long): Unit = {
    println("By name: " + x)
    println("By name: " + x)
  }

  def infinite(): Int = 1 + infinite()

  def printFirst(x: Int, y: => Int) = println(x)


  def main(args: Array[String]): Unit = {
//    println(aComputation)
//    println(anotherComputation)

//    printTwiceByValue(System.nanoTime())
//    printTwiceByName(System.nanoTime())

    printFirst(42, infinite())

  }
}
