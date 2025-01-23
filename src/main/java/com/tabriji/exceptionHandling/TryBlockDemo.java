package com.tabriji.exceptionHandling;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class TryBlockDemo {
    public static void main(String[] args) {
        String text = "This a text";

        try {
            System.out.println("Entered the try block");
            Files.writeString(Path.of("file.txt"), text, StandardOpenOption.WRITE);
        } catch (IOException e) {
            System.out.println("Entered the catch block");
            e.printStackTrace();
        }
    }
}
