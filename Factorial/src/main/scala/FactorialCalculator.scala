object FactorialCalculator {
  def factorial(n: Int): BigInt = {
    if (n <= 0) 1
    else n * factorial(n - 1)
  }

  def main(args: Array[String]): Unit = {
    println("Enter a number to calculate its factorial:")
    val input = scala.io.StdIn.readInt()
    val result = factorial(input)
    println(s"Factorial of $input is $result")
  }
}
