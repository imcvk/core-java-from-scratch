package com.java.core.OOPs.Constructors_in_Java.ConstructorOverloading;

class Student {
  int rollNo;
  String name;
  String division;
  int rank;

  Student() {
    System.out.println("Default Constructor");
  }

  Student(int rollNo, String name) {
    this.rollNo = rollNo;
    this.name = name;
    System.out.println("");
    System.out.println("Roll No:" + this.rollNo);
    System.out.println("Name:" + this.name);
  }

  Student(int rollNo, String division, int rank) {
    this.rollNo = rollNo;
    this.division = division;
    this.rank = rank;
    System.out.println("Roll no:" + this.rollNo);
    System.out.println("Division:" + this.division);
    System.out.println("Roll no:" + this.rank);
  }
}

public class Constructor_Overloading {

  public static void main(String[] args) {
    Student student1 = new Student();
    System.out.println("2 parameter");
    student1 = new Student(2302, "Chaitanya");
    System.out.println("3 parameter");
    student1 = new Student(2302, "A", 3);
  }
}
