package scala

import easy.{EasyQns, EasyQnsArrays, EasyQnsStrings}

object Main {
  def main(args: Array[String]): Unit = {
//    println("Hello world!")
    val easyQns = new EasyQns()
    val easyQnsArrays = new EasyQnsArrays()
    val easyQnsStrings = new EasyQnsStrings()

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
    val arr7 = Array(5, 0, 5, 2, 10, 9, 2)
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
    val str4 = "malayalam"
//    println(s"Word ${str1} without vowels: ${easyQns.removeVowels(str1)}")
//    println(s"Word ${str2} without vowels: ${easyQns.removeVowels(str2)}")
//    println(s"Word ${str3} without vowels: ${easyQns.removeVowels(str3)}")

//    println(s"Max and Min values in arr: ${arr6.mkString(", ")} is: ${easyQns.findMaxAndMinCustom(arr6)}")
//    println(s"Max and Min values in arr: ${arr4.mkString(", ")} is: ${easyQns.findMaxAndMinCustom(arr4)}")
//    println(s"Max and Min values in arr: ${arr2.mkString(", ")} is: ${easyQns.findMaxAndMinCustom(arr2)}")
//    println(s"Max and Min values in arr: ${arr3.mkString(", ")} is: ${easyQns.findMaxAndMinCustom(arr3)}")
//    println(s"Max and Min values in arr: ${arr5.mkString(", ")} is: ${easyQns.findMaxAndMinCustom(arr5)}")

//    println(s"Reverse of string: ${str1} is: ${easyQns.reverseString(str1)}, is string palindrome? ${easyQns.checkPalindrome(str1)}")
//
//    println(s"Reverse of string: ${str2} is: ${easyQns.reverseString(str2)}, is string palindrome? ${easyQns.checkPalindrome(str2)}")
//    println(s"Reverse of string: ${str3} is: ${easyQns.reverseString(str3)}, is string palindrome? ${easyQns.checkPalindrome(str3)}")
//    println(s"Reverse of string: ${""} is: ${easyQns.reverseString("")}, is string palindrome? ${easyQns.checkPalindrome("")}")
//    println(s"Reverse of string: ${str4} is: ${easyQns.reverseString(str4)}, is string palindrome? ${easyQns.checkPalindrome(str4)}")

//    println(s"Remove duplicates from arr: ${arr7.mkString(", ")}: ${easyQns.removeDuplicates(arr7).mkString(", ")}")
//    println(s"Remove duplicates from arr: ${arr2.mkString(", ")}: ${easyQns.removeDuplicates(arr2).mkString(", ")}")
//    println(s"Remove duplicates from arr: ${arr1.mkString(", ")}: ${easyQns.removeDuplicates(arr1).mkString(", ")}")
//    println(s"Vowel count in string ${str1} is ${easyQns.countVowels(str1)}")
//    println(s"Vowel count in string ${str2} is ${easyQns.countVowels(str2)}")
//    println(s"Vowel count in string ${str3} is ${easyQns.countVowels(str3)}")
//    println(s"Vowel count in string ${str4} is ${easyQns.countVowels(str4)}")

//    println(s"Length of string ${str1} is ${easyQns.findLength(str1)}")
//    println(s"Length of string ${""} is ${easyQns.findLength("")}")

//    println(s"If we remove char 'e' from ${str1}, result is ${easyQns.removeChar(str1, 'e')}")
//    println(s"If we remove char 'y' from ${str2}, result is ${easyQns.removeChar(str2, 'y')}")
//    println(s"If we remove char ' ' from ${str3}, result is ${easyQns.removeChar(str3, ' ')}")

    val str5 = "heart"
    val str6 = "earth"
    val str7 = "flow"
    val str8 = "wolf"
    val str9 = "aab"
    val str10 = "aabb"
    val str11 = "cat"
    val str12 = "dog"
    val str13 = "hello_world"
//    println(s"valid anagram string1: ${str5} and string2: ${str6} ----: ${easyQns.isAnagram(str5, str6)}")
//    println(s"valid anagram string1: ${str7} and string2: ${str8} ----: ${easyQns.isAnagram(str7, str8)}")
//    println(s"valid anagram string1: ${str9} and string2: ${str10} ----: ${easyQns.isAnagram(str9, str10)}")
//    println(s"valid anagram string1: ${str11} and string2: ${str12} ----: ${easyQns.isAnagram(str11, str12)}")
//    println(s"First non repeating character in string ${str4} is: ${easyQns.findFirstNonRepeatingChar(str4)}")
//    println(s"First non repeating character in string ${str2} is: ${easyQns.findFirstNonRepeatingChar(str2)}")
//    println(s"First non repeating character in string ${str1} is: ${easyQns.findFirstNonRepeatingChar(str1)}")
//    println(s"First non repeating character in string ${str10} is: ${easyQns.findFirstNonRepeatingChar(str10)}")
//    println(s"The camel case for string ${str13} is: ${easyQns.convertToCamelCase(str13)}")
//    println(s"The camel case for string ${"my_name_is_john"} is: ${easyQns.convertToCamelCase("my_name_is_john")}")
//    println(s"The camel case for string ${"HTML_CSS_JAVASCRIPT"} is: ${easyQns.convertToCamelCase("HTML_CSS_JAVASCRIPT")}")
//    println(s"The camel case for string ${"snake_case_string_with_numbers_123"} is: ${easyQns.convertToCamelCase("snake_case_string_with_numbers_123")}")
//    println(s"The camel case for string ${"UPPERCASE_STRING"} is: ${easyQns.convertToCamelCase("UPPERCASE_STRING")}")
//    println(s"Longest common prefix in string array ${Array("tester", "testing", "testifying").mkString(", ")}: ${easyQns.findLongestCommonPrefixInStrArr(Array("tester", "testing", "testifying"))}")
//    println(s"Longest common prefix in string array ${Array("hey", "ho", "hay", "hh").mkString(", ")}: ${easyQns.findLongestCommonPrefixInStrArr(Array("hey", "ho", "hay", "hh"))}")
//    println(s"Longest common prefix in string array ${Array("abb", "baa", "caa", "daa").mkString(", ")}: ${easyQns.findLongestCommonPrefixInStrArr(Array("abb", "baa", "caa", "daa"))}")
//  println(s"Remove 5 from arr ${arr7.mkString(", ")}  Answer: ${easyQnsArrays.removeElement(arr7, 5).mkString(", ")}")
//  println(s"Remove 0 from arr ${arr1.mkString(", ")}  Answer: ${easyQnsArrays.removeElement(arr1, 0).mkString(", ")}")
    println(easyQnsStrings.findLongestPalindromicSubstring("babad"))
    println(easyQnsStrings.findLongestPalindromicSubstring("bb"))
    println(easyQnsStrings.findLongestPalindromicSubstring("aac"))
    println(easyQnsStrings.findLongestPalindromicSubstring("ac"))
    println(easyQnsStrings.findLongestPalindromicSubstring("a"))
    println(easyQnsStrings.findLongestPalindromicSubstring("ccc"))
    println(easyQnsStrings.findLongestPalindromicSubstring("abcba"))
//    val someMap = mutable.HashMap("abcba" -> 5,"bcb" -> 3 )
//    println(someMap.maxBy(_._2).toString())
  }
}