package com.java.core.basics.DataTypesInJava.non_primitive.Interface_Datatype_Demo;

/**
 * An interface is similar to a class however the only difference is that its methods are abstract by default i.e.
 * they do not have body. An interface has only the final variables and method declarations.
 * It is also called a fully abstract class.
 * <p>
 * Note: If the class implements an interface, it must implement all the methods of that interface.
 * If not, we must declare the class as abstract.
 */
interface Employee {
  int employeeId = 0, level = 0;
  String name = null, address = null;

  public void display();
}

public class Interface_DataType_Demo implements Employee {
  @Override
  public void display() {
    System.out.println(
        "Employee Id:" + employeeId
            + ",Level:" + level
            + ",Name:" + name
            + ",Address: " + address
    );
  }

  public static void main(String[] args) {
    Employee e = new Interface_DataType_Demo();
    e.display();
  }
}
