package org.example.servicos;

import org.example.interfaces.Controlador;
import org.example.modelos.Times;

import java.util.*;

public class GerenciadorCampeonato implements Controlador {
    private List<Times> times;
    final int max_times = 20;
    int escolha;
    Random aleatorio = new Random();

    public GerenciadorCampeonato() {
        this.times = new ArrayList<>();
    }

    @Override
    public void adicionar(String nome){
        times.add(new Times(nome));
    }

    @Override
    public void jogarRodada() {
        if(times.size() == max_times){
            for(int i = 0; i < max_times; i++){
                for(int j = i + 1; j < max_times; j++){
                    escolha = aleatorio.nextInt(3);

                    if(escolha == 0){
                        times.get(i).setPontos(times.get(i).getPontos() + 1);
                        times.get(i).setEmpates(times.get(i).getEmpates() + 1);

                        times.get(j).setPontos(times.get(j).getPontos() + 1);
                        times.get(j).setEmpates(times.get(j).getEmpates() + 1);
                    }

                    if (escolha == 1){
                        times.get(i).setPontos(times.get(i).getPontos() + 3);
                        times.get(i).setVitorias(times.get(i).getVitorias() + 1);

                        times.get(j).setDerrotas(times.get(j).getDerrotas() + 1);
                    }

                    if (escolha == 2){
                        times.get(j).setPontos(times.get(j).getPontos() + 3);
                        times.get(j).setVitorias(times.get(j).getVitorias() + 1);

                        times.get(i).setDerrotas(times.get(i).getDerrotas() + 1);
                    }
                }
            }
        } else {
            System.out.println("Não tem 20 times");
        }
    }


    @Override
    public void tabela() {
        ArrayList<Times> tabela = new ArrayList<>();

        for(int i = 0; i < max_times; i++){
            tabela.add(times.get(i));
        }

        tabela.sort(Comparator.comparingInt(Times::getPontos).reversed());
        int position = 1;
        for(int i = 0; i < max_times; i++){
            System.out.println(position +  " "  + tabela.get(i).getNome() + "       " + " P " + tabela.get(i).getPontos() + "  V " + tabela.get(i).getVitorias()
             + "  D " + tabela.get(i).getDerrotas() + "  E " + tabela.get(i).getEmpates());

            position++;
        }
    }


    public List<Times> getTimes() {
        return times;
    }

    public void setTimes(List<Times> times) {
        this.times = times;
    }

    public int getMax_times() {
        return max_times;
    }
}
