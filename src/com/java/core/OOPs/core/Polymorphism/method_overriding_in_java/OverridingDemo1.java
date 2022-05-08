package com.java.core.OOPs.core.Polymorphism.method_overriding_in_java;
class Vehicle{
  public void run(){
    System.out.println("vehicle is running");
  }
}
class Bike extends Vehicle{
  public void run(){
    System.out.println("Bike is running");
  }
}
public class OverridingDemo1 {
  public static void main(String[] args) {
    Bike b=new Bike();
    b.run();
  }
}
