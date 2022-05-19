package com.java.core.exception_handling_in_java;
public class Try_Catch_Demo {
  public static void main(String[] args) {
    try {
      System.out.println(10 / 0);
    } catch(ArithmeticException e) {
      e.printStackTrace();
    }
  }
}
