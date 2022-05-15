package com.java.core.OOPs.core.Encapsulation.Access_Modifiers_in_Java.public_demo.pack;
import com.java.core.OOPs.core.Encapsulation.Access_Modifiers_in_Java.public_demo.mypack.PublicDemo;

class PublicDemo2 {
  public void publicDemoMethod2() {
    System.out.println("Public access modifier demo method publicDemoMethod2 from same package different class");
  }
}

public class PublicDemo1 {
  public void publicDemoMethod3() {
    System.out.println("Public access modifier demo method publicDemoMethod3 from same class");
  }

  public static void main(String[] args) {
    //for same package different class
    PublicDemo2 publicDemo2 = new PublicDemo2();
    publicDemo2.publicDemoMethod2();
    //different package
    PublicDemo publicDemo = new PublicDemo();
    publicDemo.publicDemoMethod();
    //same class
    PublicDemo1 publicDemo1 = new PublicDemo1();
    publicDemo1.publicDemoMethod3();
  }
}
