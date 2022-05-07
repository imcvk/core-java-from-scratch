package com.java.core.OOPs.java_static_keyword;

class Student {
  int rollNo;
  String name;
  static String college = "SMS";

  public Student(int rollNo, String name) {
    this.rollNo = rollNo;
    this.name = name;
  }

  public void display() {
    System.out.println("Roll number:" + rollNo);
    System.out.println("Name:" + name);
    System.out.println("College:" + college);
  }
}

public class Static_As_Keyword {
  public static void main(String[] args) {
    Student s1 = new Student(1234, "Chaitanya");
    //static variable accessed using class name directly and not by object.
  //    Student.college="SDJV";
    s1.display();
  }
}
