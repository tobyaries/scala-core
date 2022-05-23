package com.yuanian.java;

class Person {
    public Person(Integer age) {
        this();
        this.age = age;

    }

    public Person() {
        System.out.println("默认构造器");
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    private Integer age;


}
public class Test {
    public static void main(String[] args) {
        Person person = new Person(18);
        System.out.println(person.getAge());
    }
}
