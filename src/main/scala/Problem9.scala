
object Problem9 {
  def main(args: Array[String]) {

    val result = for (
      i <- Range(1, 1000).toStream;
      j <- Range(1, 1000).toStream;
      k <- Range(1, 1000).toStream
      if i * i + j * j == k * k && i + j + k == 1000
    ) yield i * j * k

    println(result.head)
  }
}
