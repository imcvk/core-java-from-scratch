package com.java.core.OOPs.core.Polymorphism.Runtime_Polymorphism_in_Java;

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
    Bank bank = new Bank();
    HDFC hdfc = new HDFC();
    SBI sbi = new SBI();
    ICICI icici = new ICICI();
    Bank ref;
    ref = hdfc;
    ref.interestRate();
    ref = sbi;
    ref.interestRate();
    ref = icici;
    ref.interestRate();
  }
}


