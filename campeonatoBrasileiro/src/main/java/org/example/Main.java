package org.example;

import org.example.servicos.GerenciadorCampeonato;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GerenciadorCampeonato brasileiro = new GerenciadorCampeonato();
        Scanner teclado = new Scanner(System.in);
        int escolha=0;


        do{

            System.out.println(" ");
            System.out.println("1 - Adicionar times");
            System.out.println("2 - Jogar rodada");
            System.out.println("3 - Mostrar tabela");
            System.out.print("\n--> ");
            escolha = teclado.nextInt();

            switch (escolha){
                case 1:
                    brasileiro.adicionar("Flamengo            ");
                    brasileiro.adicionar("Palmeiras           ");
                    brasileiro.adicionar("São Paulo           ");
                    brasileiro.adicionar("Corinthians         ");
                    brasileiro.adicionar("Santos              ");
                    brasileiro.adicionar("Grêmio              ");
                    brasileiro.adicionar("Internacional       ");
                    brasileiro.adicionar("Atlético Mineiro    ");
                    brasileiro.adicionar("Cruzeiro            ");
                    brasileiro.adicionar("Fluminense          ");
                    brasileiro.adicionar("Botafogo            ");
                    brasileiro.adicionar("Vasco da Gama       ");
                    brasileiro.adicionar("Athletico Paranaense");
                    brasileiro.adicionar("Bahia               ");
                    brasileiro.adicionar("Fortaleza           ");
                    brasileiro.adicionar("Bragantino          ");
                    brasileiro.adicionar("Cuiabá              ");
                    brasileiro.adicionar("Goiás               ");
                    brasileiro.adicionar("Coritiba            ");
                    brasileiro.adicionar("América Mineiro     ");

                    System.out.println("20 times tradicionais foram adicionados.");
                    System.out.println("\n");
                    break;

                case 2:
                    brasileiro.jogarRodada();
                    System.out.println("Fim da primeira rodada!");
                    break;

                case 3:
                    brasileiro.tabela();
                    break;

            }

        } while(true);

    }
}