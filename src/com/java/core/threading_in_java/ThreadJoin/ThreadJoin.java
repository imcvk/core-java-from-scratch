package com.java.core.threading_in_java.ThreadJoin;
public class ThreadJoin extends Thread {
  @Override
  public void run() {
    try {
      for(int i = 0; i < 10; i++) {
        Thread.sleep(500);
        System.out.println("The current thread name is: " + Thread.currentThread().getName());
      }
    } catch(Exception e) {
      e.printStackTrace();
    }
  }

  public static void main(String[] args) {
    ThreadJoin t1 = new ThreadJoin();
    ThreadJoin t2 = new ThreadJoin();
    ThreadJoin t3 = new ThreadJoin();
    t1.start();
    try {
      t1.join();
    } catch(Exception e) {
      e.printStackTrace();
    }
    t3.start();
    try {
      t2.join();
    } catch(Exception e) {
      e.printStackTrace();
    }
    t3.start();
  }
}
