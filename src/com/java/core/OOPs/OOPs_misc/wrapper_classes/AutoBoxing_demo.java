package com.java.core.OOPs.OOPs_misc.wrapper_classes;
public class AutoBoxing_demo {
  public static void main(String[] args) {
    int i = 20;
    System.out.println("Before  conversion:" + i);
    Integer integer = Integer.valueOf(i);//converting int into Integer explicitly
    Integer integer1 = i;
    System.out.println("After conversion:" + integer);
    System.out.println("Autoboxing:" + integer1);
  }
}
