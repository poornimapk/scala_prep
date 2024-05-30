package easy

class EasyQnsStrings {

  //  Write a function to reverse the order of words in a given string.
  //    Example: Input: "The quick brown fox" Output: "fox brown quick The"
  def reverseOrderOfWords(str: String): String = {
    str.split("\\s+").reverse.mkString(" ")
  }

  //  Implement a function to check if a given string is a palindrome, ignoring spaces and case.
  //  Example: Input: "A man a plan a canal Panama" Output: true
  def isPalindrome(str: String): Boolean = {
    str.toLowerCase.reverse.split("\\s+").mkString == str.toLowerCase.split("\\s+").mkString
  }

  //  Write a function to find the longest palindromic substring in a given string.
  //    Example: Input: "babad" Output: "bab" or "aba"
  import scala.collection.mutable
  def findLongestPalindromicSubstring(str: String): String = {
    var res = ""
    if(str.size == 2) {
      if(str(0) == str(1)) res = str
      else res = str(0).toString
    } else {
      val strMap = mutable.HashMap[String, Int]()
      for(i <- str.indices) {
        var j = i + 2
        while(j <= str.length) {
          val substr = str.substring(i, j)
          if(isPalindrome(substr))
            strMap.put(substr, substr.length)
          j += 1
        }
      }
//      println(strMap.mkString(","))
//      println(strMap.max.toString())
      if(strMap.nonEmpty)
        res = strMap.maxBy(_._2)._1
      else
        res = str
    }
    res
  }

  //  Implement a function to count the number of occurrences of a given substring in a string.
  //  Example: Input: "The quick brown fox jumps over the lazy dog", "the" Output: 2
  // assumption: space will be there in the string
  def countSubstring(str: String, substr: String): Int = {
    // convert string to array
    val strArr = str.split("\\s+")
    // set count = 0
    var count = 0
    // loop over string array
    for(elem <- strArr) {
      // if string == substring increment the count
      if(elem.toLowerCase.equals(substr.toLowerCase))
        count += 1
    }
    // return count
    count
  }

  //  Write a function to remove all consecutive duplicate characters from a string.
  //  Example: Input: "aaaabbbbccccddddd" Output: "abcd"
  def removeConsecutiveDupChar(str: String): String = {
    str.split("").toSet.mkString
  }

  // Write a function to remove all adjacent duplicates in string
  // Example: input: "abbaca" output: "ca"
  // Example: input: "caabba" output: "ca"
  def removeAllAdjacentDuplicates(str: String): String = {
    val sb = new StringBuilder()
    str.foreach(ch => {
      if(sb.nonEmpty && sb.last == ch) sb.deleteCharAt(sb.length() - 1)
      else sb.append(ch)
    })
    sb.toString()
  }

  //  Implement a function to check if two given strings are anagrams of each other, ignoring spaces and case.
  //  Example: Input: "Listen", "Silent" Output: true
  private def charCountMap(str: String): mutable.Map[Char, Int] = {
    val strMap = mutable.Map[Char, Int]()
    str.foreach(char => strMap(char) = strMap.getOrElse(char, 0) + 1)
    strMap
  }

  def isAnagram(str1: String, str2: String): Boolean = {
    // if str1.size != str2.size false
    var res = true
    if(str1.trim.size != str2.trim.size) res = false
    else {
      // create maps to count each character in strings
      val str1Map = charCountMap(str1.trim.toLowerCase)
      val str2Map = charCountMap(str2.trim.toLowerCase)
      // loop through any 1 map, check each char count equal, if not false
      str1Map.foreach(elem => {
        if(!str2Map.contains(elem._1) || Some(elem._2) != str2Map.get(elem._1)) res = false
      })
    }
    res
  }

  //  Write a function to find the longest common prefix among a given array of strings.
  //    Example: Input: ["flower", "flow", "flight"] Output: "fl"

  //  Implement a function to check if a given string is a valid palindrome after removing at most one character.
  //    Example: Input: "aba" Output: true, Input: "abca" Output: true, Input: "abc" Output: false

  //  Write a function to find the longest substring without repeating characters in a given string.
  //    Example: Input: "abcabcbb" Output: "abc"

  //  Implement a function to find the minimum window substring in a given string that contains all characters of another string.
  //  Example: Input: "ADOBECODEBANC", "ABC" Output: "BANC"

}
