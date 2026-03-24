package org.example.contaBancaria;

import org.example.entities.Usuario;

public class Conta {
    Usuario usuario;
    private String tipo;
    private double saldo;

    public Conta(Usuario usuario, String tipo) {
        this.usuario = usuario;
        this.tipo = tipo;
        if(tipo.equals("CC")){
            this.saldo = 200.0;
        }else{
            this.saldo = 150.0;
        }
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getNomeUsuario(){
        return usuario.getNome();
    }
    public int getIdadeUsuario(){
        return usuario.getIdade();
    }
}
