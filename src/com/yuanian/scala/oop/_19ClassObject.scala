package com.yuanian.scala.oop

object _19ClassObject {
  class Person {
    val name:String = ""
    def getName() = this.name
  }

  class Student extends  Person {
    // 重写字段
    override val name: String = "zhangsan"
    // 重写方法
    override def getName(): String = "hello, " + super.getName()
  }

  def main(args: Array[String]): Unit = {
    val student = new Student()
    println(student.getName())
  }

}