package com.company.springer

object Application {

  def main(args: Array[String]): Unit = {
    var canvas: List[List[String]] = Canvas.generate(5, 5)
    while(true) {
      print("Enter command: ")
      var input = io.StdIn.readLine()
      canvas = Parser.newInput(input, canvas)
      println(Canvas.renderCanvas(canvas))
    }
  }

}
