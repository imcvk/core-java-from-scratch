package com.java.core.OOPs.core.Polymorphism.Final_Keyword_In_Java;

class Vehicle {
  final String SPEED_LIMIT = "80KMPH";

  public void run() {
    //SPEED_LIMIT = "100kmph";
    System.out.println("Speed Limit for Vehicle is:" + SPEED_LIMIT);
  }
}

class Bike {
  final String SPEED_LIMIT;

  Bike(String spl) {
    System.out.println("blank final variable initialized using constructor");
    SPEED_LIMIT = spl;
  }

  public void run() {
    System.out.println("Speed Limit for Bike is:" + SPEED_LIMIT);
  }
}

public class Final_variable {
  public static void main(String[] args) {
    Vehicle vehicle = new Vehicle();
    vehicle.run();
    Bike b = new Bike("100KMPH");
    b.run();
  }
}
