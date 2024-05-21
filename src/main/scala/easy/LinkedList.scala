package easy

case class Node[Int](
                    value: Int,
                    var next: Option[Node[Int]] = None
                  )

class LinkedList[Int] {

  private var head: Option[Node[Int]] = None

  // append an integer at the end of the list
  def append(value: Int): Unit = {
    val newNode = Node(value)
    head match {
      case Some(currentNode) =>
        var tempNode = currentNode
        while (tempNode.next.isDefined) {
          tempNode = tempNode.next.get
        }
        tempNode.next = Some(newNode)
      case None =>
        head = Some(newNode)
    }
  }

  // print elements of the list
  def printList(): Unit = {
    var currentNode = head
    while (currentNode.isDefined){
      print(currentNode.get.value + " ")
      currentNode = currentNode.get.next
    }
    println()
  }

  // print list in reverse
  def printListReverse(): Unit = {
    var currentNode = head
    var stack = List[Int]()
    while (currentNode.isDefined) {
      stack = currentNode.get.value :: stack
      currentNode = currentNode.get.next
    }
    stack.foreach(value => print(value + " "))
    println()
  }
}


