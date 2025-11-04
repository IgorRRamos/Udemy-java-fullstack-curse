package org.example;

public class Main {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.println("Before break!");
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }

    }
}