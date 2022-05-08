package com.java.core.OOPs.core.Polymorphism.method_overloading_in_java;

class Calculate {
  public int calculate(int a, int b) {
    return a * b;
  }

  public float calculate(float a, int b) {
    return a * b;
  }
}

public class By_changing_the_data_type {
  public static void main(String[] args) {
    Calculate c = new Calculate();
    System.out.println(c.calculate(12, 45));
    System.out.println(c.calculate(78.12f, 45));
  }
}
