package lectures.part1basics

object Expressions extends App {
  val x = 1 + 2 //Expressions
  println(x)

  println(2 + 3 * 4)

  println(1 == x)

  println(!(1 ==x ))

  var aVariable = 2
  aVariable += 3 // side effect
  println(aVariable)

  // Instructions (DO) vs Expressions (VALUE)

  // IF expressions
  val aCondition = true
  val aConditionValue = if(aCondition) 5 else 3 // IF EXPRESSIONS
  println(aConditionValue)
  println(if(aCondition) 5 else 3)

  println(1 + 3)

  var i = 0
  val aWhile = while (i < 10) {
                println(i)
                i += 1
              }

  // NEVER WRITES IT AGAIN.

  // EVERYTHING in Scala is an Expressions!

  val aWieredValue: Unit = (aVariable = 3) // Unit === void
  println(aWieredValue)

  // side effects: println(), while, reassigning

  // Code blocks
  val aCodeBlock = {
    val y = 2
    val z = y + 1

    if (z > 2) "hello" else "goodbye"
  }

  println(aCodeBlock)

}
