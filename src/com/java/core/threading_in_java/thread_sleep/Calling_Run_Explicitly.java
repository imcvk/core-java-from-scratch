package com.java.core.threading_in_java.thread_sleep;
public class Calling_Run_Explicitly extends Thread {
  @Override
  public void run() {
    try {
      for(int i = 1; i < 5; i++) {
        System.out.println(i);
      }
    } catch(Exception e) {
    }
  }

  public static void main(String[] args) {
    Calling_Run_Explicitly calling_run_explicitly = new Calling_Run_Explicitly();
    calling_run_explicitly.start();
    calling_run_explicitly.run();
  }
}
