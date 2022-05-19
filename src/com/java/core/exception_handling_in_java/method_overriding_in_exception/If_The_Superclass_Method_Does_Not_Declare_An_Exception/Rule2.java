package com.java.core.exception_handling_in_java.method_overriding_in_exception.If_The_Superclass_Method_Does_Not_Declare_An_Exception;
/**
 * Rule 2: If the superclass method does not declare an exception,
 * subclass overridden method cannot declare the checked exception but can declare unchecked exception.
 */
class Parent1 {
  void msg() {
    System.out.println("Parent method not declaring any exception");
  }
}

public class Rule2 extends Parent1 {
  @Override
  void msg() throws ArithmeticException {
    System.out.println("Can declare unchecked exception");
  }

  public static void main(String[] args) {
    Parent1 p1 = new Parent1();
    p1.msg();
    p1 = new Rule2();
    p1.msg();
  }
}
