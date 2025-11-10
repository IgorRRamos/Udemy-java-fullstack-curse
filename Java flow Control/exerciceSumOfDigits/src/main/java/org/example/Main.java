package org.example;

public class Main {
    public static void main(String[] args) {

        int x = 1234, sum = 0;

        while (true) {

            sum = sum + (x % 10);
            x = x / 10;
            if (x < 1) {
                break;
            }
        }
        System.out.println("Sum of digits is " + sum);


    }
}