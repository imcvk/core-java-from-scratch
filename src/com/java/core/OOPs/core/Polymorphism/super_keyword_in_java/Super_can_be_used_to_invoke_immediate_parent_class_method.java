package com.java.core.OOPs.core.Polymorphism.super_keyword_in_java;

class BabyDog extends Dog {
  String color = "Pink";

  public void printColorBabyDog() {
    System.out.println("Baby dog Color:" + color);
    super.printColor();
  }
}

public class Super_can_be_used_to_invoke_immediate_parent_class_method {
  public static void main(String[] args) {
    BabyDog dog = new BabyDog();
    dog.printColorBabyDog();
  }
}
