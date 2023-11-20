package io.github.mitchelllisle

import org.scalatest.flatspec.AnyFlatSpec

class LinkedListTest extends AnyFlatSpec {
  "adding a node" should "make a linked list with one node" in {
    val list = new LinkedList[Int]
    list.insertAtFront(1)

    val nodes = list.collect()
    assert(nodes.length == 1)
  }

  "deleting a node" should "make a linked list with no nodes" in {
    val list = new LinkedList[Int]
    list.insertAtFront(1)

    list.deleteValue(1)
    val nodes = list.collect()
    assert(nodes.isEmpty)
  }
}
