# Java Variables

A variable is a container which holds the value while the Java program is executed. A variable is assigned with a data type.
Variable is a name of memory location. There are three types of variables in java: local, instance and static.
There are two types of data types in Java: primitive and non-primitive.

**Variable:**
![img.png](img.png)
A variable is the name of a reserved area allocated in memory. In other words, it is a name of the memory location. It is a combination of "vary + able" which means its value can be changed.

**variables in java**

int data=50;//Here data is variable  

**Types of Variables**

**There are three types of variables in Java:**

![img_1.png](img_1.png)
1. local variable
2. instance variable
3. static variable

**types of variables in java**

**1) Local Variable-**
   A variable declared inside the body of the method is called local variable. You can use this variable only within that method and the other methods in the class aren't even aware that the variable exists.

_**`A local variable cannot be defined with "static" keyword.`**_

**2) Instance Variable-**
   A variable declared inside the class but outside the body of the method, is called an instance variable. It is not declared as static.

It is called an instance variable because its value is instance-specific and is not shared among instances.

**3) Static variable-**
   A variable that is declared as static is called a static variable. It cannot be local. You can create a single copy of the static variable and share it among all the instances of the class. Memory allocation for static variables happens only once when the class is loaded in the memory.

_Example to understand the types of variables in java_

```
public class VariableDemo {
static int m = 100;//static variable
void method() {
int n = 90;//local variable
}
public static void main(String args[]) {
int data = 50;//instance variable
}
}

}//end of class   
Java Variable Example: Add Two Numbers
public class Simple{    
public static void main(String[] args){    
int a=10;    
int b=10;    
int c=a+b;    
System.out.println(c);    
}  
} 
```   
 