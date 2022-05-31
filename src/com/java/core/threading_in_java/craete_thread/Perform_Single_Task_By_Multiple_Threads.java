package com.java.core.threading_in_java.craete_thread;
public class Perform_Single_Task_By_Multiple_Threads extends Thread {
  public void run() {
    System.out.println("Printer");
  }

  public static void main(String[] args) {
    Perform_Single_Task_By_Multiple_Threads t1 = new Perform_Single_Task_By_Multiple_Threads();
    Perform_Single_Task_By_Multiple_Threads t2 = new Perform_Single_Task_By_Multiple_Threads();
    Perform_Single_Task_By_Multiple_Threads t3 = new Perform_Single_Task_By_Multiple_Threads();
    t1.start();
    t2.start();
    t3.start();
  }
}
