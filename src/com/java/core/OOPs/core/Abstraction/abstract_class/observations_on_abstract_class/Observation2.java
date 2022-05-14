package com.java.core.OOPs.core.Abstraction.abstract_class.observations_on_abstract_class;
/**
 * Observation 2: Like C++, an abstract class can contain constructors in Java.
 * And a constructor of abstract class is called when an instance of an inherited class is created.
 * It is as shown in the program below as follows:
 */
public class Observation2 {
  // Main driver method
  public static void main(String args[]) {
    // Creating object of class 2
    // inside main() method
    Observations2_Base_Derived d = new Observations2_Base_Derived();
  }
}

abstract class Observations2_Base {
  // Constructor of class 1
  Observations2_Base() {
    // Print statement
    System.out.println("Base Constructor Called");
  }

  // Abstract method inside class1
  abstract void fun();
}

// Class 2
class Observations2_Base_Derived extends Observations2_Base {
  // Constructor of class2
  Observations2_Base_Derived() {
    System.out.println("Derived Constructor Called");
  }

  // Method of class2
  void fun() {
    System.out.println("Derived fun() called");
  }
}

