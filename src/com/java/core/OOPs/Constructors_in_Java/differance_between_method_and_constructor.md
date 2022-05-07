# Difference between constructor and method in Java

There are many differences between constructors and methods. They are given below.

	

**Java Method**

1. A method is used to expose the behavior of an object.
2. The method name may or may not be same as the class name.
3. The method is not provided by the compiler in any case.
4. The method is invoked explicitly.
5. A method must have a return type.

**Java Constructor**
1. A constructor is used to initialize the state of an object.
2. A constructor must not have a return type.	
3. The constructor is invoked implicitly.
4. The Java compiler provides a default constructor if you don't have any constructor in a class.
5. The constructor name must be same as the class name.


**Q) Does constructor return any value?**
Yes, it is the current class instance (You cannot use return type yet it returns a value).

**Can constructor perform other tasks instead of initialization?**
Yes, like object creation, starting a thread, calling a method, etc. You can perform any operation in the constructor as you perform in the method.

**Is there Constructor class in Java?**
Yes.

**What is the purpose of Constructor class?**
Java provides a Constructor class which can be used to get the internal information of a constructor in the class. It is found in the java.lang.reflect package.
