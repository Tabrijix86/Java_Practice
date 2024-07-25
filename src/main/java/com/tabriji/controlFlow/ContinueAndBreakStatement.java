package com.tabriji.controlFlow;

public class ContinueAndBreakStatement {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0)
                continue; // continue jumps to the next iteration
            System.out.println("The number is: " + i);
            if (i == 7) {
                break; // break leaves a loop
            }
        }
    }
}
