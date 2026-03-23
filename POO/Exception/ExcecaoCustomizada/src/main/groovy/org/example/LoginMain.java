package org.example;

import org.example.exceptions.LoginInvalidoException;

import java.util.Scanner;

public class LoginMain {

    public static void main(String[] args) {

        try {
            login();
        } catch (LoginInvalidoException e) {
            throw new RuntimeException(e);
        }

    }
    public static void login() throws LoginInvalidoException {
        Scanner teclado = new Scanner(System.in);

        String loginUsuario = "Igor";
        String senhaUsuario = "123";

        System.out.print("Login: ");
        String loginDB = teclado.nextLine();
        System.out.print("Senha: ");
        String senhaDB = teclado.nextLine();

        if(!loginDB.equals(loginUsuario)){
            throw new LoginInvalidoException("Usuario invalido!");
        } else if(!senhaDB.equals(senhaUsuario)){
                throw new LoginInvalidoException("Senha invalida!");
            }
        System.out.println("Usuario logado com sucesso!");
    }
}
