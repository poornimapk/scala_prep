package easy

class BinaryTreeNode(var _value: Int, _left: BinaryTreeNode = null, _right: BinaryTreeNode = null) {
  var value: Int = _value
  var left: BinaryTreeNode = _left
  var right: BinaryTreeNode = _right
}

object Main {
  private def maxDepth(root: BinaryTreeNode): Int = {
    if(root == null) 0
    else{
      Math.max(maxDepth(root.left), maxDepth(root.right)) + 1
    }
  }

  private def invertTree(root: BinaryTreeNode): BinaryTreeNode = {
    if(root == null) return null
    else {
      val tmp = root.left
      root.left = invertTree(root.right)
      root.right = invertTree(tmp)
      root
    }
  }

  private def printTree(root: BinaryTreeNode): Unit = {
    if(root == null) return
    print(root.value + " ")
    printTree(root.left)
    printTree(root.right)
  }

  def main(args: Array[String]): Unit = {
    val node = new BinaryTreeNode(1)
    node.left = new BinaryTreeNode(2)
    node.right = new BinaryTreeNode(3)
    node.left.left = new BinaryTreeNode(4)
    node.left.right = new BinaryTreeNode(5)

    println(printTree(node))
    println(maxDepth(node))

    val invertedTreeNode = invertTree(node)
    println(printTree(invertedTreeNode))
  }
}