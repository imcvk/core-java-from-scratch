package com.java.core.OOPs.core.Abstraction.abstract_class.observations_on_abstract_class;
/***
 * Observation 9: If Child class is unable to provide implementation to all abstract methods of Parent class then
 * we should declare that Child class as abstract so that the next level Child class should provide implementation to remaining abstract method
 *  */
abstract class Observation9_Base {
  abstract void print();
}

abstract class Observation9_Child1 extends Observation9_Base {
}

public class Observation9 extends Observation9_Child1 {
  @Override
  void print() {
    System.out.println("Print method");
  }

  public static void main(String[] args) {
    Observation9 observation9 = new Observation9();
    observation9.print();
  }
}


