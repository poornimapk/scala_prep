import easy.EasyQnsStrings
import org.scalatest.funsuite.AnyFunSuite

class EasyQnsStringsTest extends AnyFunSuite{

  val easyQnsStrings = new EasyQnsStrings()

  test("Reverse order of words in a given string") {
    assert(easyQnsStrings.reverseOrderOfWords("The quick brown fox") === "fox brown quick The")
    assert(easyQnsStrings.reverseOrderOfWords("") === "")
  }

  test("Check the input is palindrome, ignore case and spaces") {
    assert(easyQnsStrings.isPalindrome("A man a plan a canal Panama") === true)
  }

  test("Count the number of substring occurrences in a given string") {
    assert(easyQnsStrings.countSubstring("The quick brown fox jumps over the lazy dog", "the") === 2)
  }

  test("function to find the longest palindromic substring in a given string") {
    assert(easyQnsStrings.findLongestPalindromicSubstring("babad") === "bab")
    assert(easyQnsStrings.findLongestPalindromicSubstring("cbbd") === "bb")
  }

  test("remove all consecutive duplicate characters from a string") {
    assert(easyQnsStrings.removeConsecutiveDupChar("aaaabbbbccccddddd") === "abcd")
  }

  test("remove all adjacent duplicates in string") {
    assert(easyQnsStrings.removeAllAdjacentDuplicates("abbaca") === "ca")
    assert(easyQnsStrings.removeAllAdjacentDuplicates("caabba") === "ca")
  }

  test("check if two given strings are anagrams of each other, ignoring spaces and case") {
//    assert(easyQnsStrings.isAnagram("listen", "silent") === true)
//    assert(easyQnsStrings.isAnagram("Listen", "Silent") === true)
    assert(easyQnsStrings.isAnagram(" listen ", "silent") === true)
  }
}
