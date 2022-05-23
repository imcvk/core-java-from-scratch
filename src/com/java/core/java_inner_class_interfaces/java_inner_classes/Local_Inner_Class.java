package com.java.core.java_inner_class;
class Outer1 {
  void printMsg() {
    System.out.println("Method which contains Local inner class");

    class LocalInner {
      void localInnerPrintMsg() {
        System.out.println("Local Inner print method");
      }
    }
    LocalInner localInner = new LocalInner();
    localInner.localInnerPrintMsg();
  }
}

public class Local_Inner_Class {
  public static void main(String[] args) {
    Outer1 outer1 = new Outer1();
    outer1.printMsg();
  }
}
