package com.java.core.exception_handling_in_java.Java_throw_keyword_Example.Final_Finally_Finalize;
public class Finalize_Method {
  public static void main(String[] args) {
    Finalize_Method finalizeMethod = new Finalize_Method();
    System.out.println("Hashcode is:" + finalizeMethod.hashCode());
    finalizeMethod = null;
    System.gc();
    System.out.println("End of GC");
  }

  protected void finalize() {
    System.out.println("called the finalize() method");
  }
}
