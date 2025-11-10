package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     Scanner keyboard = new Scanner(System.in);

     int num1, num2;
     double result;

        System.out.print("Write 1 number: ");
        num1 = keyboard.nextInt();
        System.out.print("Write other number: ");
        num2 = keyboard.nextInt();

        result = num1 * num2;

        System.out.println(result);

    }
}