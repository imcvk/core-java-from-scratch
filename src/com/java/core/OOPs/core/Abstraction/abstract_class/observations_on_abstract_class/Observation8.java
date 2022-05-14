package com.java.core.OOPs.core.Abstraction.abstract_class.observations_on_abstract_class;
/**
 * Observation 8: If a class contain at least one abstract method then compulsory we should declare class as abstract
 * otherwise we will get compile time error because If a class contains at least one abstract method then implementation
 * is not complete for that class and hence it is not recommended to create a object so in order to restrict object creation for
 * such partial classes we use abstract keyword
 */
abstract class Abstract_Demo {
  abstract void abstract_demo_method();
}

class Abstract_demo_impl extends Abstract_Demo {
  void abstract_demo_method() {
    System.out.println("Abstract method implementation");
  }
}

public class Observation8 {
  public static void main(String[] args) {
    //Abstract_demo_impl abstract_demo_impl=new Abstract_demo_impl();
    Abstract_Demo abstract_demo_impl=new Abstract_demo_impl();
    abstract_demo_impl.abstract_demo_method();
  }
}
