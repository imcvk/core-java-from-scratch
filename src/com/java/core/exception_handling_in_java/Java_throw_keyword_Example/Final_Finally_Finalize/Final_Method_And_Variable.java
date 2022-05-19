package com.java.core.exception_handling_in_java.Java_throw_keyword_Example.Final_Finally_Finalize;
class DemoFinalMethod {
  final void demoFinalMethod() {
    System.out.println("This cant be overridden");
  }
}

final class Final_Class_Demo {
  Final_Class_Demo() {
    System.out.println("this class con not be inherited");
  }
}

public class Final_Method_And_Variable extends DemoFinalMethod//extends Final_Class_Demo  //error
{
  //Final variable demo
  final int SPEED = 100;

  Final_Method_And_Variable(int speed) {
    /**
     * bellow code will throw error
     */
//    SPEED = speed;
  }
  //error
//  final void demoFinalMethod(){
//
//  }
  public static void main(String[] args) {

  }
}
