package com.java.core.OOPs.object_and_classes;

public class Student implements Cloneable{
	int rollNo;
	String name;

	public Student(int rollNo, String name) {
		super();
		this.rollNo = rollNo;
		this.name = name;
	}

	public void initializeUsingMethod(int r, String n) {
		rollNo = r;
		name = n;
	}

	public Student() {
		super();
	}

	public void printDetails() {
		System.out.println("Roll Number is:" + rollNo);
		System.out.println("Name is:" + name);
	}
	public Object clone()throws CloneNotSupportedException{
		return super.clone();
	}
}
