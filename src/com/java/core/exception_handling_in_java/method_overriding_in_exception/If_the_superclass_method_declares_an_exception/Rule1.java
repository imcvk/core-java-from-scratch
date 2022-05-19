package com.java.core.exception_handling_in_java.method_overriding_in_exception.If_the_superclass_method_declares_an_exception;
/***
 * Rule 1: If the superclass method declares an exception,
 * subclass overridden method can declare the same subclass
 * exception or no exception but cannot declare parent exception.
 */
class A {
  void printDivision() throws Exception {
    System.out.println(10 / 0);
  }
}

class B extends A {
  //
  void printDivision() throws Exception {
    System.out.println(10 / 0);
  }
}

class C extends A {
  //Example in case subclass overridden method declares no exception
  void printDivision() {
    System.out.println(10 / 0);
  }
}

class D extends A {
  /***
   * below code will show error.
   */
//  void printDivision() throws  Exception{
//    super.printDivision();
//  }
}
class E extends A{
  //Example in case subclass overridden method declares subclass exception
  void printDivision() throws ArithmeticException {
    System.out.println(10 / 0);
  }
}
public class Rule1 {
  public static void main(String[] args) {
    B b = new B();
    try {
      b.printDivision();
    } catch(Exception e) {
      e.printStackTrace();
    }
  }
}
