package com.java.core.this_keyword;
class DemoThis {
  DemoThis() {
    System.out.println("Default constructor,invoked by using this keyword from parameterised constructor");
  }

  DemoThis(String name) {
    this();
    System.out.println("Parameterised constructor inviked");
  }
}
public class C_This_can_be_used_to_invoke_current_class_constructor {

  public static void main(String[] args) {
    DemoThis d=new DemoThis("fdgdf");

  }
}
