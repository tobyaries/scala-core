package com.yuanian.scala.oop

object _14ClassObject {
  // 1. 创建伴生类
  class CustomerService {
    def save() = {
      println(CustomerService.SERVICE_NAME)
    }
  }
  // 2. 创建伴生对象
  object CustomerService {
    private val SERVICE_NAME = "CustomerService"
  }
  // 3. 创建对象，调用方法
  def main(args: Array[String]): Unit = {
    val service = new CustomerService
    service.save()
  }

}
