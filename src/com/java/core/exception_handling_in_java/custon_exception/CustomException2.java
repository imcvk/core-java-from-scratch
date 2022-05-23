package com.java.core.exception_handling_in_java.custon_exception;
class InvalidVote extends Exception {
  InvalidVote(String msg) {
    super(msg);
  }
}

public class CustomException2 {
  public void validateVote(int age) throws InvalidVote {
    if(age < 18) {
      throw new InvalidVote("Voter is not elligible to vote");
    }
  }

  public static void main(String[] args) {
    CustomException2 customException2 = new CustomException2();
    try {
      customException2.validateVote(13);
    } catch(Exception e) {
      e.printStackTrace();
    }
  }
}
