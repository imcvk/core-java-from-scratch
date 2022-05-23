package com.java.core.threading_in_java.craete_thread;
public class Crate_Thread_Using_Thread_Class extends Thread {
  public void run() {
    System.out.println("My thread is running");
  }

  public static void main(String[] args) {
    Crate_Thread_Using_Thread_Class crate_thread_using_thread_class = new Crate_Thread_Using_Thread_Class();
    crate_thread_using_thread_class.run();
  }
}
