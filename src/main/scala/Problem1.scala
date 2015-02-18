object Problem1 {
  def main(args: Array[String]): Unit = {
    println (
        // Size of number List
      multiplesOfInList(0, 1000)
        // Rules that numbers should follow
        (List[Int => Boolean](
          x => x % 3 == 0,
          x => x % 5 == 0
        ))
        // Should rules combine (&&) or at least one of them be correct (||)
        ((x,y) => x || y)
    )
  }

  def multiplesOfInList(from : Int, to : Int)(cases : List[Int => Boolean])(comparator : (Boolean, Boolean) => Boolean) =
    Stream.range(from, to)
      .reduceRight((x, res) => x match {
        case x if checkCases(x, cases, comparator) => res + x
        case _ => res
      })

  private def checkCases(variable : Int, list : List[Int => Boolean], comparator : (Boolean, Boolean) => Boolean) : Boolean = list match {
    case b :: end => comparator(b(variable), checkCases(variable, end, comparator))
    case b :: null => b(variable)
    case _ => false
  }


}
