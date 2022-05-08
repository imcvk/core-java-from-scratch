package com.java.core.OOPs.core.Polymorphism.super_keyword_in_java;

class SuperParent {
  SuperParent() {
    System.out.println("Super parent constructor");
  }
}

class Child extends SuperParent {
  Child() {
    super();
    System.out.println("Child constructor");
  }
}

public class Super_can_be_used_to_invoke_immediate_parent_class_constructor {
  public static void main(String[] args) {
    Child c = new Child();
  }
}
