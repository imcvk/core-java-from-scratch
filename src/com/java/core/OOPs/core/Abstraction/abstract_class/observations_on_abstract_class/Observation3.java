package com.java.core.OOPs.core.Abstraction.abstract_class.observations_on_abstract_class;
/**
 * Observation 3: In Java, we can have an abstract class without any abstract method.
 * This allows us to create classes that cannot be instantiated but can only be inherited.
 * It is as shown below as follows with help of clean java program.
 */
public class Observation3 {
}

// Java Program to illustrate Abstract class, Without any abstract method
// An abstract class without any abstract method
abstract class Observations3_Base {
  // Demo method
  void fun() {
    // Print message if class 1 function is called
    System.out.println("Function of Base class is called");
  }
}

class Observations3_Derived extends Observations3_Base {
}

class Main {
  // Main driver method
  public static void main(String args[]) {
    // Creating object of class 2
    Observations3_Derived d = new Observations3_Derived();
    // Calling function defined in class 1 inside main()
    // with object of class 2 inside main() method
    d.fun();
  }
}