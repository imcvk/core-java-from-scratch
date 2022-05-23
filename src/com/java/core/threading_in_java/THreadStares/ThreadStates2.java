package com.java.core.threading_in_java.THreadStares;
public class ThreadStates2 implements Runnable {
  public static ThreadStates2 threadStates2;
  public static Thread thread;

  public void run() {
    try {
      for(int i = 0; i < 5; i++) {
        thread.sleep(100);
      }
    } catch(Exception e) {
      e.printStackTrace();
    }
  }

  public static void main(String[] args) {
    threadStates2 = new ThreadStates2();
    thread = new Thread(threadStates2);
    System.out.println("Thread state before start:" + thread.getState());
    thread.start();
    System.out.println("Thread state after start:" + thread.getState());
    ThreadStates2 states2 = new ThreadStates2();
    Thread thread1 = new Thread(states2);
    System.out.println("Thread 2 state:" + thread1.getState());
    thread1.start();
    System.out.println("Thread 2 state:" + thread1.getState());

    try {
      thread.join();
    } catch(Exception e) {
      e.printStackTrace();
    }
    System.out.println("Thread 1 state:" + thread.getState());
    System.out.println("Thread 2 state:" + thread1.getState());
  }
}
