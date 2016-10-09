package com.company.springer

import org.junit.Assert._
import org.junit.Test

class AcceptanceTests {

  var app = new Application()

  @Test
  def canvasCanBeCreated(): Unit = {
    val output:String = app.newInput("C 20 4")
    val expected:String =
      "----------------------\n" +
      "|                    |\n" +
      "|                    |\n" +
      "|                    |\n" +
      "|                    |\n" +
      "----------------------"

    assertEquals(output, expected)
  }

  @Test
  def canDrawHorizontalLines(): Unit = {
    val output:String = app.newInput("L 1 2 6 2")
    val expected:String =
      "----------------------\n" +
      "|                    |\n" +
      "|xxxxxx              |\n" +
      "|                    |\n" +
      "|                    |\n" +
      "----------------------"

    assertEquals(output, expected)
  }

  @Test
  def canDrawVerticalLines(): Unit = {
    val output:String = app.newInput("L 1 2 6 2")
    val expected:String =
      "----------------------\n" +
      "|                    |\n" +
      "|xxxxxx              |\n" +
      "|     x              |\n" +
      "|     x              |\n" +
      "----------------------"

    assertEquals(output, expected)
  }

  @Test
  def canDrawRectangles(): Unit = {
    val output:String = app.newInput("R 16 1 20 3")
    val expected:String =
      "----------------------\n" +
      "|               xxxxx|\n" +
      "|xxxxxx         x   x|\n" +
      "|     x         xxxxx|\n" +
      "|     x              |\n" +
      "----------------------"

    assertEquals(output, expected)
  }

  @Test
  def canBucketFill(): Unit = {
    val output:String = app.newInput("B 10 3 o")
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