import org.scalatest._

class Problem2Spec  extends FlatSpec with Matchers {

  "Problem2" should "group first part with last part" in {
    val list = List(1, 2, 4)
    list.zip(list.tail) should equal(List((1, 2), (2, 4)))
  }
}
