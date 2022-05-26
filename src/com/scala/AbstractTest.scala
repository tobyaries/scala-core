package com.scala

/***
 * author: tianyuan
 */
object AbstractTest {
  abstract class Animal {
    def say
  }
  class Cock extends Animal {
    override def say: Unit = println("Wo wo~")
  }
  object Cock {
    def apply(): Cock = new Cock()
  }
  class Duck extends Animal {
    override def say: Unit = println("Gua gua--")
  }
  def main(args: Array[String]): Unit = {
    def animalSay(animal: Animal) = animal.say
    animalSay(Cock())
    animalSay(new Duck())
  }
}
