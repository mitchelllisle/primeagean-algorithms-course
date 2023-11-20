package io.github.mitchelllisle

import org.scalatest.flatspec.AnyFlatSpec

class BubbleSortTest extends AnyFlatSpec {
  "Given An unsorted array, we" should "return a sorted array" in {
    val unsortedValues = Array(1, 4, 6, 9, 2, 3)

    val sortedValues = BubbleSort(unsortedValues)
    assert(sortedValues.length == unsortedValues.length)

    sortedValues.init.indices.map(v => assert(sortedValues(v) < sortedValues(v + 1)))
  }
}
