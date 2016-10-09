package com.company.springer

object Rectangle {
  def draw(canvas: List[List[String]], x1: Int, y1: Int, x2: Int, y2: Int): List[List[String]] = {
    var resultCanvas: List[List[String]] = Line.draw(canvas, x1, y1, x2, y1)
    resultCanvas = Line.draw(resultCanvas, x1, y1, x1, y2)
    resultCanvas = Line.draw(resultCanvas, x1, y2, x2, y2)
    resultCanvas = Line.draw(resultCanvas, x2, y1, x2, y2)
    resultCanvas
  }
}
