package com.yuanian.scala.oop

object _08ClassObject {
  // 主构造器
  class Person(var name:String="", var address:String="") {
    println("调用主构造器")
    def this(data:Array[String]) {
      this(data(0) + data(1))
    }
  }

  def main(args: Array[String]): Unit = {
    val zhangsan = new Person(Array("张三","武汉" ))
    println(s"${zhangsan.name} -- ${zhangsan.address}")
  }
}
