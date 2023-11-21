package io.github.mitchelllisle

case class QNode[T](var value: T, var next: Option[QNode[T]])

class Queue[T] {
  var length: Int = 0
  var head: Option[QNode[T]] = None
  private var tail: Option[QNode[T]] = None

  def enqueue(item: T): Unit = {
    val newNode = QNode(item, None)
    tail match {
      case None =>
        head = Some(newNode)
        tail = Some(newNode)
      case Some(t) =>
        t.next = Some(newNode)
        tail = Some(newNode)
    }
    length += 1
  }

  def deque(): Option[T] = {
    head match {
      case None => None
      case Some(current) =>
        head = current.next
        if (head.isEmpty) {
          tail = None
        }
        length -= 1
        Some(current.value)
    }
  }

  def peek(): Option[T] = {
    head.map(_.value)
  }
}
