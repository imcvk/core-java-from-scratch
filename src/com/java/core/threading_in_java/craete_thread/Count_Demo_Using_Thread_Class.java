package com.java.core.threading_in_java.craete_thread;
class Count extends Thread {
  Count() {
    super("Extending thread");
    System.out.println("Thread is created " + this);
    start();
  }

  public void run() {
    try {
      for(int i = 0; i < 10; i++) {
        System.out.println("Printing the count " + i);
        Thread.sleep(100);
      }
    } catch(InterruptedException e) {
      System.out.println("Thread is interrupted");
    }
    System.out.println("My thread run is over");
  }
}

public class Count_Demo_Using_Thread_Class {
  public static void main(String[] args) {
    Count c = new Count();
    try {
      while(c.isAlive()) {
        System.out.println("Main thread will be alive till the child thread is live");
        Thread.sleep(1500);
      }
    } catch(Exception e) {
      System.out.println("Main thread interrupted");
    }
    System.out.println("Main thread's run is over");
  }
}
