package lectures.part1basics

object ValuesVariablesTypes extends App {
  val x: Int = 42
  println(x)

  // VALS ARE IMMUTABLE
  val aString: String = "Hello"
  val bString: String = "goodbye"
  val aBoolean: Boolean = true
  val aChar: Char = 'a'
  val aInt: Int = x
  val aShort: Short = 4613
  val aLong: Long = 1234567789
  val aFloat: Float = 2.0F
  val aDouble: Double = 3.14

  // variables
  var aVariable: Int = 4
  aVariable = 5 // side effects
}
