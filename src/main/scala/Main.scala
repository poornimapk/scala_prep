package scala

import easy.EasyQns

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

//    val llist = new LinkedList[Int]
//    llist.append(10)
//    llist.append(20)
//    llist.append(30)
//    llist.printList()
//    llist.printListReverse()

//    val singlyLinkedList = new SinglyLinkedList()
//    singlyLinkedList.insertNode(100)
//    singlyLinkedList.insertNode(200)
//    singlyLinkedList.insertNode(300)
//    singlyLinkedList.reversePrintSinglyLinkedList(singlyLinkedList.head)
//    singlyLinkedList.printSinglyLinkedList(singlyLinkedList.head, ",")

//    val nums = List(1, 2, 3, 4, 5, 8)
//    println(s"List of squared even numbers: ${easyQns.squaredEvenNumbers(nums).mkString(", ")}")

    val arr1 = Array(1, 2, 3, 4, 5)
    val arr2 = Array(5, 5, 5)
    val arr3 = Array(1)
    val arr4 = Array(3, 1, 4, 5, 9)
    val arr5 = Array(1, 2, 3, 4)
    val arr6 = Array(5, 2, 0, 9, 4)

//    println(easyQns.secondLargestNumber(arr1))
//    println(easyQns.secondLargestNumber(arr2))
//    println(easyQns.secondLargestNumber(arr3))
//    println(easyQns.secondLargestNumber(arr4))
//    println(easyQns.secondLargestNumber(arr5))

//    println(easyQns.secondLargestWithoutSort(arr1))
//    println(easyQns.secondLargestWithoutSort(arr5))
//    println(easyQns.secondLargestWithoutSort(arr3))
//    println(easyQns.secondLargestWithoutSort(arr2))
//    println(easyQns.secondLargestWithoutSort(arr4))

//    println(s"${easyQns.productExceptSelf(arr1).mkString(", ")}")
//    println(s"${easyQns.productExceptSelf(arr5).mkString(", ")}")
//    println(s"Sum of all even nums for input {${arr2.mkString(", ")}}: ${easyQns.sumOfAllEvenNums(arr2)}")
//    println(s"Sum of all even nums for input {${arr1.mkString(", ")}}: ${easyQns.sumOfAllEvenNums(arr1)}")

    val str1 = "leetcode"
    val str2 = "disney"
    val str3 = "crypt myth"

//    println(s"Word ${str1} without vowels: ${easyQns.removeVowels(str1)}")
//    println(s"Word ${str2} without vowels: ${easyQns.removeVowels(str2)}")
//    println(s"Word ${str3} without vowels: ${easyQns.removeVowels(str3)}")

//    println(s"Max and Min values in arr: ${arr6.mkString(", ")} is: ${easyQns.findMaxAndMinCustom(arr6)}")
//    println(s"Max and Min values in arr: ${arr4.mkString(", ")} is: ${easyQns.findMaxAndMinCustom(arr4)}")
//    println(s"Max and Min values in arr: ${arr2.mkString(", ")} is: ${easyQns.findMaxAndMinCustom(arr2)}")
//    println(s"Max and Min values in arr: ${arr3.mkString(", ")} is: ${easyQns.findMaxAndMinCustom(arr3)}")
//    println(s"Max and Min values in arr: ${arr5.mkString(", ")} is: ${easyQns.findMaxAndMinCustom(arr5)}")

    println(s"Reverse of string: ${str1} is: ${easyQns.reverseString(str1)}")
    println(s"Reverse of string: ${str1} is: ${easyQns.reverseString(str2)}")
    println(s"Reverse of string: ${str1} is: ${easyQns.reverseString(str3)}")
    println(s"Reverse of string: ${str1} is: ${easyQns.reverseString("")}")
  }
}