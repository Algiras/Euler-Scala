
object Problem4 {
  def main(args: Array[String]) {
    val answer = (
      for(
        i <- Range(100, 999);
        j <- Range(100, 999);
        answer = i * j;
        nrString = answer.toString
        if nrString == nrString.reverse
      ) yield  answer
    ).max

    println(answer)
  }
}
