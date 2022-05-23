package com.yuanian.scala.oop

object _20ClassObject {
  class Person
  class Student extends  Person
  def main(args: Array[String]): Unit = {
    val student = new Student
    if (student.isInstanceOf[Student]) {
      val student1 = student.asInstanceOf[Student]
      println(student1)
    } else {
      println("not a student")
    }
  }

}