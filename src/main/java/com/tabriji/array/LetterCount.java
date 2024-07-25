package com.tabriji.array;

import java.util.Scanner;

public class LetterCount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter characters: ");
        String input_value = input.nextLine();
        input_value = input_value.toLowerCase();
        char[] letters = input_value.toCharArray();

        int[] counts = new int[26];

        for (char letter : letters) {
            if (Character.isLetter(letter)) {
                int index = letter - 'a';
                counts[index]++;
            }
        }
        System.out.println("Letter counts: ");
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] != 0) {
                char letter = (char) (i + 'a');
                System.out.println(letter + ": " + counts[i]);
            }
        }
    }
}
