package com.java.core.this_keyword;

class ThisDemo {

  void sendClassObjectAsArgument() {
    System.out.println("Sending class object using this keyword.");
    print(this);
  }

  void print(ThisDemo d) {
    System.out.println("Takes class object as a parameter.");
  }
}

public class D_This_can_be_passed_as_an_argument_in_the_method_call {
  public static void main(String[] args) {
    ThisDemo d = new ThisDemo();
    d.sendClassObjectAsArgument();
  }
}
