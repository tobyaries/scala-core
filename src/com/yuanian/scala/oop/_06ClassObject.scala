package com.yuanian.scala.oop

object _06ClassObject {
  class Person {
    // 类型推断
    private var name = "123"
    private var age = 0

    def getName() = this.name
    def setName(name:String) = this.name = name
    def getAge() = this.age
    def setAge(age:Int) = this.age = age

    protected def getNameAndAge() = (this.name, this.age)
  }

  def main(args: Array[String]): Unit = {
    val person = new Person
    person.getName()

  }
}
