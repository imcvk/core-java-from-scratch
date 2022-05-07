package com.java.core.OOPs.Constructors_in_Java;

class Student {
  int id;
  String name;

  Student(int i, String n) {
    id = i;
    name = n;
  }

  Student(Student s) {
    id = s.id;
    name = s.name;
  }

  void display() {
    System.out.println(id + " " + name);
  }
}

//    By constructor
//    By assigning the values of one object into another
//    By clone() method of Object class
public class Copy_constructor_demo {
  public static void main(String[] args) {
    System.out.println("Using constructor");
    Student s1 = new Student(111, "Karan");
    Student s2 = new Student(s1);
    s1.display();
    s2.display();
    System.out.println("Without constructor");
     s1 = new Student(222, "Sachin");
     s2 = new Student(s1);
    s2.id=s1.id;
    s2.name=s1.name;
    s1.display();
    s2.display();
  }
}
