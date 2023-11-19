package io.github.mitchelllisle

object LinearSearch {
  /** Linear Search
   * Linear search is simple. Given a value to find, iterate through the
   * array and if the element you're at matches the input, then it's found. This is an O(N) algorithm because it grows
   * linearly with the size of the array (as the name suggests).
   *
   * @param haystack the array containing integers you're looking for
   * @param needle   the value you're looking for in the haystack
   */
  def apply(haystack: Array[Int], needle: Int): Boolean = {
    for (i <- haystack) {
      if (i == needle) {
        return true
      }
    }
    false
  }
}
