import Problem7.primes

object Problem10 {
  private val TOP = 2000000
  def main(args: Array[String]) {
    println(
      primes
        .takeWhile( x => BigInt(x) < TOP)
        .map( x => BigInt(x)).sum
    )
  }
}
