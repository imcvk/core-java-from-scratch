package com.java.core.OOPs.core.Abstraction.interfaces_in_java.JDK_new_features_in_interface;
interface Static_Method_Demo {
  static void printStatic() {
    System.out.println("Static method inside interface which can be accessed directly using interface name");
  }

  void printNormal();

  default void printDefault() {
    System.out.println("Default method in Interface");
  }
}

public class Static_Method_Interface implements Static_Method_Demo {
  public void printNormal() {
    System.out.println("Implementing class providing implementation for printNormal()");
  }

  public static void main(String[] args) {
    Static_Method_Demo demo = new Static_Method_Interface();
    demo.printDefault();
    demo.printNormal();
    Static_Method_Demo.printStatic();
  }
}
