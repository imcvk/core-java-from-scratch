package com.java.core.OOPs.core.Abstraction.interfaces_in_java;
interface Vehicle {
  // all are the abstract methods.
  void changeGear(int a);

  void speedUp(int a);

  void applyBrakes(int a);
}

class Bicycle implements Vehicle {
  int speed;
  int gear;

  Bicycle() {
    System.out.println("Bicycle---");
  }

  public void changeGear(int gear) {
    this.gear = gear;
  }

  public void speedUp(int speed) {
    this.speed = speed;
  }

  public void applyBrakes(int decreased_speed) {
    speed = speed - decreased_speed;
  }

  public void printStates() {
    System.out.println(
        "Initial Speed: " + speed + "\tGear: " + gear
    );
  }
}

class Bike {
  int speed;
  int gear;

  Bike() {
    System.out.println("Bike------------");
  }

  public void changeGear(int newGear) {
    gear = newGear;
  }

  public void speedUp(int newSpeed) {
    speed = newSpeed;
  }

  public void applyBreak(int newSpeed) {
    speed = speed - newSpeed;
  }

  public void printStates() {
    System.out.println("Speed:" + speed + "\tGear:" + gear);
  }
}

public class Interface_EG1 {
  public static void main(String[] args) {

    Bicycle b = new Bicycle();
    b.speedUp(20);
    b.changeGear(3);
    b.applyBrakes(5);
    b.printStates();
    Bike bike = new Bike();
    bike.changeGear(4);
    bike.speedUp(100);
    bike.printStates();
    bike.applyBreak(20);
    bike.changeGear(3);
    bike.printStates();
  }
}
