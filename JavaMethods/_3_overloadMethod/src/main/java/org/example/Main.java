package org.example;
public class Main {
    public static void main(String[] args) {

        System.out.println(calculator(5, 10));
        System.out.println("____________________________");
        System.out.println(calculator(5));
        System.out.println("____________________________");
        System.out.println(calculator(25, 2.5));
        System.out.println("____________________________");

    }

    public static int calculator(int num1, int num2){
        return num1+num2;
    }
    public static int calculator(int num1){
        return num1*num1;
    }
    public static double calculator(double num1, double num2){
        return num1/num2;
    }

}