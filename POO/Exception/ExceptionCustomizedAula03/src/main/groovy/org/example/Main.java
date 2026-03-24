package org.example;

import org.example.exceptions.ValidacaoSenhaException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        login();
    }
    public static void login(){
        Scanner teclado = new Scanner(System.in);

        String usuarioDB = "Igor";
        String senhaDB = "13245";

        System.out.print("Usuario: ");
        String consultaUsuario = teclado.nextLine();
        System.out.print("Senha: ");
        String consultaSenha = teclado.nextLine();

        if(!consultaUsuario.equals(usuarioDB)){
            throw new ValidacaoSenhaException("Usuario invalido!");
        }

        if(!consultaSenha.equals(senhaDB)){
            throw new ValidacaoSenhaException();
        }


        System.out.println("Usuario logado com sucesso.");

    }
}
