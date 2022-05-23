package com.yuanian.scala.oop

object _09ClassObject {
  // 单例对象
  object Dog {
    val LEG_NUM = 4;
  }

  def main(args: Array[String]): Unit = {
    println(Dog.LEG_NUM)
  }
}
