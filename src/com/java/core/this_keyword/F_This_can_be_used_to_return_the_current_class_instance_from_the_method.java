package com.java.core.this_keyword;

class ReturnInstanceUsingThis {

  public ReturnInstanceUsingThis getObject() {
    return this;
  }

  public void msg() {
    System.out.println("msg");
  }
}

public class F_This_can_be_used_to_return_the_current_class_instance_from_the_method {
  public static void main(String[] args) {
    new ReturnInstanceUsingThis().getObject().msg();
  }
}
