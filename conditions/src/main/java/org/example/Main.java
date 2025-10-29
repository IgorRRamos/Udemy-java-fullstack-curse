package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int userNumber;

        System.out.print("Enter a number: ");
        userNumber = keyboard.nextInt();

        if(userNumber > 5){
            System.out.println("Is big...");
        }else{
            System.out.println("Is small");
        }

    }
}