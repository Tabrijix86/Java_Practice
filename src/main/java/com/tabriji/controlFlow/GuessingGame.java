package com.tabriji.controlFlow;

import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        int number = 15;

        Scanner input = new Scanner(System.in);
        int guess;
        do {
            System.out.print("Guess a number: ");
            guess = input.nextInt();

            if (guess == number) {
                System.out.println("Congratulations!" + " Your guess is correct");
            } else if (number > guess) {
                System.out.println("The number is greater");
            } else System.out.println("The number is smaller");
        } while (guess != number);
    }
}
