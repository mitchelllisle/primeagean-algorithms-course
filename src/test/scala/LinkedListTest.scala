package io.github.mitchelllisle

import org.scalatest.flatspec.AnyFlatSpec

class LinkedListTest extends AnyFlatSpec {
  "adding a value" should "have one value" in {
    val list = new LinkedList[Int]
    list.insertAtFront(1)

    val nodes = list.collect()
    assert(nodes.length == 1)
  }
}
