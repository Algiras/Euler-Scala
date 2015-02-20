import scala.math.BigInt

object Problem5 {
  def main(args: Array[String]) {
    val divisors = Range(1, 20)
    lazy val answer = Stream.from(21)
      .filter{
        x => divisors.forall{ k => x % k == 0}
      }.head

    println(answer)
  }
}
