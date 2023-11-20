package io.github.mitchelllisle

object BubbleSort {
  /** Bubble Sort
   * Bubble sort works by iterating over an unsorted array and progressively checking if the jth index is greater than
   * the jth+1 index (on the first ith=0 run). If it is, we swap them. After the swap we keep iterating and comparing.
   * After the first iteration of bubble sort we have altered our array by moving the highest number to the end. Now as
   * we go through to the ith index for the second time (i=1), then we know we don't need to compare the item with the
   * very last item in our array since we know it's sorted. With each ith iteration we reduce the search space until
   * we've gone through the entire array
   * */
  def apply(values: Array[Int]): Array[Int] = {
    for (i <- values.indices) {
      for (j <- 0 until values.length - i - 1) {
        if (values(j) > values(j + 1)) {
          val temp = values(j)
          values(j) = values(j + 1)
          values(j + 1) = temp
        }
      }
    }
    values
  }
}
