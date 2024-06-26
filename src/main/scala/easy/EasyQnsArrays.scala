package easy
import scala.collection.mutable.HashMap

class EasyQnsArrays {

  //  Implement a function to find the second largest element in an array of integers.
  // sample input 1 Array(1, 2, 3, 4, 5) output: 4
  // sample input 2 Array(20, 1, 19, 100) output: 20
  def findSecondLargestElementInArr(arr: Array[Int]): Int = {
    val sortedArr = arr.sorted
    sortedArr(arr.length - 2)
  }

  //  Write a function to check if an array contains duplicate elements.
  // sample input 1 Array(1,2,3,3) output: true
  // sample input 2 Array(1,2,3,4) output: false
  def hasDuplicate(arr: Array[Int]): Boolean = {
//    arr.length != arr.distinct.length // easiest solution
    // build hash map having integer as key and count of integer as value
    val map = HashMap[Int, Int]()
    arr.foreach(num => map(num) = map.getOrElse(num, 0) + 1)
    // loop over hashmap, if you find any value more than 1, return true
    var res = false
    map.foreach(kv => if(kv._2 > 1) res = true)
    // all other cases return false
    res
  }

  //  Implement a function to merge two sorted arrays into a single sorted array.
  def mergeSortedArrays(arr1: Array[Int], arr2: Array[Int]): Array[Int] = {
    val res = arr1 ++ arr2
    res.sorted
//    arr1.concat(arr2).sorted
  }

  //  Write a function to remove all occurrences of a given element from an array.
  def removeElement(arr: Array[Int], elem: Int): Array[Int] = arr.filter(num => num != elem)

  // Given an array of integers nums and an integer target, return the indices of i & j such that nums(i) + nums(j) == target
  // example 1, inputs: nums(3, 4, 5, 6) target = 7, output: (0, 1)
  // example 2, inputs: nums(4, 5, 6) target = 10, output: (0, 2)
  // example 3, inputs: nums(5, 5) target = 10, output: (0, 1)
  // Assumption, every input array has exactly one pair of indices that satisfy the condition

  import scala.collection.mutable
  def twoSum(nums: Array[Int], target: Int): Array[Int] = {
    // create Map with all elements
    val numsMap = mutable.Map[Int, Int]()
    var res = Array(-1, -1)
    //    loop through nums and find indices where it matches
    for ((value, index) <- nums.zipWithIndex) {
      val indices = numsMap.get(target - value).map(Array(_, index))
      if (indices.nonEmpty)
        res = indices.get
      numsMap.put(value, index)
    }
    res
  }


  //  Implement a function to find the union of two arrays (containing unique elements).

  //  Write a function to find the intersection of two arrays (containing unique elements).

  //  Implement a function to rotate an array to the left by a given number of positions.

  //  Write a function to find the longest increasing subarray in an array.

  //  Implement a function to find the majority element in an array (an element that appears more than n/2 times, where n is the length of the array).
  
}
