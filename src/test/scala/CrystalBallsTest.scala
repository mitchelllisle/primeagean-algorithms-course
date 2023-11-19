package io.github.mitchelllisle

import org.scalatest.flatspec.AnyFlatSpec

class CrystalBallsTest extends AnyFlatSpec {
  "Given an array where breaks occur at 5, we" should "return index 5" in {
    val breaks = Array(false, false, false, false, false, true, true, true)
    val breakIndex = CrystalBalls(breaks)

    assert(breakIndex == 5)
  }

  "Given an array where breaks occur at 2, we" should "return index 2" in {
    val breaks = Array(false, false, true, true, true, true, true, true)
    val breakIndex = CrystalBalls(breaks)

    assert(breakIndex == 2)
  }

  "Given an array where no breaks occur, we" should "return -1" in {
    val breaks = Array(false, false, false)
    val breakIndex = CrystalBalls(breaks)

    assert(breakIndex == -1)
  }
}
