package com.tabriji.dataTypeOperatorAndExpression;

import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {

        Scanner input_taker = new Scanner(System.in);

        System.out.println("Enter temperature in celsius: ");
        double celsius = input_taker.nextDouble();

        double fahrenheit = (celsius * 9 / 5) + 32;

        System.out.println("Temperature in fahrenheit is: " + fahrenheit);
    }
}
