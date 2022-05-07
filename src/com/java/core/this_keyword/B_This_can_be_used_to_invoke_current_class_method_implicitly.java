package com.java.core.this_keyword;

/**
 * You may invoke the method of the current class by using  "this" keyword.
 * If you don't use "this" keyword,
 * compiler automatically adds this keyword while invoking the method.
 */
public class B_This_can_be_used_to_invoke_current_class_method_implicitly {
  public void firstMethod() {
    System.out.println("Method calling another same class method using this keyword.");
    this.secondMethod();
  }

  public void secondMethod() {
    System.out.println("Method being called by another method in same class using this keyword");
  }

  public static void main(String[] args) {
    B_This_can_be_used_to_invoke_current_class_method_implicitly currentClassMethodImplicitly = new B_This_can_be_used_to_invoke_current_class_method_implicitly();
    currentClassMethodImplicitly.firstMethod();
  }
}
