package com.java.core.java_inner_class;
class StaticNestedDemoOuter {
  static class StaticNestedDemo {
    void staticNestedDemoClassMethod() {
      System.out.println("Inside Static nested demo class");
    }

    static void staticNestedDemoClassMethod2() {
      System.out.println("Static method Inside Static nested demo class");
    }
  }
}

public class Static_Nested_Class {
  public static void main(String[] args) {
    StaticNestedDemoOuter staticNestedDemoOuter = new StaticNestedDemoOuter();
    StaticNestedDemoOuter.StaticNestedDemo staticNestedDemo = new StaticNestedDemoOuter.StaticNestedDemo();
    staticNestedDemo.staticNestedDemoClassMethod();
    StaticNestedDemoOuter.StaticNestedDemo.staticNestedDemoClassMethod2();
  }
}
