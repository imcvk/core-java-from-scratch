package com.java.core.OOPs.java_class;

//Student is real life entity
class Student {
  // instance variables  or attributes of class
  int rollNo;
  String name;
  String div;

  // constructor to instantiate
  Student() {
  }

  //method
  public String toString() {
    return "Student{" +
        "rollNo=" + rollNo +
        ", name='" + name + '\'' +
        ", div='" + div + '\'' +
        '}';
  }
}

public class ClassDemo {
  public static void main(String[] args) {
    Student student = new Student();
    student.rollNo = 34323;
    student.name = "sdfgfsdf";
    student.div = "A";
    System.out.println(student.toString());
  }
}
