package com.company.springer

import org.junit.Assert._
import org.junit.Test

class AcceptanceTests {

  var canvas: List[List[String]] = _

  @Test
  def runAll(): Unit = {
    canvasCanBeCreated()
    canDrawHorizontalLines()
    canDrawVerticalLines()
    canDrawRectangles()
    canBucketFill()
  }

  def canvasCanBeCreated(): Unit = {
    canvas = Parser.newInput("C 20 4", canvas)
    val output:String = Canvas.renderCanvas(canvas)
    val expected:String =
      "----------------------\n" +
      "|                    |\n" +
      "|                    |\n" +
      "|                    |\n" +
      "|                    |\n" +
      "----------------------"
    assertEquals(output, expected)
  }

  def canDrawHorizontalLines(): Unit = {
    canvas = Parser.newInput("L 1 2 6 2", canvas)
    val output:String = Canvas.renderCanvas(canvas)
    val expected:String =
      "----------------------\n" +
      "|                    |\n" +
      "|xxxxxx              |\n" +
      "|                    |\n" +
      "|                    |\n" +
      "----------------------"

    assertEquals(output, expected)
  }

  def canDrawVerticalLines(): Unit = {
    canvas = Parser.newInput("L 6 2 6 4", canvas)
    val output:String = Canvas.renderCanvas(canvas)
    val expected:String =
      "----------------------\n" +
      "|                    |\n" +
      "|xxxxxx              |\n" +
      "|     x              |\n" +
      "|     x              |\n" +
      "----------------------"

    assertEquals(output, expected)
  }

  def canDrawRectangles(): Unit = {
    canvas = Parser.newInput("R 16 1 20 3", canvas)
    val output:String = Canvas.renderCanvas(canvas)
    val expected:String =
      "----------------------\n" +
      "|               xxxxx|\n" +
      "|xxxxxx         x   x|\n" +
      "|     x         xxxxx|\n" +
      "|     x              |\n" +
      "----------------------"

    assertEquals(output, expected)
  }

  def canBucketFill(): Unit = {
    canvas = Parser.newInput("B 10 3 o", canvas)
    val output:String = Canvas.renderCanvas(canvas)
    val expected:String =
      "----------------------\n" +
      "|oooooooooooooooxxxxx|\n" +
      "|xxxxxxooooooooox   x|\n" +
      "|     xoooooooooxxxxx|\n" +
      "|     xoooooooooooooo|\n" +
      "----------------------"

    assertEquals(output, expected)
  }
}