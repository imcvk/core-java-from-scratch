package com.java.core.OOPs.core.Abstraction.interfaces_in_java.JDK_new_features_in_interface;
interface Default_Demo {
//  void print1();

  default void printNew() {
    System.out.println("PrintNew Default method added by using new feature in jdk 8");
  }
}

public class Default_Methods_In_Interface implements Default_Demo {
//  public void print1() {
//    System.out.println("Print1 abstract method from interface");
//  }

  public static void main(String[] args) {
    Default_Methods_In_Interface defaultMethodsInInterface = new Default_Methods_In_Interface();
  //    defaultMethodsInInterface.print1();
    defaultMethodsInInterface.printNew();
  }
}
