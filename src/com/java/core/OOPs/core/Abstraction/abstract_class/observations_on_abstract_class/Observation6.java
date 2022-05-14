package com.java.core.OOPs.core.Abstraction.abstract_class.observations_on_abstract_class;
/**
 * Observation 6: Similar to the interface we can define static methods in an abstract class that can be called independently without an object.
 */
public class Observation6 extends Static_demo {
  public static void main(String[] args) {
    Static_demo.static_in_abstract_class();
  }
}
abstract class Static_demo {
  static void static_in_abstract_class() {
    System.out.println("Static method in abstract class");
  }
}