package com.java.core.exception_handling_in_java;
public class Throws_Demo1 {
  void divide() throws ArithmeticException {
    System.out.println(10 / 0);
  }

  public static void main(String[] args) {
    Throws_Demo1 throwsDemo1 = new Throws_Demo1();
    try {
      throwsDemo1.divide();
    } catch(Exception e) {
      System.out.println("Exception caught");
      e.printStackTrace();
    }
  }
}
