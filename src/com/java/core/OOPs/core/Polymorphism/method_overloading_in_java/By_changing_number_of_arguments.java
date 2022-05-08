package com.java.core.OOPs.core.Polymorphism.method_overloading_in_java;

class Compute {
  public int add(int a, int b) {
    return a + b;
  }

  public int add(int a, int b, int c) {
    return a + b + c;
  }
}

public class By_changing_number_of_arguments {
  public static void main(String[] args) {
    Compute c = new Compute();
    System.out.println(c.add(10, 20));
    System.out.println(c.add(45, 56, 89));
  }
}
