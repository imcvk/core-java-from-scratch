package com.java.core.java_inner_class_interfaces.java_inner_interfaces;
class NestedInterface {
  interface NestedInterfaceInsideClass {
    int id = 20;

    void print();
  }
}

public class Nested_Interface_Inside_Class implements NestedInterface.NestedInterfaceInsideClass {
  @Override
  public void print() {
    System.out.println("Print method of nested interface");
  }

  public static void main(String[] args) {
    Nested_Interface_Inside_Class nested_interface_inside_class = new Nested_Interface_Inside_Class();
    nested_interface_inside_class.print();
    System.out.println(nested_interface_inside_class.id);
    // Assigning the object into nested interface type
    NestedInterface.NestedInterfaceInsideClass obj = new Nested_Interface_Inside_Class();
    obj.print();
  }
}
