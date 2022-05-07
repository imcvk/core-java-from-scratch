package com.java.core.basics.DataTypesInJava.non_primitive.class_data_types;

/**
 * A class in Java is a user defined data type i.e. it is created by the user.
 * It acts a template to the data which consists of member variables and methods.
 * An object is the variable of the class, which can access the elements of class i.e. methods and variables.
 */
class Employee {
  int employeeId, level;
  String name, address;

  public Employee(int employeeId, int level, String name, String address) {
    this.employeeId = employeeId;
    this.level = level;
    this.name = name;
    this.address = address;
  }

  @Override
  public String toString() {
    return "Employee{" +
        "employeeId=" + employeeId +
        ", level=" + level +
        ", name='" + name + '\'' +
        ", address='" + address + '\'' +
        '}';
  }
}

public class Class_DataType_Demo {
  public static void main(String[] args) {
    Employee e = new Employee(891151, 10, "Chaitanya", "Pune");
    System.out.println(e.toString());
  }
}
