package org.example;

import org.example.servicos.GerenciadorCampeonato;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GerenciadorCampeonato brasileiro = new GerenciadorCampeonato();
        Scanner teclado = new Scanner(System.in);

        brasileiro.adicionar("Atlético-MG");
        brasileiro.adicionar("Bahia");
        brasileiro.adicionar("Botafogo");
        brasileiro.adicionar("Ceará");
        brasileiro.adicionar("Corinthians");
        brasileiro.adicionar("Cruzeiro");
        brasileiro.adicionar("Flamengo");
        brasileiro.adicionar("Fluminense");
        brasileiro.adicionar("Fortaleza");
        brasileiro.adicionar("Grêmio");
        brasileiro.adicionar("Internacional");
        brasileiro.adicionar("Juventude");
        brasileiro.adicionar("Mirassol");
        brasileiro.adicionar("Palmeiras");
        brasileiro.adicionar("Red Bull Bragantino");
        brasileiro.adicionar("Santos");
        brasileiro.adicionar("São Paulo");
        brasileiro.adicionar("Sport");
        brasileiro.adicionar("Vasco da Gama");
        brasileiro.adicionar("Vitória");

        brasileiro.jogarRodada();

        brasileiro.atualizarTabela();
        brasileiro.tabela();
    }
}