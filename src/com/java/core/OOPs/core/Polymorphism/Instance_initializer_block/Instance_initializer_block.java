package com.java.core.OOPs.core.Polymorphism.Instance_initializer_block;

public class Instance_initializer_block {

  Instance_initializer_block() {
    System.out.println("Constructor for Instance_initializer_block");
  }

  {
    System.out.println("Instance initializer block");
  }

  public static void main(String[] args) {
    Instance_initializer_block instance_initializer_block = new Instance_initializer_block();
  }
}
