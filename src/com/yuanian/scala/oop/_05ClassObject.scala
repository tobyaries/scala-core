package com.yuanian.scala.oop

object _05ClassObject {
  class Customer {
    var name: String = _
    var sex: Int = _
    def printHello(msg: String) = println(msg)
  }

  def main(args: Array[String]): Unit = {
    val customer = new Customer
    customer.printHello("你好")
  }
}
