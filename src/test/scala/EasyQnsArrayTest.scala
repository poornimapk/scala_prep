import easy.EasyQnsArrays
import org.scalatest.funsuite.AnyFunSuite

class EasyQnsArrayTest extends AnyFunSuite {
  test("Remove element from array of Integers") {
    val easyQnsArray = new EasyQnsArrays()
    assert(easyQnsArray.removeElement(Array(2, 4, 5, 2, 5, 6, 7), 5) === Array(2, 4, 2, 6, 7))
  }

}
