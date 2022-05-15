package com.java.core.OOPs.core.Encapsulation.Access_Modifiers_in_Java.private_demo;
class DemoPrivate {
  private int rollNo;

  private void printRollNo() {
    System.out.println("Roll No is:" + rollNo);
  }

  //method to access private method and data member using public method inside private class
  void accessDataMemberAndMethod() {
    printRollNo();
  }
}

class DemoPrivate1 extends DemoPrivate {
  //try to access private method and data member
  void demoPrivateMethod() {
    DemoPrivate demoPrivate = new DemoPrivate();
    //demoPrivate.printRollNo(); //con not access private method/data member from outside the class even in inheritance
    //accessing private data members and methods using non-private method inside private class
    accessDataMemberAndMethod();
  }
}

public class Private_Demo {
  public static void main(String[] args) {
    DemoPrivate demoPrivate = new DemoPrivate();
    //demoPrivate.printRollNo();   //con not access private method/data member from outside the class

    demoPrivate.accessDataMemberAndMethod();
    DemoPrivate1 demoPrivate1 = new DemoPrivate1();
    demoPrivate1.accessDataMemberAndMethod();
  }
}
