package com.java.core.threading_in_java.Thread_Priority_In_Java;
public class Thread_Priority extends Thread {
  public void run() {
    try {
      for(int i = 0; i < 5; i++) {
        System.out.println(Thread.currentThread().getPriority() + " " + Thread.currentThread().getName());
      }
    } catch(Exception e) {
      e.printStackTrace();
    }
  }

  public static void main(String[] args) {
    Thread_Priority th1 = new Thread_Priority();
    Thread_Priority th2 = new Thread_Priority();
    Thread_Priority th3 = new Thread_Priority();
    System.out.println("Priority of the thread th1 is : " + th1.getPriority());
// 2nd Thread
// Display the priority of the thread
    System.out.println("Priority of the thread th2 is : " + th2.getPriority());
// 3rd Thread
// // Display the priority of the thread
    System.out.println("Priority of the thread th2 is : " + th2.getPriority());
// Setting priorities of above threads by
// passing integer arguments
    th1.setPriority(6);
    th2.setPriority(3);
    th3.setPriority(9);
// 6
    System.out.println("Priority of the thread th1 is : " + th1.getPriority());
// 3
    System.out.println("Priority of the thread th2 is : " + th2.getPriority());
// 9
    System.out.println("Priority of the thread th3 is : " + th3.getPriority());
// Main thread
// Displaying name of the currently executing thread
    System.out.println("Currently Executing The Thread : " + Thread.currentThread().getName());
    System.out.println("Priority of the main thread is : " + Thread.currentThread().getPriority());
// Priority of the main thread is 10 now
    Thread.currentThread().setPriority(10);
    System.out.println("Priority of the main thread is : " + Thread.currentThread().getPriority());
  }
}
