object Problem7 {
  lazy val primes: Stream[Int] =
    2 #:: Stream.from(3).filter(i =>
      primes.takeWhile(j => j * j <= i).forall(k => i % k > 0)
    )
  def main(args: Array[String]) {

    val result = primes.take(10001).last

    println(result)
  }
}
