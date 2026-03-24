package org.example;

import org.example.contaBancaria.Banco;
import org.example.contaBancaria.Conta;
import org.example.entities.Usuario;

public class Main {
    public static void main(String[] args) {
        Usuario user1 = new Usuario("Igor", 29);
        Conta conta = new Conta(user1, "CC");

        Banco banco = new Banco(conta);

        banco.consultarSaldo();

        banco.depositar(2000.0);

        banco.sacar(200.0);

        banco.consultarSaldo();

    }
}
