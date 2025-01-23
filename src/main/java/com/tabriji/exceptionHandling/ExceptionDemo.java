package com.tabriji.exceptionHandling;

public class ExceptionDemo {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;

        int result = 0;

        result = divide(a, b);
        System.out.println(result);
    }

    public static int divide(int a, int b) {
        return a / b;
    }
}
