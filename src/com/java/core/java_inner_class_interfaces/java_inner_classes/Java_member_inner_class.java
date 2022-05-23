package com.java.core.java_inner_class;
public class Java_member_inner_class {
  class Member_Inner {
    void msg() {
      System.out.println("Non static inner class of Member_Inner");
    }
  }

  public static void main(String[] args) {
    Java_member_inner_class java_member_inner_class = new Java_member_inner_class();
    Java_member_inner_class.Member_Inner member_inner = java_member_inner_class.new Member_Inner();
    member_inner.msg();
  }
}
