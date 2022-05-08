package com.java.core.OOPs.core.Inheritance.inheritance_in_java;

class Dog extends Animal {
  Dog() {
    System.out.println("Dog->Animal");
  }
}

public class Single {
  public static void main(String[] args) {
    Dog d = new Dog();
  }
}
