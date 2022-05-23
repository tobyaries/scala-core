 package com.yuanian.scala.oop

object _17ClassObject {
  class Person {
    var name:String = _
    def getName() = this.name
  }

  class Student extends  Person

  def main(args: Array[String]): Unit = {
    val student = new Student()
    student.name = "lisi"
    println(student.getName())
  }

}