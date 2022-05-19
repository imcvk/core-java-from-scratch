package com.java.core.exception_handling_in_java.Java_throw_keyword_Example;
import java.io.IOException;

class DemoThrows {
  void throwFromHere() throws IOException {
    throw new IOException("Device Error");
  }

  void againThrowFromHere() throws IOException {
    DemoThrows demoThrows = new DemoThrows();
    demoThrows.throwFromHere();
  }
}

public class ThrowsDemo2 {
  public static void main(String[] args) {
    DemoThrows demoThrows = new DemoThrows();
    try {
      demoThrows.againThrowFromHere();
    } catch(IOException e) {
      e.printStackTrace();
    }
    System.out.println("Remaining code");
    System.out.println("Normal flow continue");
  }
}

