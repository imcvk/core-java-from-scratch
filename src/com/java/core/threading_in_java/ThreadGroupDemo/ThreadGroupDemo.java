package com.java.core.threading_in_java.ThreadGroupDemo;
public class ThreadGroupDemo extends Thread {
  @Override
  public void run() {
    for(int j = 0; j < 100; j++) {
      try {
        Thread.sleep(5);
      } catch(InterruptedException e) {
        System.out.println("The exception has been encountered " + e);
      }
    }
  }

    public static void main (String[]args){
      ThreadGroup tg1 = new ThreadGroup("Parent thread group");
      ThreadGroupDemo t1 = new ThreadGroupDemo();
      //t1.start();
      ThreadGroupDemo t2 = new ThreadGroupDemo();
      //t2.start();
      ThreadGroupDemo t3 = new ThreadGroupDemo();
      //t3.start();
      System.out.println("The total number of active threads are: " + tg1.activeCount());
      System.out.println("Thread Group Name: " + tg1.getName());
      tg1.list();
    }
  }
