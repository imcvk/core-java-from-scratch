package com.java.core.OOPs.core.Polymorphism.Final_Keyword_In_Java;

/**
 * If you make any method as final, you cannot override it.
 */
class Vehicle1 {
  final void run() {
    System.out.println("Vehicle is running");
  }
}

class Jeep extends Vehicle1 {
//  public void run() {
//    System.out.println("Jeep is running");
//  }
}

public class Final_method {
  public static void main(String[] args) {
    Jeep jeep = new Jeep();
    jeep.run();
  }
}
