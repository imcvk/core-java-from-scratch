package com.java.core.this_keyword;

class A4 {
  int data = 10;

  A4() {
    B b = new B(this);
    b.display();
  }
}

class B {
  A4 obj;

  B(A4 obj) {
    this.obj = obj;
  }

  void display() {
    System.out.println(obj.data);//using data member of A4 class
  }
}

public class E_This_can_be_passed_as_argument_in_the_constructor_call {
  int data = 10;

  public static void main(String args[]) {
    A4 a = new A4();
  }
}

