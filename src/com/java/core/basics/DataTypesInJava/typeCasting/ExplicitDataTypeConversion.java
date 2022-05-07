package com.java.core.basics.DataTypesInJava.typeCasting;

public class ExplicitDataTypeConversion {
public static void main(String[] args) {
	double d=50.20;
	System.out.println("double value is : "+d);
	float f=(float) d;
	System.out.println("explicit casting from double to float:"+f);
	long l=(long)d;
	System.out.println("explicit casting from double to long:"+f);
	int i=(int)d;
	System.out.println("explicit casting from double to int:"+f);

}
}
