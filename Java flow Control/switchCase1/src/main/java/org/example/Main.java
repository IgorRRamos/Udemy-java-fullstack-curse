package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner keyboard = new java.util.Scanner(System.in);
    String choice;

        System.out.println("(A) = Love");
        System.out.println("(B) = Little");
        System.out.println("(C) = Heart");

        System.out.print("Choice: ");
        choice = keyboard.nextLine();

        switch(choice){
            case "A":
                System.out.println("Love  <3  !");
                break;

            case "B":
                System.out.println("Very little !");
                break;

            case "C":
                System.out.println("Heart !");
                break;
        }

    }
}