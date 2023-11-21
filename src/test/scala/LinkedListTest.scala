package io.github.mitchelllisle

import org.scalatest.flatspec.AnyFlatSpec

class LinkedListTest extends AnyFlatSpec {
  "adding a node" should "make a linked list with one node" in {
    val list = new LinkedList[Int]
    list.insert(1)

    val nodes = list.collect()
    assert(nodes.length == 1)
  }

  "deleting a node" should "make a linked list with no nodes" in {
    val list = new LinkedList[Int]
    list.insert(1)

    list.delete(1)
    val nodes = list.collect()
    assert(nodes.isEmpty)
  }

  "deleting a node with multiple nodes" should "make a linked list with n-1 nodes" in {
    val list = new LinkedList[Int]
    list.insert(1)
    list.insert(2)

    list.delete(1)
    val nodes = list.collect()
    assert(nodes.length == 1)
  }
}
