package com.scala

object Companion {
  class Person {
   var age:Int = _
   private var sex = "MALE"
   def log() = println(Person.b)
  }
  object Person {
    private val b = 123
    def apply(age: Int): Person = {
      val person = new Person
      person.age = age
      person
    }
  }

  def main(args: Array[String]): Unit = {
    val person = Person(40)
    println(person.age)
    person.log()
  }
}
