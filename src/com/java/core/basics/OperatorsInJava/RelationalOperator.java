package com.java.core.basics.OperatorsInJava;

public class RelationalOperator {
    public static void main(String[] args) {
        RelationalOperator relationalOperator = new RelationalOperator();
        relationalOperator.comparison();
        relationalOperator.equality();
    }

    // comparison	< > <= >= instanceof
    public void comparison() {
        int a = 200, b = 565;
        System.out.println("< Operator:" + (a < b));
        System.out.println("<= Operator:" + (a <= b));
        System.out.println("> Operator:" + (a > b));
        System.out.println(">= Operator:" + (a >= b));
    }

    //equality	== !=
    public void equality() {
        int a = 200, b = 565;
        System.out.println("== operator result: " + (a == b));
        System.out.println("!= operator result: " + (a != b));

    }
}
