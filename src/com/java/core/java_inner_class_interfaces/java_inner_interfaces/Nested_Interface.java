package com.java.core.java_inner_class_interfaces.java_inner_interfaces;
interface MyInterface {
  void calculateArea();

  interface MyInnerInterface {
    int id = 20;

    void print();
  }
}

public class Nested_Interface implements MyInterface.MyInnerInterface {
  public void print() {
    System.out.println("Print method of nested interface");
  }

  public static void main(String[] args) {
    Nested_Interface nested_interface = new Nested_Interface();
    nested_interface.print();
    System.out.println(nested_interface.id);
  }
}
