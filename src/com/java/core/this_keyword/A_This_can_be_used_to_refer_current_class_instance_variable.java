package com.java.core.this_keyword;

/**
 * The this keyword can be used to refer current class instance variable.
 * If there is ambiguity between the instance variables and parameters,
 * his keyword resolves the problem of ambiguity.
 */
class Student {
  int rollNo;
  String name;

  Student(int rollNo, String name) {
//    rollNo = rollNo;
//    name = name;
    System.out.println("we have to use this keyword in such cases where instance variable name and formal parameter names are same.");
    this.rollNo = rollNo;
    this.name = name;
  }

  @Override
  public String toString() {
    return "Student{" +
        "rollNo=" + rollNo +
        ", name='" + name + '\'' +
        '}';
  }
}

/**
 * class where this is not required.
 */

class Teacher {
  int id;
  String name;

  Teacher(int teacherId, String teacherName) {
    System.out.println("this keyword is not required in such case since instance variable and formal parameter names are different.");
    id = teacherId;
    name = teacherName;
  }

  @Override
  public String toString() {
    return "Teacher{" +
        "id=" + id +
        ", name='" + name + '\'' +
        '}';
  }
}

public class A_This_can_be_used_to_refer_current_class_instance_variable {
  public static void main(String[] args) {
    Student s = new Student(1212, "Sachin");
    System.out.println(s.toString());
    Teacher t = new Teacher(2465456, "Suresh");
    System.out.println(t.toString());
  }
}
