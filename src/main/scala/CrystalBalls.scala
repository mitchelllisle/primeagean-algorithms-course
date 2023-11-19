package io.github.mitchelllisle

object CrystalBalls {
  def apply(breaks: Array[Boolean]): Int = {
    val jump = math.floor(math.sqrt(breaks.length)).toInt

    // First phase: Find the range where the ball breaks using `indexWhere`
    val breakingPointRange = (breaks.indices by jump).indexWhere(i => breaks(i))

    val start = if (breakingPointRange == -1) breaks.length -1 else breakingPointRange * jump

    // Second phase: Linear search in the identified range using `find`

    (math.max(0, start - jump) to start).find(i => breaks(i)) match {
      case Some(index) => index
      case None => -1
    }
  }
}
