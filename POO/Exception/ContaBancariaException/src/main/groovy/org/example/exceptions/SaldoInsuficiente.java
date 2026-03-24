package org.example.exceptions;

public class SaldoInsuficiente extends RuntimeException{
    public SaldoInsuficiente(){
        super("Saldo insuficiente!");
    }


    public SaldoInsuficiente(String mensagem){
        super(mensagem);
    }
}
