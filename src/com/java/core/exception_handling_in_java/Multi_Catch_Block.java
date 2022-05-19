package com.java.core.exception_handling_in_java;
public class Multi_Catch_Block {
  public static void main(String[] args) {
    try {
      System.out.println(10 / 0);
    } catch(ArrayIndexOutOfBoundsException e) {
      e.printStackTrace();
    } catch(ArithmeticException e) {
      e.printStackTrace();
    } catch(Exception e) {
      e.printStackTrace();
    }
  }
}
