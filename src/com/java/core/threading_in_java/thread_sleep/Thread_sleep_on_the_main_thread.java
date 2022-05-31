package com.java.core.threading_in_java.thread_sleep;
public class Thread_sleep_on_the_main_thread {
  public static void main(String[] args) {
    try {
      for(int i = 0; i < 10; i++) {
        Thread.sleep(1000);
        System.out.println("Thread is sleeping..."+i);
      }
    } catch(Exception e) {
      e.printStackTrace();
    }
  }
}
