package com.java.core.basics.DataTypesInJava.non_primitive.array_data_type;

public class MultiDimensional {
  public static void main(String[] args) {
    int a[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    int b[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    //adding two arrays
    int addition[][] = new int[3][3];
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < b.length; j++) {
        addition[i][j] = a[i][j] + b[i][j];
      }
    }
    //printing addition
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < b.length; j++) {
        System.out.print(addition[i][j] + " ");
      }
      System.out.println();
    }
  }
}
