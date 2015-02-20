
object Problem6 {
  def main(args: Array[String]) {
    val range =  Range(1, 101)
    val sumOfSquares = range.map( x => x*x).sum
    val sum = range.sum
    val squareOfSum = sum * sum

    println(squareOfSum - sumOfSquares)
  }
}
