package com.java.core.OOPs.core.Abstraction.abstract_class.observations_on_abstract_class;
/**
 * Observation 7: We can use abstract keyword for declaring top level classes (Outer class) as well as inner classes as abstract
 */
abstract class Outer_Abstract {
  abstract class Inner_Abstract {
    abstract void innerAbstractMethod();
  }
}

class DemoOuter extends Outer_Abstract {
  class DemoInner extends Inner_Abstract {
    void innerAbstractMethod() {
      System.out.println("Demo inner");
    }
  }
}

public class Observation7 {
  public static void main(String[] args) {
    DemoOuter d = new DemoOuter();
    DemoOuter.DemoInner i = d.new DemoInner();
    i.innerAbstractMethod();
  }
}
