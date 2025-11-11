package org.example;

public class Main {
    public static void main(String[] args) {

        loop(0, 10);

    }
    public static void loop(int start, int stop){
        for(;start <= stop; start++){
            System.out.println(start);
        }
    }
}