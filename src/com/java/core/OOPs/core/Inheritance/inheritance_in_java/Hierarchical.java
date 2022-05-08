package com.java.core.OOPs.core.Inheritance.inheritance_in_java;

class Bank {
  public void getInterestRate() {
    System.out.println("Default Interest rate is:8%");
  }
}

class HDFC extends Bank {
  public void getInterestRate() {
    System.out.println("HDFC Interest rate is:8.5%");
  }
}

class SBI extends Bank {
  public void getInterestRate() {
    System.out.println("SBI Interest rate is:8.7%");
  }
}

class ICICI extends Bank {
  public void getInterestRate() {
    System.out.println("ICICI Interest rate is:9%");
  }
}

public class Hierarchical {
  public static void main(String[] args) {
    HDFC hdfc = new HDFC();
    hdfc.getInterestRate();
    SBI sbi = new SBI();
    sbi.getInterestRate();
    ICICI icici = new ICICI();
    icici.getInterestRate();
  }
}
