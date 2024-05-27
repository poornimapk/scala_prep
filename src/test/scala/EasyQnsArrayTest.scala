import easy.EasyQnsArrays
import org.scalatest.funsuite.AnyFunSuite

class EasyQnsArrayTest extends AnyFunSuite {
  val easyQnsArray = new EasyQnsArrays()
  test("Remove element from array of Integers, element exists") {
    assert(easyQnsArray.removeElement(Array(2, 4, 5, 2, 5, 6, 7), 5) === Array(2, 4, 2, 6, 7))
  }
  test("Remove element from array of Integers, element doesn't exists") {
    assert(easyQnsArray.removeElement(Array(2, 4, 5, 2, 5, 6, 7), 9) === Array(2, 4, 5, 2, 5, 6, 7))
  }
}
