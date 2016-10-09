package com.company.springer

object Parser {

  def newInput(inputString: String, canvas: List[List[String]]): List[List[String]] = {
    val commands = inputString.split(" ")
    commands(0) match {
      case "C" =>
        Canvas.generate(Integer.valueOf(commands(1)),
        Integer.valueOf(commands(2)))
      case "L" =>
        Line.draw(canvas,
          Integer.valueOf(commands(1)) -1,
          Integer.valueOf(commands(2)) -1,
          Integer.valueOf(commands(3)) -1,
          Integer.valueOf(commands(4)) -1)
      case "R" =>
        Rectangle.draw(canvas,
          Integer.valueOf(commands(1)) -1,
          Integer.valueOf(commands(2)) -1,
          Integer.valueOf(commands(3)) -1,
          Integer.valueOf(commands(4)) -1)
      case "B" =>
        BucketFill.draw(canvas,
          Integer.valueOf(commands(1)) -1,
          Integer.valueOf(commands(2)) -1,
          commands(3))
    }
  }
}
