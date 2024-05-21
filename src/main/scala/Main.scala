package scala

import easy.{EasyQns, LinkedList}

object Main {
  def main(args: Array[String]): Unit = {
//    println("Hello world!")
    val easyQns = new EasyQns()
    val testArr = Array(
      Array(1, 1, 1, 0, 0, 0),
      Array(0, 1, 0, 0, 0, 0),
      Array(1, 1, 1, 0, 0, 0),
      Array(0, 0, 2, 4, 4, 0),
      Array(0, 0, 0, 2, 0, 0),
      Array(0, 0, 1, 2, 4, 0)
    )
//    val reversedArr = easyQns.reverseArrayInts(testArr)
//    println(reversedArr.mkString(", "))

//    println(easyQns.hourglassSum(testArr))

    val testArr1: Array[Any] = Array(
      Array(1, 2, Array(3, 4, Array(5, 6))),
      Array(Array(7, 8), 9)
    )

//    println(s"Flattened Array: ${easyQns.flattenIntArr(testArr1).mkString(", ")}")
//    println(s"Flattened Array: ${easyQns.flattenIntArrUsingStack(testArr1).mkString(", ")}")
//
//    println(s"Rotated Array: ${easyQns.rotateLeft(0, Array(1, 2, 3, 4, 5)).mkString(", ")}")
//    val wordCounts = easyQns.wordCount(List("Hello World", "Ganondorf rules Hyrule", "Link loves Hyrule", "Zelda says hello to Link"))
//    wordCounts.foreach{case (word, count) =>
//      println(s"$word $count")
//    }
//    val nextGreaterElements = easyQns.nextGreaterElement(Array(4, 1, 2), Array(1, 3, 4, 2))
////    val nextGreaterElements = easyQns.nextGreaterElement(Array(2, 4), Array(1, 2, 3, 4))
//    println(s"Next greater elements: ${nextGreaterElements.mkString(", ")}")

//    val testStr = "helloworld"
//    val testStr = "aabb"
//    println(s"Index of First unique character in string ${testStr} is: ${easyQns.firstUniqueChar(testStr)}")
//    val num1Str = "654154154151454545415415454"
//    val num2Str = "63516561563156316545145146514654"
//    println(easyQns.multiplyStrings(num1Str, num2Str))
//    val nums = Array(3,3)
//    println(s"GCD of nums in array ${nums.mkString(", ")} is ${easyQns.findGCD(nums)}")

    val llist = new LinkedList[Int]
    llist.append(10)
    llist.append(20)
    llist.append(30)
    llist.printList()
    llist.printListReverse()

//    val singlyLinkedList = new SinglyLinkedList()
//    singlyLinkedList.insertNode(100)
//    singlyLinkedList.insertNode(200)
//    singlyLinkedList.insertNode(300)
//    singlyLinkedList.reversePrintSinglyLinkedList(singlyLinkedList.head)
//    singlyLinkedList.printSinglyLinkedList(singlyLinkedList.head, ",")
  }
}