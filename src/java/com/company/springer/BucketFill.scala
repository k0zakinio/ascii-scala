package com.company.springer

object BucketFill {

  def isFillable(canvas: List[List[String]], x: Int, y: Int, fill: String): Boolean = {
    !canvas(y)(x).equals("x") || !canvas(y)(x).equals(fill)
  }

  def floodFill(canvas: List[List[String]], x: Int, y: Int, fill: String): List[List[String]] = {
    if(isFillable(canvas, x, y, fill)) {

    }
    canvas
  }

  def draw(canvas: List[List[String]], x: Int, y: Int, fill: String): List[List[String]] = {
    floodFill(canvas, x, y, fill)
  }
}
