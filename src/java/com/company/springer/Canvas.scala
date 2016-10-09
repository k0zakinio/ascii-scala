package com.company.springer

object Canvas {

  def generate(width:Int, height:Int): List[List[String]] = List.fill(height)(List.fill(width)(" "))

  private val VERTICAL_BORDER = "|"
  private val HORIZONTAL_BORDER = "-"

  def renderCanvas(canvas: List[List[String]]): String = borderTopBottom(canvas) + "\n" + rowStrings(canvas) + borderTopBottom(canvas)

  private def borderTopBottom(canvas: List[List[String]]): String = repeatString(HORIZONTAL_BORDER, canvas.head.size + 1)

  private def rowStrings(canvas: List[List[String]]): String = canvas.map(row => VERTICAL_BORDER + row.map(col => col).mkString("") + VERTICAL_BORDER + "\n").mkString("")

  private def repeatString(string:String, count:Int): String = (for(i <- 0 to count) yield string).mkString("")

}
