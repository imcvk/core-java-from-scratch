package com.java.core.OOPs.core.Abstraction.abstract_class.observations_on_abstract_class;
/**
 * Observation 4: Abstract classes can also have final methods (methods that cannot be overridden)
 */
public class Observation4 {
}
// Java Program to Illustrate Abstract classes
// Can also have Final Methods

// Class 1
// Abstract class
abstract class Observation4_Base {
  final void fun() {
    System.out.println("Base fun() called");
  }
}

// Class 2
class Observation4_Derived extends Observation4_Base {
}

// Class 3
// Main class
class GFG {
  // Main driver method
  public static void main(String args[]) {

    // Creating object of abstract class
    Observation4_Base b = new Observation4_Derived();

    // Calling method on object created above
    // inside main()
    b.fun();
  }
}