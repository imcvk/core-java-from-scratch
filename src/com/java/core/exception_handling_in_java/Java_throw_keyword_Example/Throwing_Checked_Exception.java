package com.java.core.exception_handling_in_java.Java_throw_keyword_Example;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Throwing_Checked_Exception {
  public static void method() throws FileNotFoundException {

    FileReader file = new FileReader("C:\\Users\\Anurati\\Desktop\\abc.txt");
    BufferedReader fileInput = new BufferedReader(file);

    throw new FileNotFoundException();
  }

  //main method
  public static void main(String args[]) {
    try {
      method();
    } catch(FileNotFoundException e) {
      e.printStackTrace();
    }
    System.out.println("rest of the code...");
  }
}
