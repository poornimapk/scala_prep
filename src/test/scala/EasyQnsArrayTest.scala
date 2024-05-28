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

  test("Find second largest element in array of Integers") {
    assert(easyQnsArray.findSecondLargestElementInArr(Array(1, 2, 3, 4, 5)) === 4)
    assert(easyQnsArray.findSecondLargestElementInArr(Array(20, 1, 19, 100)) === 20)
  }

  test("Check whether an array of Integers has duplicates, return true") {
    assert(easyQnsArray.hasDuplicate(Array(1,2,3,3)) === true)
    assert(easyQnsArray.hasDuplicate(Array(10,20,20,30,30)) === true)
    assert(easyQnsArray.hasDuplicate(Array(20,20,30,30)) === true)
  }

  test("Check whether an array of integers has duplicate, if not, return false") {
    assert(easyQnsArray.hasDuplicate(Array(10,20,30,40,50)) === false)
    assert(easyQnsArray.hasDuplicate(Array(1,2,3,4,5)) === false)
  }

  test("Merge 2 sorted arrays into a single sorted array") {
    assert(easyQnsArray.mergeSortedArrays(Array(-2, 3, 5, 7), Array(-1, 0, 6, 8)) === Array(-2, -1, 0, 3, 5, 6, 7, 8))
    // with duplicate elements
    assert(easyQnsArray.mergeSortedArrays(Array(23,4,123,456,2,3), Array(4,1,6,8,5,3,4721,2,1)) === Array(1,1,2,2,3,3,4,4,5,6,8,23,123,456,4721))
    assert(easyQnsArray.mergeSortedArrays(Array(), Array()) === Array())
  }
}
