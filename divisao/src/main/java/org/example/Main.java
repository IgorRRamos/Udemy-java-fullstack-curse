package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num1, num2;
        double resultado;

        System.out.print("Digite 1 numero: ");
        num1 = entrada.nextInt();
        System.out.print("Digite outro numero: ");
        num2 = entrada.nextInt();

        resultado = num1 / num2;


        System.out.println(resultado);

    }
}