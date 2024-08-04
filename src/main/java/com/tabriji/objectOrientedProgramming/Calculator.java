package com.tabriji.objectOrientedProgramming;

public class Calculator {
    public static void main(String[] args) {
        Calculator a_calculator = new Calculator();
        System.out.println(a_calculator.performAddition(5, 4));
        System.out.println(a_calculator.performAddition(5.444_444, 4.111_111));
        System.out.println(a_calculator.performAddition(5, 4, 3));
    }

    public int performAddition(int a, int b) {
        return a + b;
    }

    public double performAddition(double a, double b) {
        return a + b;
    }

    public int performAddition(int a, int b, int c) {
        return a + b + c;
    }
}