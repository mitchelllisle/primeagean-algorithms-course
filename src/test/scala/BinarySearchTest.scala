package io.github.mitchelllisle

import org.scalatest.flatspec.AnyFlatSpec

class BinarySearchTest extends AnyFlatSpec {
  "Given a value to find that exists in an array, it" should "return true" in {
    val values = (1 to 10).toArray
    val lo = 1
    val hi = 10

    val result = BinarySearch(values, lo, hi)

    assert(result)
  }

//  "Given a value to find that does not exist in an array, it" should "return false" in {
//    val values = (1 to 10).toArray
//    val lo = 1
//    val hi = 10
//
//    val result = BinarySearch(values, lo, hi)
//
//    assert(!result)
//  }
}
