package io.github.mitchelllisle

import org.scalatest.flatspec.AnyFlatSpec

class QueueTest extends AnyFlatSpec {
  "Enqueing" should "allow removing same number of values" in {
    val q = new Queue[Int]

    val range = (1 to 5)
    range.foreach(q.enqueue)

    range.indices.foreach(v => q.deque().get == v)
  }

  "Peeking" should "return the head" in {
    val q = new Queue[Int]

    q.enqueue(10)
    assert(q.peek().get == 10)
  }

  "Dequeing" should "return the current value" in {
    val q = new Queue[Int]

    (1 to 5).foreach(q.enqueue)

    val dequed = q.deque()

    assert(dequed.get == 1)
  }

  "Dequeing an empty queue" should "return None" in {
    val q = new Queue[Int]
    val dequed = q.deque()

    assert(dequed.isEmpty)
  }
 }
