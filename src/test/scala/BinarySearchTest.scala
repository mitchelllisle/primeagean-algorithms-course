package io.github.mitchelllisle

import org.scalatest.flatspec.AnyFlatSpec

class BinarySearchTest extends AnyFlatSpec {
  "Given a value to find that exists in an array, it" should "return true" in {
    val haystack = (1 to 10).toArray
    val needle = 7

    val result = BinarySearch(haystack, needle)

    assert(result)
  }

  "Given a value to find that does not exist in an array, it" should "return false" in {
    val haystack = (1 to 10).toArray
    val needle = 11

    val result = BinarySearch(haystack, needle)

    assert(!result)
  }
}
