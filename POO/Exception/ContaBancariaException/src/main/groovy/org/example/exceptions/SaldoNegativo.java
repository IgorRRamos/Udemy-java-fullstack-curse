package org.example.exceptions;

public class SaldoNegativo extends RuntimeException{
    public SaldoNegativo() {
        super("Impossivel realizar o saque com saldo negativo");
    }

    public SaldoNegativo(String menssagem){
        super(menssagem);
    }
}
