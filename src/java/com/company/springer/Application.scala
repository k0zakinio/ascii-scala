package com.company.springer

class Application {

  def newInput(inputString: String): String= {
    val commands = inputString.split(" ")
    val canvas:List[List[String]] = commands(0) match {
      case "C" => Canvas.generate(Integer.valueOf(commands(1)), Integer.valueOf(commands(2)))
    }

    Canvas.renderCanvas(canvas)
  }
}
