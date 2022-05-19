package com.java.core.exception_handling_in_java.Java_throw_keyword_Example;
// class represents user-defined exception
class UserDefinedException extends Exception {
  public UserDefinedException(String str) {
    // Calling constructor of parent Exception
    super(str);
  }
}

// Class that uses above MyException
public class Throwing_User_Defined_Exception {
  public static void main(String args[]) {
    try {
      // throw an object of user defined exception
      throw new UserDefinedException("This is user-defined exception");
    } catch(UserDefinedException ude) {
      System.out.println("Caught the exception");
      // Print the message from MyException object
      System.out.println(ude.getMessage());
    }
  }
}
