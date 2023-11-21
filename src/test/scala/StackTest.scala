package io.github.mitchelllisle

import org.scalatest.flatspec.AnyFlatSpec

class StackTest extends AnyFlatSpec {
  "Pushing to a stack" should "result in a stack with one value" in {
    val stack = new Stack[Int]
    assert(stack.head.isEmpty)
    stack.push(1)
    assert(stack.head.isDefined)
  }

  "Popping a stack" should "return the value, length reduced and head is previous" in {
    val stack = new Stack[Int]
    (1 to 10).foreach(stack.push)

    assert(stack.length == 10)
    val popped = stack.pop()
    assert(popped.get == 10)
    assert(stack.length == 9)
  }

  "Popping a stack till its empty" should "result in an empty stack" in {
    val stack = new Stack[Int]
    stack.push(1)

    stack.pop()
    assert(stack.length == 0)

    assert(stack.pop().isEmpty)
  }
}
