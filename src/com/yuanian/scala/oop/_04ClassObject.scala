package com.yuanian.scala.oop

object _04ClassObject {
  // 1. 定义类
  class Person {
    // 2. 定义成员变量
    var name:String = _
    var age:Int = _
  }

  def main(args: Array[String]): Unit = {
    // 3. 创建对象、访问成员、设置成员
    val person = new Person
//    person.name = "张三"
//    person.age = 20

    println(person.name)
    println(person.age)
  }
}
