package com.java.core.basics.OperatorsInJava;

public class UnaryOperator {
    public static void main(String[] args) {
        UnaryOperator examples = new UnaryOperator();
        examples.unary_increment_decrement();
    }

    //postfix- expr++ expr--
    public void unary_increment_decrement() {
        int x = 10;
        System.out.println("Initial value of x is- " + x);
        System.out.println("Result for X++ :" + x++);//10 (11)
        System.out.println("Result for X-- :" + x--);//12 (11)
    }

    //prefix- ++expr --expr +expr -expr ~ !
    public void unary_prefix() {
        int a = 10;
        int b = -10;
        boolean c = true;
        boolean d = false;
        System.out.println(~a);//-11 (minus of total positive value which starts from 0)
        System.out.println(~b);//9 (positive of total minus, positive starts from 0)
        System.out.println(!c);//false (opposite of boolean value)
        System.out.println(!d);//true
    }
}
