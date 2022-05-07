package com.java.core.OOPs.Constructors_in_Java;

class Bike2 {
  int RN;
  String model;

  Bike2(int n, String m) {
    RN = n;
    model = m;
  }

  public void printDetails() {
    System.out.println("Registration Number:" + RN);
    System.out.println("Model:" + model);
  }
}

public class Parameterized_Constructor {
  public static void main(String[] args) {
    Bike2 b = new Bike2(3742, "KTM");
    b.printDetails();
  }
}
