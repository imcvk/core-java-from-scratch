package com.java.core.exception_handling_in_java.custon_exception;
class InvalidAge extends Exception {
  InvalidAge(String msg) {
    super(msg);
  }
}
public class Custom_Exception {
  public void validateAge(int age) throws InvalidAge {
    if(age < 18) {
      throw new InvalidAge("Age is valid");
    }
  }
  public static void main(String[] args) {
    Custom_Exception custom_exception = new Custom_Exception();
    try {
      custom_exception.validateAge(16);
    } catch(Exception e) {
      e.printStackTrace();
    }
  }
}
