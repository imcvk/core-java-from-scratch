package com.java.core.exception_handling_in_java.method_overriding_in_exception.If_The_Superclass_Method_Does_Not_Declare_An_Exception;
import java.io.IOException;

/**
 * If the superclass method does not declare an exception
 * Rule 1:
 * If the superclass method does not declare an exception,
 * subclass overridden method cannot declare the checked exception.
 */
class Parent {
  void msg() {
    System.out.println("MSG method of Parent class");
  }
}

public class Rule1 extends Parent {
  // overriding the method in child class gives compile time error
//  void msg() throws IOException {
//    System.out.println("Overridden method");
//  }
  public static void main(String[] args) {
    Parent p = new Parent();
    p.msg();
  }
}
