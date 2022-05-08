package com.java.core.OOPs.core.Polymorphism.method_overriding_in_java;

class Bank {
  public void interestRate() {
    System.out.println("Default Interest rate is: 8%");
  }
}

class HDFC extends Bank {
  public void interestRate() {
    System.out.println("Interest rate for HDFC is: 8%");
  }
}

class SBI extends Bank {
  public void interestRate() {
    System.out.println("Interest rate for SBI is: 8%");
  }
}

class ICICI extends Bank {
  public void interestRate() {
    System.out.println("Interest rate for ICICI is: 8%");
  }
}

public class RalLifeOverriding {
  public static void main(String[] args) {
    HDFC hdfc = new HDFC();
    hdfc.interestRate();
    SBI sbi = new SBI();
    sbi.interestRate();
    ICICI icici = new ICICI();
    icici.interestRate();
  }
}
