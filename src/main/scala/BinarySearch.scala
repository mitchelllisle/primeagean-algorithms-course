package io.github.mitchelllisle

object BinarySearch {
  /** Binary Search
   * Binary search works on arrays that are already sorted. Once an array is sorted, it gives us a couple of advantages
   * when it comes to finding values more efficiently. The main advantage is that we can reduce the search space by
   * comparing our needle with the middle point of an increasingly smaller array. We know that if the value we want it
   * greater than the middle point, then we can discard all the values to the left of that mid point. On the other hand,
   * we know that if our value is less than the middle point, we can discard all the value on the right hand side.
   *
   * Doing this makes this algorithm O(logN) because we only have the compare subsets of the array to find our value
   * instead of every single value in an array.
   */
  def apply(haystack: Array[Int], needle: Int): Boolean = {
    // We need a low and high point to start with which captures the entire array
    var low = 0
    var high = haystack.length - 1
    // from here, we then check the entire array until we're finished (we this when our low and high intersect)
    while (low < high) {
      // First thing to do is get the middle point of where we're up to in our search
      val mid = low + (high - low) / 2
      // And then get the value in the middle of our chunk
      val value = haystack(mid)

      if (value == needle) {
        // if the value we've found matches, then we've found what we're looking for
        return true
      } else if (needle < value) {
        // if the value is greater than our needle, then we know the value MUST be in the left half of our chunk, so
        // we set the high to our middle value since we know it can't be past it on the right side.
        high = mid
      } else {
        // On the other hand, if our value is higher than our low point, then we know the lowest point we can search
        // is from the value after our middle point (since we've already compared the value against the middle point)
        low = mid + 1
      }
    }
    // If we get to here, we know the value isn't in our array since we've progressively split the array in the middle
    // and compared it until our low and high intersect
    false
  }
}
