package com.tabriji.controlFlow;

import java.util.Arrays;
import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        char a = input.next().charAt(1);
//        System.out.println(a);

//        int[] anArray = new int[10];
        int[] anArray = {10, 20, 30, 40, 50};
        System.out.println(Arrays.toString(anArray));
        System.out.println(anArray.length);
        int[] copiedArray = Arrays.copyOf(anArray, 10);
        System.out.println(Arrays.toString(copiedArray));

    }
}
