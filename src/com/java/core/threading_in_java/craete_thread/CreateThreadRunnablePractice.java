package com.java.core.threading_in_java.craete_thread;
public class CreateThreadRunnablePractice implements Runnable {
  public void run() {
    for(int i = 0; i < 10; i++) {
      try {
        System.out.println("Thread going the sleep");
        Thread.sleep(100);
        System.out.println("Thread woke up ");
      } catch(Exception e) {
        e.printStackTrace();
      }
    }
    System.out.println("--------------------Thread execution finished--------------------------");
  }

  public static void main(String[] args) {
    CreateThreadRunnablePractice createThreadRunnablePractice = new CreateThreadRunnablePractice();
    Thread thread = new Thread(createThreadRunnablePractice);
    thread.start();
  }
}
