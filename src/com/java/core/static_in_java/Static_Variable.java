package com.java.core.static_in_java;

//Java Program to demonstrate the use of an instance variable
//which get memory each time when we create an object of the class.
class Counter {
  //will get memory each time when the instance is created
  int count = 0;

  Counter() {
    count++;//incrementing value
    System.out.println(count);
  }
}

//Java Program to illustrate the use of static variable which
//is shared with all objects.
class Counter2 {
  static int count = 0;//will get memory only once and retain its value

  Counter2() {
    count++;//incrementing the value of static variable
    System.out.println(count);
  }
}

public class Static_Variable {
  public void program_of_the_counter_without_static_variable() {
    //Creating objects
    System.out.println("Using non static variable");
    Counter c1 = new Counter();
    Counter c2 = new Counter();
    Counter c3 = new Counter();
  }

  public void program_of_the_counter_with_static_variable() {
    //Creating objects
    System.out.println("Using static variable");
    Counter2 c1 = new Counter2();
    Counter2 c2 = new Counter2();
    Counter2 c3 = new Counter2();
  }

  public static void main(String[] args) {
    Static_Variable static_variable = new Static_Variable();
    static_variable.program_of_the_counter_without_static_variable();
    static_variable.program_of_the_counter_with_static_variable();
  }

}
