package com.java.core.threading_in_java.craete_thread;
public class CreateThreadPractice1 extends Thread {
  CreateThreadPractice1() {
    System.out.println("Constructor invoked...");
  }

  public void run() {
    try {
      for(int i = 0; i < 5; i++) {
        System.out.println("Thread is sleeping");
        Thread.sleep(100);
        System.out.println("Thread continued after sleep time");
      }
    } catch(Exception e) {
      e.printStackTrace();
    }
    System.out.println("Thread running finished");
  }

  public static void main(String[] args) {
    CreateThreadPractice1 c = new CreateThreadPractice1();
    c.start();
  }
}
