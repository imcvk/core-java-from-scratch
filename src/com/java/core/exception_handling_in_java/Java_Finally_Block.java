package com.java.core.exception_handling_in_java;
public class Java_Finally_Block {
  public static void main(String[] args) {
    try {
      System.out.println(10 / 0);
    } catch(Exception e) {
      e.printStackTrace();
    } finally {
      System.out.println("Finally block");
    }
  }
}
