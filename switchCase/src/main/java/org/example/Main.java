package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int choice;

        System.out.println(" (1) Bom dia!");
        System.out.println(" (2) Boa tarde!");
        System.out.println(" (3) Boa noite!");

        System.out.print("");
        choice = keyboard.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Hello world, good morning!");
                break;

            case 2:
                System.out.println("Hello world, good afternoon!");
                break;
            case 3:
                System.out.println("Hello world, good nigth!");
                break;

            default:
                System.out.println("Invalid!");
        }


    }
}