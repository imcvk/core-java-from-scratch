package com.java.core.OOPs.core.Abstraction.interfaces_in_java;
interface Printable {
  void print();
}

interface Showable extends Printable {
  void show();
}

public class Interface_inheritance implements Printable, Showable {
  @Override
  public void print() {
    System.out.println("Method from Printable interface");
  }

  @Override
  public void show() {
    System.out.println("Method from Showable Interface");
  }

  public static void main(String[] args) {
    Interface_inheritance inheritance = new Interface_inheritance();
    inheritance.print();
    inheritance.show();
  }
}
