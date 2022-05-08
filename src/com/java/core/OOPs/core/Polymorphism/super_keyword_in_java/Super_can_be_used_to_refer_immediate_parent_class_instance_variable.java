package com.java.core.OOPs.core.Polymorphism.super_keyword_in_java;

class Animal {
  String color = "white";
}

class Dog extends Animal {
  String color = "Black";

  public void printColor() {
    System.out.println("Dog color:" + color);
    System.out.println("Animal default color:" + super.color);
  }
}

public class Super_can_be_used_to_refer_immediate_parent_class_instance_variable {
  public static void main(String[] args) {
    Dog d = new Dog();
    d.printColor();
  }
}
