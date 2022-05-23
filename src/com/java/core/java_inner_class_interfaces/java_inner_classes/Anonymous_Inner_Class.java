package com.java.core.java_inner_class_interfaces.java_inner_classes;
abstract class A {
  abstract void printMsg();
}

public class Anonymous_Inner_Class {
  public static void main(String[] args) {

    A a = new A() {
      void printMsg() {
        System.out.println("Inside Anonymous inner class");
      }
    };
    a.printMsg();
  }
}
