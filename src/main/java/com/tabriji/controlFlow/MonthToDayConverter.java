package com.tabriji.controlFlow;

import java.util.Scanner;

public class MonthToDayConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter month number: ");
        int month_num = input.nextInt();

        int days = switch (month_num) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            case 2 -> {
                System.out.print("Enter year: ");
                int year = input.nextInt();

                if (year % 4 == 0) {
                    yield 29;
                } else yield 28;
            }
            default -> {
                System.out.println("Invalid input");
                yield 0;
            }
        };
        System.out.println("The month has " + days + " days in it.");
    }
}
