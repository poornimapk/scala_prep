package easy

class EasyQnsArrays {

  //  Implement a function to find the second largest element in an array of integers.
  // sample input 1 Array(1, 2, 3, 4, 5) output: 4
  // sample input 2 Array(20, 1, 19, 100) output: 20
  def findSecondLargestElementInArr(arr: Array[Int]): Int = {
    val sortedArr = arr.sorted
    sortedArr(arr.length - 2)
  }

  //  Write a function to check if an array contains duplicate elements.
  

  //  Implement a function to merge two sorted arrays into a single sorted array.

  //  Write a function to remove all occurrences of a given element from an array.
  def removeElement(arr: Array[Int], elem: Int): Array[Int] = arr.filter(num => num != elem)

  //  Implement a function to find the union of two arrays (containing unique elements).

  //  Write a function to find the intersection of two arrays (containing unique elements).

  //  Implement a function to rotate an array to the left by a given number of positions.

  //  Write a function to find the longest increasing subarray in an array.

  //  Implement a function to find the majority element in an array (an element that appears more than n/2 times, where n is the length of the array).


}
