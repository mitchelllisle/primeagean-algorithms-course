package io.github.mitchelllisle
import scala.collection.mutable.ArrayBuffer

case class ListNode[T](var value: T, var next: Option[ListNode[T]] = None)

class LinkedList[T] {
  private var head: Option[ListNode[T]] = None

  def insert(value: T): Unit = {
    val newNode = new ListNode[T](value, head)
    head = Some(newNode)
  }

  def deleteValue(value: T): Boolean = {
    var current = head
    var previous: Option[ListNode[T]] = None

    while (current.isDefined) {
      if (current.get.value == value) {
        previous match {
          case Some(prevNode) => prevNode.next = current.get.next
          case None => head = current.get.next
        }
        return true
      }
      previous = current
      current = current.get.next
    }
    false
  }

  def collect(): ArrayBuffer[ListNode[T]] = {
    val nodes: ArrayBuffer[ListNode[T]] = ArrayBuffer.empty

    var current = head
    while (current.isDefined) {
      current match {
        case Some(current) => nodes += current
      }
      current = current.get.next
    }
    nodes
  }
}
