package com.java.core.exception_handling_in_java.Java_throw_keyword_Example.Final_Finally_Finalize;
public class Finally_Block_Demo {
  public static void main(String[] args) {
    try {
      System.out.println(0 / 10);
    } catch(Exception e) {
      e.printStackTrace();
    } finally {
      System.out.println("Important code which must be executed...");
    }
  }
}
