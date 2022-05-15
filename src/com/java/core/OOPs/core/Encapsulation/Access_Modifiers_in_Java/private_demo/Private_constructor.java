package com.java.core.OOPs.core.Encapsulation.Access_Modifiers_in_Java.private_demo;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/***
 * If you make any class constructor private,
 * you cannot create the instance of that class from outside the class.
 */
class Private_constructor_demo {
  private Private_constructor_demo() {
    System.out.println("Private constructor Demo");
  }

  void printPrivate_constructor_demo() {
    System.out.println("inside Private_constructor_demo");
  }
}

public class Private_constructor {
  public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
    //Cont create object of this class using private constructor
    //Private_constructor_demo private_constructor_demo=new Private_constructor_demo();
    Constructor<Private_constructor_demo> constructor = Private_constructor_demo.class.getDeclaredConstructor();
    constructor.setAccessible(true);
    Private_constructor_demo foo = constructor.newInstance();
    foo.printPrivate_constructor_demo();
  }
}
