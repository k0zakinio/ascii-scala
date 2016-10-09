package com.company.springer

object Line {

  def draw(canvas: List[List[String]], x1: Integer, y1: Integer, x2: Integer, y2: Integer): List[List[String]] =
    canvas.zipWithIndex.map { case (row, y) =>
      row.zipWithIndex.map { case (col, x) =>
        if(isDrawAble(canvas, x1, y1, x2, y2, x, y)) "x" else col
      }
    }

  def isDrawAble(canvas: List[List[String]], x1: Integer, y1: Integer, x2: Integer, y2: Integer, x: Int, y: Int): Boolean =
    y1.equals(y2) && x >= x1 && x <= x2 && y1.equals(y) || x1.equals(x2) && y >= y1 && y <= y2 && x1.equals(x)
}
