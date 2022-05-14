package com.java.core.OOPs.core.Abstraction.abstract_class;

abstract class Bike1 {
  public abstract void run();
}

public class Abstract_class_eg1 extends Bike1 {

  public void run() {
    System.out.println("Bike is running");
  }

  public static void main(String[] args) {
    Bike1 bike1 = new Abstract_class_eg1();
    bike1.run();
  }
}
