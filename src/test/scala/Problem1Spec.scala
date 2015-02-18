import org.scalatest._
import Problem1.multiplesOfInList

class Problem1Spec extends FlatSpec with Matchers {
  "Problem1" should "equal 233168" in {
    multiplesOfInList(0, 1000)(List[Int => Boolean](
      x => x % 3 == 0,
      x => x % 5 == 0
    ))((x,y) => x || y)  should equal(233168)
  }

  it should "equal 999" in {
    multiplesOfInList(0, 1000)(List[Int => Boolean](
      x => x % 3 == 0,
      x => x % 5 == 0
    ))((x,y) => x && y)  should equal(999)
  }
}
