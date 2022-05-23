package com.java.core.threading_in_java.craete_thread;
public class Create_Thread_Using_Runnable implements Runnable {
  Thread t;
  String threadName;

  Create_Thread_Using_Runnable(String name) {
    threadName = name;
    System.out.println("Thread crated: " + name);
  }

  public void run() {
    System.out.println("Running thread: " + threadName);
    try {
      for(int i = 0; i < 10; i++) {
        System.out.println("Thread sleeping:" + threadName + "-" + i);
        Thread.sleep(100);
      }
    } catch(Exception e) {
      System.out.println("Thread interrupted: " + threadName);
    }
    System.out.println("Thread executed...");
  }

  void start() {
    System.out.println("Starting thread:" + threadName);
    if(t==null) {
      t = new Thread(this, threadName);
      t.start();
    }
  }

  public static void main(String[] args) {
    Create_Thread_Using_Runnable R1 = new Create_Thread_Using_Runnable("Thread-1");
    R1.start();

    Create_Thread_Using_Runnable R2 = new Create_Thread_Using_Runnable("Thread-2");
    R2.start();
  }
}
