package lectures.part1basics

object Functions {

  def aFunction(a:String, b: Int):String = {
    a + " " + b // ONE expression
  }

  val aFunctionInvocation = aFunction("Scala", 999999999)

  def aNoArgFunction(): Int = 45
  def aParameterlessFunction: Int = 55

  // recursion

  def stringConcatenation(str: String, n: Int): String = {
    if (n==0) ""
    else if (n == 1) str
    else str + stringConcatenation(str, n - 1)
  }

  val scalaX3 = stringConcatenation("Scala", 3)

  def aVoidFunc(aStr: String): Unit = println(aStr)


  def aBigFunc(n: Int): Int = {
    def aSmallFunc(a: Int, b: Int): Int = a + b

    aSmallFunc(n, n + 1)
  }

  def aNameAndAgeFunc(name: String, age: Int): String = "Hi my name is " + name + " and I am " + age + " years old"

  def aFactorial(n: Int): Int =
    if (n <= 0) 0
    else if (n == 1) 1
    else n * aFactorial(n - 1)

  def fibonacci(n: Int): Int =
    if (n <= 2) 1
    else fibonacci(n - 1) + fibonacci(n - 2)

  def isPrime(n: Int): Boolean = {
    def isPrimeUntil(t: Int): Boolean =
      if (t <= 1) true
      else n % t != 0 && isPrimeUntil(t - 1)

    isPrimeUntil(n / 2)
  }

  def main(args: Array[String]): Unit = {
    println(scalaX3)
    println(aFactorial(5))
    println(fibonacci(5))
    println(isPrime(7))
  }
}
