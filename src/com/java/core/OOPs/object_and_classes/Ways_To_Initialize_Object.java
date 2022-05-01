package com.java.core.OOPs.object_and_classes;

public class Ways_To_Initialize_Object {
    public static void main(String[] args) {
//		Initialization through reference
        Student s1 = new Student();
        s1.rollNo = 101;
        s1.name = "Sonoo";
        System.out.println("Initialization through reference");
        s1.printDetails();
//initializing through constructor
        Student s2 = new Student(454, "Sachin");
        System.out.println("initializing through constructor");
        s2.printDetails();
//initializing object using method
        Student s3 = new Student();
        s3.initializeUsingMethod(784, "Arnav");
        System.out.println("initializing object using method");
        s3.printDetails();
    }
}
