package com.java.core.exception_handling_in_java;
class Test_Exception_Propagation1 {
  public void divide1() {
    System.out.println(10 / 0);
  }

  public void divide2() {
    Test_Exception_Propagation1 test_exception_propagation1 = new Test_Exception_Propagation1();
    test_exception_propagation1.divide1();
  }
}

public class Exception_propagation {
  public static void main(String[] args) {
    try {
      Test_Exception_Propagation1 test_exception_propagation1 = new Test_Exception_Propagation1();
      test_exception_propagation1.divide2();
    } catch(Exception e) {
      e.printStackTrace();
      System.out.println("Exception handled");
    }
  }
}
