package org.example.contaBancaria;

import org.example.entities.Usuario;
import org.example.exceptions.SaldoInsuficiente;
import org.example.exceptions.SaldoNegativo;

public class Banco {
    Conta conta;

    public Banco(Conta conta) {
        this.conta = conta;
    }

    public Banco() {
    }

    public void consultarSaldo(){
        System.out.println(conta.getNomeUsuario());
        System.out.println(conta.getSaldo());
    }

    public void depositar(double valor){
        conta.setSaldo(conta.getSaldo() + valor);
        System.out.println("Ok!");
    }

    public void sacar(double valor){
        double saldoAtual = conta.getSaldo();

        if(saldoAtual <= 0){
            throw new SaldoNegativo("Saldo não pode estar negativado.");
        }
        if(valor > saldoAtual){
            throw new SaldoInsuficiente("Saldo insuficiente.");
        }
        conta.setSaldo(saldoAtual - valor);
        System.out.println("Saque realizado com sucesso!");
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }
}
