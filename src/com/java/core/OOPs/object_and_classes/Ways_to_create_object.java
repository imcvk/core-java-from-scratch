package com.java.core.OOPs.object_and_classes;

public class Ways_to_create_object {
    public static void main(String[] args) {
        //using new Keyword
        Student s1 = new Student(4545, "sdfsdf");
        s1.printDetails();
        //using newInstance()
        //this methods is depreciated
        Student s2 = null;
        try {
            Class c = Class.forName("com.java.core.OOPs.object_and_classes.Student");
            s2 = (Student) c.newInstance();
            System.out.println("Cloned object details");
            s2.printDetails();
        } catch (Exception e) {
            e.printStackTrace();
        }
//using clone
        try {
            Student s3=(Student) s1.clone();
            s3.printDetails();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }
}
