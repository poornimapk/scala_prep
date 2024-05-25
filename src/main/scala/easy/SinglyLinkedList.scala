package easy


class SinglyLinkedListNode(var data: Int, var next: SinglyLinkedListNode = null)

class SinglyLinkedList(var head: SinglyLinkedListNode = null, var tail: SinglyLinkedListNode = null) {
  def insertNode(nodeData: Int): Unit = {
    val node = new SinglyLinkedListNode(nodeData)

    if(this.head == null) {
      this.head = node
    } else {
      this.tail.next = node
    }
    this.tail = node
  }

  def insertNodeAtHead(data: Int): Unit = {
    val newNode = new SinglyLinkedListNode(data)
    if(this.head == null) {
      this.head = newNode
    } else {
      val tmpNode = this.head
      this.head = newNode
      this.head.next = tmpNode
    }

  }

  def insertNodeAtPosition(llist: SinglyLinkedListNode, data:Int, position: Int): SinglyLinkedListNode = {
    val newNode = new SinglyLinkedListNode(data)
    if(position == 0) {
      newNode.next = llist
      return newNode
    }

    var current = llist
    var counter = 0
    while(current != null && counter < position - 1) {
      current = current.next
      counter += 1
    }
    if(current != null) {
      newNode.next = current.next
      current = newNode
    }
    llist
  }

  def reverse(singlyLinkedList: SinglyLinkedListNode): SinglyLinkedListNode = {
    var prev: SinglyLinkedListNode = null
    var current = singlyLinkedList
    var next: SinglyLinkedListNode = null

    while (current != null) {
      next = current.next
      current.next = prev
      prev = current
      current = next
    }
    prev
  }



  def reversePrintSinglyLinkedList(head: SinglyLinkedListNode): Unit = {
    var stack = List[Int]()
    var currentNode = head
    while(currentNode != null){
      stack = currentNode.data :: stack
      currentNode = currentNode.next
    }
    stack.foreach(data => println(data))
  }

}

object Solution {
  def main(args: Array[String]): Unit = {
    val stdin = scala.io.StdIn
    print("Enter number of tests: ")
    val tests = stdin.readLine.trim.toInt
    for(testsItr <- 1 to tests){
      val sLlist = new SinglyLinkedList()
      print(s"Enter number of integer count in ${testsItr}: ")
      val sLlistCount = stdin.readLine.trim.toInt
      for(_ <- 0 until sLlistCount) {
        print(s"Enter integer: ")
        val sLlistItem = stdin.readLine.trim.toInt
//        sLlist.insertNode(sLlistItem)
        sLlist.insertNodeAtHead(sLlistItem)
      }
      def printSinglyLinkedList(head: SinglyLinkedListNode, sep: String): Unit = {
        var node = head
        while (node != null){
          print(node.data)
          node = node.next
          if(node != null){
            print(sep)
          }
        }
        println()
      }
      printSinglyLinkedList(sLlist.head, ", ")
//
//      val reversedList = sLlist.reverse(sLlist.head)
//      sLlist.printSinglyLinkedList(reversedList, ", ")
//      sLlist.reversePrintSinglyLinkedList(sLlist.head)
      print(s"Enter integer to insert at position: ")
      val data = stdin.readLine.trim.toInt
      print(s"Enter position to insert at: ")
      val position = stdin.readLine.trim.toInt
      val updatedsLlist = sLlist.insertNodeAtPosition(sLlist.head, data, position)

      printSinglyLinkedList(updatedsLlist, ", ")
    }


  }
}

