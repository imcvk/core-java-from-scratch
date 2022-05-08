package com.java.core.OOPs.core.Inheritance.aggregation_in_java;

/**
 * In this example, Employee has an object of Address, address object contains its own
 * information such as city, state, country etc.
 * In such case relationship is Employee HAS-A address.
 */
class Address {
  String city;
  String state;
  String country;

  public Address(String city, String state, String country) {
    this.city = city;
    this.state = state;
    this.country = country;
  }

  @Override
  public String toString() {
    return "Address{" +
        "city='" + city + '\'' +
        ", state='" + state + '\'' +
        ", country='" + country + '\'' +
        '}';
  }
}

class Employee {
  int empID;
  String name;
  Address address;

  public Employee(int empID, String name, Address address) {
    this.empID = empID;
    this.name = name;
    this.address = address;
  }

  @Override
  public String toString() {
    return "Employee{" +
        "empID=" + empID +
        ", name='" + name + '\'' +
        ", address=" + address +
        '}';
  }
}

public class Aggregation_Example {
  public static void main(String[] args) {
    Address a = new Address("Sangola", "Maharashtra", "India");
    Employee e = new Employee(8911514, "Chaitanya", a);
    System.out.println(e.toString());
  }
}
