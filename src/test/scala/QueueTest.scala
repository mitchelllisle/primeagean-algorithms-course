package io.github.mitchelllisle

import org.scalatest.flatspec.AnyFlatSpec

class QueueTest extends AnyFlatSpec {
  "Peeking" should "return the head" in {
    val q = new Queue[Int]

    q.enqueue(10)
    assert(q.peek().get == 10)

  }
}
