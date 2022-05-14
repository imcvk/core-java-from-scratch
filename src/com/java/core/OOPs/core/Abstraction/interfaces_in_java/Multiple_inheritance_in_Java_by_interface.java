package com.java.core.OOPs.core.Abstraction.interfaces_in_java;
interface A {
  void print();
}

interface B {
  void print();
}

class Impl implements A, B {
  public void print() {
    System.out.println("Implementing print from interface A and B");
  }
}

public class Multiple_inheritance_in_Java_by_interface {
  public static void main(String[] args) {
    Impl impl = new Impl();
    impl.print();
  }
}
