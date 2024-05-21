package easy
import scala.collection.mutable.Stack
import scala.collection.mutable.ArrayBuffer
//import scala.collection.mutable.Map

class EasyQns {
  def reverseArrayInts(a: Array[Int]): Array[Int] = {
    println(a.mkString(", "))
    val arrLen = a.length
    val reversedArr = new Array[Int](arrLen)
    for (i <- 0 until arrLen)
      reversedArr(i) = a(arrLen-1-i)
    reversedArr
  }

  def hourglassSum(arr: Array[Array[Int]]): Int = {
    val rowLen = arr.length
    val colLen = arr(0).length

    var  maxSum = Int.MinValue

    for (i <- 0 until rowLen - 2)
      for(j <- 0 until colLen - 2) {
        val currentSum = arr(i)(j) + arr(i)(j+1) + arr(i)(j+2) +
          arr(i+1)(j+1) +
          arr(i+2)(j) + arr(i+2)(j+1) + arr(i+2)(j+2)
        if(currentSum > maxSum)
          maxSum = currentSum
      }

    maxSum
  }

  def flattenIntArr(arr: Any): List[Int] = arr match {
    case a: Array[_] => a.toList.flatMap(flattenIntArr)
    case e: Int => List(e)
  }

  def flattenIntArrUsingStack(arr: Array[Any]): Array[Int] = {
    val stackArr = Stack[Any](arr: _*)
    val result = ArrayBuffer[Int]()

    while (stackArr.nonEmpty) {
      stackArr.pop() match {
        case a: Array[_] => stackArr.pushAll(a)
        case i: Int => result += i
      }
    }
    result.sortInPlace()
    result.toArray
  }

  def rotateLeft(d: Int, arr: Array[Int]): Array[Int] = {
    val arrLen = arr.length
    val effectiveRotations = d % arrLen
    if(effectiveRotations == 0)
      arr
    else
      arr.slice(effectiveRotations, arrLen) ++ arr.slice(0, effectiveRotations)
  }

//  def matchingString(stringList: Array[String], queries: Array[String]): Array[Int] = {
//
//  }

  def wordCount(strings: List[String]): Map[String, Int] = {
    // List("Hello World", "Ganondorf rules Hyrule", "Link loves Hyrule", "Zelda says hello to Link")
    val text = strings.flatMap(str => str.split("\\s+"))
    val textGroupedBy = text.groupBy(identity)
    val wordCounts = textGroupedBy.mapValues(_.length).toMap
    wordCounts
  }

//  def nextGreaterElement(nums1: Array[Int], nums2: Array[Int]): Array[Int] = {
//    val result = ArrayBuffer[Int]()
//    for (i <- 0 until nums1.length ){
//      val elemIndex = nums2.indexOf(nums1(i))
//      if(elemIndex != -1 && elemIndex < nums2.length - 1) {
//        val nums2Sliced = nums2.slice(elemIndex+1, nums2.length)
//        for(j <- 0 until nums2Sliced.length)
//          if(nums2Sliced(j) > nums1(i)) {
//            result += nums2(elemIndex+1)
//          } else {
//            result += -1
//        }
//      } else {
//        result += -1
//      }
//    }
//    result.toArray
//  }

  def nextGreaterElement(nums1: Array[Int], nums2: Array[Int]): Array[Int] = {
    val nextGreaterMap = scala.collection.mutable.Map[Int, Int]()
    val nums2Stack = Stack[Int]()

    for(num <- nums2.reverse) {
      while (nums2Stack.nonEmpty && nums2Stack.top <= num){
        nums2Stack.pop()
      }

      if (nums2Stack.nonEmpty){
        nextGreaterMap(num) = nums2Stack.top
      } else {
        nextGreaterMap(num) = -1
      }

      nums2Stack.push(num)
    }

    nums1.map(nextGreaterMap)
  }


  def firstUniqueChar(s: String): Int = {
    // Use a map to store how many times each character is repeating
    val charMap = scala.collection.mutable.Map[Char, Int]()
    // Go with a 2 pass solution

    // first pass build the charMap
    s.foreach(char => charMap(char) = charMap.getOrElse(char, 0) + 1)

    // second pass find the first occurrence of the character which has repeating count 1
    s.indices.find(i => charMap(s(i)) == 1).getOrElse(-1)
  }

  def multiplyStrings(num1: String, num2: String): String = {
    val num1len = num1.length
    val num2len = num2.length
    val resultArr = new Array[Int](num1len+num2len)

    // multiply each digit of num1 with each digit of num2 and sum it
    for(i <- num1len - 1 to 0 by -1) {
      for(j <- num2len - 1 to 0 by -1) {
        val digitMultiply = (num1(i) - '0') * (num2(j) - '0')
        val sum = digitMultiply + resultArr(i + j + 1)

        resultArr(i + j + 1) = sum % 10
        resultArr(i + j) += sum / 10
      }
    }

    val sb = new StringBuilder()
    var leadingZero = true
    for(num <- resultArr) {
      if(num != 0) leadingZero = false
      if(!leadingZero) sb.append(num)
    }

    val resString = sb.isEmpty match {
      case true => "0"
      case false => sb.toString()
    }
    resString
  }


  private def gcd(num1: Int, num2: Int): Int = {
    if(num2 == 0) num1 else gcd(num2, num1 % num2)
  }

  def findGCD(nums: Array[Int]): Int = {
    val minNum = nums.min
    val maxNum = nums.max

    val res = gcd(minNum, maxNum)
    res
  }
}

