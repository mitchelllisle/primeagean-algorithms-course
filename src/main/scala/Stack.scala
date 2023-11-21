package io.github.mitchelllisle

case class Node[T](value: T, var previous: Option[Node[T]])

class Stack[T] {

  var length: Int = 0
  var head: Option[Node[T]] = None

  def push(item: T): Unit = {
    val newNode = Node(item, head)
    head match {
      case None =>
        head = Some(newNode)
      case Some(t) =>
        t.previous = Some(newNode)
        head = Some(newNode)
    }
    length += 1
  }

  def pop(): Option[T] = {
    head match {
      case None => None
      case Some(t) =>
        head = t.previous
        length -= 1
        Some(t.value)
    }
  }

  def peek(): Option[T] = {
    head.map(_.value)
  }
}
