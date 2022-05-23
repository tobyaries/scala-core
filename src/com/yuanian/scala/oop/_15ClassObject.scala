 package com.yuanian.scala.oop

object _15ClassObject {
//  class Person(private[this] var name:String )
  class Person(private var name:String )

  object Person {
    def printPerson(p:Person) = println(p.name)
  }

  def main(args: Array[String]): Unit = {
    Person.printPerson( new Person("zhangsan"))
  }
}
