package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int userNumber;

        System.out.print("Enter a number: ");
        userNumber = keyboard.nextInt();

        if (userNumber > 10) {
            if (userNumber < 20) {
                System.out.println("In medium");
            } else {
                System.out.println("Is very tall...");
            }
        } else {
            System.out.println("Is very small");
        }

    }
}