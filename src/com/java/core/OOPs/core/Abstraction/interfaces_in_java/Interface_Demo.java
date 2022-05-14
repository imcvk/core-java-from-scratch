package com.java.core.OOPs.core.Abstraction.interfaces_in_java;
interface Bank {
  float getInterestRate();
}

class SBI implements Bank {
  public float getInterestRate() {
    return 10;
  }
}

class HDFC implements Bank {
  public float getInterestRate() {
    return 8.5f;
  }
}

class ICICI implements Bank {
  public float getInterestRate() {
    return 9;
  }
}

public class Interface_Demo {
  public static void main(String[] args) {
    System.out.println("Interface implementation of bank example");
    Bank b;
    b = new HDFC();
    System.out.println("Interest Rate for HDFC:" + b.getInterestRate());
    b = new SBI();
    System.out.println("Interest Rate for SBI:" + b.getInterestRate());
    b = new ICICI();
    System.out.println("Interest Rate for ICICI:" + b.getInterestRate());
  }
}
