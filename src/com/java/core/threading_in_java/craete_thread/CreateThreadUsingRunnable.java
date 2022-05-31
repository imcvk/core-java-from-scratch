package com.java.core.threading_in_java.craete_thread;
class CreateUsingRunnable implements Runnable {
  @Override
  public void run() {
    System.out.println("running");
  }
}

public class CreateThreadUsingRunnable {
  public static void main(String[] args) {
    CreateThreadUsingThreadClass threadClass = new CreateThreadUsingThreadClass();
    Thread t = new Thread(threadClass, "asdasda");
    System.out.println(t.getName() + " is " + t.getState());
    t.start();
    System.out.println(t.getName() + " is " + t.getState());
  }
}
