package com.scala

/**
 * Author: tianyuan
 */
object TemplatePattern {
  trait Action {
    def run
    def callRun() = run
  }
  class Cat extends Action {
    override def run: Unit = println("a cat runs")
  }
  class Dog extends Action {
    override def run: Unit = println("a dog runs")
  }
  def main(args: Array[String]): Unit = {
    val func = (animal: Action) => animal.callRun()
    func(new Cat)
  }
}
