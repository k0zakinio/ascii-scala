package com.company.springer

import org.junit.Assert._
import org.junit.Test

class LineTest {

    @Test
    def canDrawHorizontalLines(): Unit = {
        var canvas: List[List[String]] = Canvas.generate(20, 5)
        canvas = Parser.newInput("L 1 2 6 2", canvas)
        val output:String = Canvas.renderCanvas(canvas)
        val expected:String =
            "----------------------\n" +
            "|                    |\n" +
            "|xxxxxx              |\n" +
            "|                    |\n" +
            "|                    |\n" +
            "|                    |\n" +
            "----------------------"

        assertEquals(expected, output)
    }

    @Test
    def canDrawVerticalLines(): Unit = {
        var canvas: List[List[String]] = Canvas.generate(20, 5)
        canvas = Parser.newInput("L 6 2 6 4", canvas)
        val output:String = Canvas.renderCanvas(canvas)
        val expected:String =
            "----------------------\n" +
            "|                    |\n" +
            "|     x              |\n" +
            "|     x              |\n" +
            "|     x              |\n" +
            "|                    |\n" +
            "----------------------"

        assertEquals(expected, output)
    }

}