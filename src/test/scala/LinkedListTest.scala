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
    (1 to 5).foreach(list.insert)

    list.delete(3)
    val nodes = list.collect()
    assert(nodes.length == 4)
  }

  "deleting a node that doesn't exist" should "return false" in {
    val list = new LinkedList[Int]
    val deleted = list.delete(1)
    assert(!deleted)
  }
}
