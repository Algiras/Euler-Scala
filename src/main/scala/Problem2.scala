import scala.math.BigInt

object Problem2 {
  def main (args: Array[String]) {
    lazy val fibs  : Stream[BigInt] =
      BigInt(1) #::
      BigInt(2) #::
      fibs
        .zip(fibs.tail)
        .map { n => n._1 + n._2}

    println(
      fibs
        .filter(x => x % BigInt(2) == BigInt(0))
        .takeWhile(x => x < BigInt(4000000))
        .sum
    )
  }

}
