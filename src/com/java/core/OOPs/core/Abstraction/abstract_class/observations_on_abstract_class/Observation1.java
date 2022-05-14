package com.java.core.OOPs.core.Abstraction.abstract_class.observations_on_abstract_class;

/**
 * Observation 1: In Java, just likely in C++ an instance of an abstract class cannot be created,
 * we can have references to abstract class type though. It is as shown below via clean java program.
 *
 * */
abstract class Observation1_Base{
  abstract void fun();
}
class Observation1_Child extends Observation1_Base{
  @Override
  void fun() {
    System.out.println("fun() inside ");
  }
}
public class Observation1 {
  public static void main(String[] args) {

  }
}
