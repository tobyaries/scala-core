package com.yuanian.scala.oop

object _07ClassObject {
  // 主构造器
  class Person(var name:String="", var age:Int=0) {
    println("调用主构造器")
  }

  def main(args: Array[String]): Unit = {
    val zhangsan = new Person("zhangsan", 20)
    println(zhangsan.name)
    println(zhangsan.age)
  }
}
