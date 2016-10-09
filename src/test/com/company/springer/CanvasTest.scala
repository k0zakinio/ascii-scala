package com.company.springer;

import org.junit.Assert._
import org.junit.Test

class CanvasTest {

  @Test
  def canGenerateA5x5Canvas(): Unit = {
    val canvas: List[List[String]] = Canvas.generate(5, 5)
    val actual: String = Canvas.renderCanvas(canvas)
    val expected: String =
      "-------\n" +
      "|     |\n" +
      "|     |\n" +
      "|     |\n" +
      "|     |\n" +
      "|     |\n" +
      "-------"

    assertEquals(actual, expected)
  }

  @Test
  def canGenerateA20x5Canvas(): Unit = {
    val canvas: List[List[String]] = Canvas.generate(20, 5)
    val actual: String = Canvas.renderCanvas(canvas)
    val expected: String =
      "----------------------\n" +
      "|                    |\n" +
      "|                    |\n" +
      "|                    |\n" +
      "|                    |\n" +
      "|                    |\n" +
      "----------------------"

    assertEquals(actual, expected)
  }

}