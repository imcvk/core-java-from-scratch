package com.java.core.threading_in_java.craete_thread;
class Thread1 extends Thread {
  @Override
  public void run() {
    System.out.println("Task 1");
  }
}

class Thread2 extends Thread {
  public void run() {
    System.out.println("Task 2");
  }
}

public class Multiple_Single_Task_By_Multiple_Threads {
  public static void main(String[] args) {

    Thread1 thread1 = new Thread1();
    thread1.start();
    Thread2 thread2 = new Thread2();
    thread2.start();
  }
}
