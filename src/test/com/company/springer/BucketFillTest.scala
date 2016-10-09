package com.company.springer

import org.junit.Test

import org.junit.Assert._

 class BucketFillTest {

    @Test
    def canBucketFill(): Unit = {
        var canvas: List[List[String]] = Canvas.generate(20, 5)
        canvas = Parser.newInput("R 16 1 20 3", canvas)
        canvas = Parser.newInput("B 10 3 o", canvas)
        val output:String = Canvas.renderCanvas(canvas)
        val expected:String =
            "----------------------\n" +
            "|oooooooooooooooxxxxx|\n" +
            "|ooooooooooooooox   x|\n" +
            "|oooooooooooooooxxxxx|\n" +
            "|oooooooooooooooooooo|\n" +
            "----------------------"

        assertEquals(output, expected)
    }
}