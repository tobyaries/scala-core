package com.scala
import scala.util.Random


object MatchCase {

  def main(args: Array[String]): Unit = {
    val x: Int = Random.nextInt(10)

    x match {
      case 0 => println("zero")
      case 1 => println("one")
      case 2 => println("two")
      case _ => println("other")
    }
  }
}
