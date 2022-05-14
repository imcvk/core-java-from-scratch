package com.java.core.OOPs.core.Abstraction.abstract_class;

abstract class Shape {
  abstract public void draw();
}

class Square extends Shape {
  @Override
  public void draw() {
    System.out.println("Square Drown");
  }
}

class Circle extends Shape {
  @Override
  public void draw() {
    System.out.println("Circle Drown");
  }
}

class Triangle extends Shape {
  @Override
  public void draw() {
    System.out.println("Triangle Drown");
  }
}

public class TestAbstraction1 {
  public static void main(String[] args) {
    Shape s;
    s = new Circle();
    s.draw();
    s = new Triangle();
    s.draw();
    s = new Square();
    s.draw();
  }
}
