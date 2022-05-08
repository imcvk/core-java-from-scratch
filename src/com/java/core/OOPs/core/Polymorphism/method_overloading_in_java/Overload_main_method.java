package com.java.core.OOPs.core.Polymorphism.method_overloading_in_java;

/**
 * Yes, by method overloading. You can have any number of main methods in a class
 * by method overloading.
 * But JVM calls main() method which receives string array as arguments only.
 *
 */
public class Overload_main_method {
  public static void main(String[] args){System.out.println("main with String[]");}
  public static void main(String args){System.out.println("main with String");}
  public static void main(){System.out.println("main without args");}
}
