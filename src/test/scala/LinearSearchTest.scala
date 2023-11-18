package io.github.mitchelllisle

import org.scalatest.flatspec.AnyFlatSpec

class LinearSearchTest extends AnyFlatSpec {
  "Running linear sort with valid input" should "return the value we're asking for" in {
    val haystack = (1 to 10).toArray
    val needle = 5

    val found = LinearSearch(haystack, needle)

    assert(found)
  }

//  "Running linear sort with missing value" should "return -1" in {
//    val haystack = (1 to 10).toArray
//    val needle = 11
//
//    val found = LinearSearch(haystack, needle)
//
//    assert(!found)
//  }
}
