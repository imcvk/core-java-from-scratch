package com.java.core.OOPs.core.Abstraction.abstract_class;

/**
 * Abstract class having constructor, data member and methods
 * An abstract class can have a data member, abstract method, method body (non-abstract method), constructor, and even main() method.
 */
abstract class Bike2 {
  abstract void run();

  Bike2() {
    System.out.println("Abstract class constructor for Bike2 class");
  }

  public void changeGear() {
    System.out.println("Gear changed for bike");
  }
}
//Creating a Child class which inherits Abstract class
class Honda extends Bike2{
  @Override
  void run() {
    System.out.println("Honda Bike is running");
  }
}
public class TestAbstraction2 {
  public static void main(String[] args) {
    Bike2 h=new Honda();
    h.run();
    h.changeGear();
  }
}
