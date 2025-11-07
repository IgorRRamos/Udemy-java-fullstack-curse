package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner (System.in);
        String nome;

        System.out.println("Digite seu nome: ");
        nome = keyboard.nextLine();

        System.out.println("Olá " + nome + " !!");

    }
}