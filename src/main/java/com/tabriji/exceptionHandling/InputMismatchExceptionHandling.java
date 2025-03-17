package com.tabriji.exceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchExceptionHandling {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a number: ");
        int number = 0;
        do {
            try {
                number = input.nextInt();
                if (number != -1) {
                    System.out.println("You have entered " + number + ", enter another number: (-1 to exit)");
                } else {
                    System.out.println("Program exited!");
                }
            } catch (InputMismatchException e) {
                e.printStackTrace();
                System.out.println("Please enter only a number: (-1 to exit)");
                input.nextLine();
            }
        } while (number != -1);
    }
}
