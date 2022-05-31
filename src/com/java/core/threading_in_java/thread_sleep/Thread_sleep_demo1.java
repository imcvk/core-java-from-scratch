package com.java.core.threading_in_java.thread_sleep;
public class Thread_sleep_demo1 extends Thread {
  Thread_sleep_demo1(String name) {
    this.setName(name);
  }

  @Override
  public void run() {
    try {
      for(int i = 1; i < 5; i++) {
        Thread.sleep(500);
        System.out.println(this.getName());
      }
    } catch(Exception e) {
      e.printStackTrace();
    }
  }

  public static void main(String[] args) {
    Thread_sleep_demo1 t = new Thread_sleep_demo1("IDM");
    Thread_sleep_demo1 t1 = new Thread_sleep_demo1("Chrome");
    t.start();
    t1.start();

  }
}
