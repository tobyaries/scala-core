package com.scala

/**
 * Author: tianyuan
 */
object CurryTest {
  class IfCase {
    def logSpark(msg:String = "Spark") = {
      println(msg)
    }
    def logOther(msg:String = "Other") = {
      println(msg)
    }
    def method1 = (x:String) => {
      if (x == "Spark") {
        println(1)
        logSpark()
      } else {
        println(2)
        logOther()
      }
    }
    def method2 = (x:String) => {
      if (x == "Spark") {
        println(1)
        () => logSpark()
      } else {
        println(2)
        () => logOther()
      }
    }
  }
  def main(args: Array[String]): Unit = {
    val func1 = (a:Int, b:Int) => a +b
    println(func1(1, 2))
    // 延迟求值
    val func2 = (a:Int) => (b:Int) => a + b
    println(func2(1)(2))
    val method1 = new IfCase().method1
    method1("Spark")
    method1("other")
    method1("Spark")
    // 动态创建函数
    val methodSpark = new IfCase().method2("Spark")
    val methodOther = new IfCase().method2("other")
    methodSpark()
    methodOther()
    methodSpark()
  }
}
