package com.java.core.exception_handling_in_java.Java_throw_keyword_Example;
public class Throwing_Unchecked_Exception1 {
  void getElement(int a[]) {
    if(a.length < 10) {
      throw new ArrayIndexOutOfBoundsException("Size is not enough");
    } else {
      System.out.println(a);
    }
  }

  public static void main(String[] args) {
//    int a[] = new int[]{1, 2, 3, 4};
    int[] a = new int[5];
    Throwing_Unchecked_Exception1 exception1 = new Throwing_Unchecked_Exception1();
    exception1.getElement(a);
  }
}
