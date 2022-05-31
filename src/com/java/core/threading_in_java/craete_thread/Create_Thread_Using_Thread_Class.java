package com.java.core.threading_in_java.craete_thread;
class CreateThreadUsingThreadClass extends Thread {
  public void run() {
    System.out.println("Thread is Running");
  }
}

public class Create_Thread_Using_Thread_Class {
  public static void main(String[] args) {
//    CreateThreadUsingThreadClass threadClass = new CreateThreadUsingThreadClass();
//    System.out.println(threadClass.getState());
//    threadClass.start();
//    System.out.println(threadClass.getState());

    Thread t = new Thread("IDM");
    Thread t1 = new Thread("IDM");
    System.out.println("t1 thread state:" + t.getState());
    t.start();
    System.out.println("t1 thread state:" + t.getState());
    try {
      t.join();
      System.out.println(t.getState());
    } catch(Exception e) {
      e.printStackTrace();
    }
    System.out.println(t.getState());
    try {
      Thread.sleep(500);
      System.out.println(t.getState());
    } catch(Exception e) {
      e.printStackTrace();
    }
  }
}
