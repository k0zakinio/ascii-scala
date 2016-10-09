package com.company.springer

import org.junit.Assert._
import org.junit.Test

class RectangleTest {

  @Test
  def canDrawRectangles(): Unit = {
    var canvas: List[List[String]] = Canvas.generate(20, 5)
    canvas = Parser.newInput("R 16 1 20 3", canvas)
    val output:String = Canvas.renderCanvas(canvas)
    val expected:String =
      "----------------------\n" +
      "|               xxxxx|\n" +
      "|               x   x|\n" +
      "|               xxxxx|\n" +
      "|                    |\n" +
      "|                    |\n" +
      "----------------------"

    assertEquals(output, expected)
  }

}