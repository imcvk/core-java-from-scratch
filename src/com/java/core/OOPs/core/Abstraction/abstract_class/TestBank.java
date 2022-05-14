package com.java.core.OOPs.core.Abstraction.abstract_class;

abstract class Bank {
  abstract void getInterestRate();
}

class HDFC extends Bank {
  @Override
  void getInterestRate() {
    System.out.println("Interest Rate for HDFC is:8%");
  }
}

class SBI extends Bank {
  void getInterestRate() {
    System.out.println("Interest Rate for SBI is:18%");
  }
}


class ICICI extends Bank {
  void getInterestRate() {
    System.out.println("Interest Rate for ICICI is:9%");
  }
}

public class TestBank {
  public static void main(String[] args) {
    Bank b;
    b = new HDFC();
    b.getInterestRate();
    b = new SBI();
    b.getInterestRate();
    b = new ICICI();
    b.getInterestRate();
  }
}
