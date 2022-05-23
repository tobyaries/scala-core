 package com.yuanian.scala.oop

object _16ClassObject {
  class Person(var name:String, var age:Int)

  object Person {
    def apply(name:String, age:Int) = new Person(name, age)
  }

  def main(args: Array[String]): Unit = {
    val person = Person("zhangsan", 20)
  }
}
