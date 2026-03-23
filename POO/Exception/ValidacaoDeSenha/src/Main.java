import entities.Usuario;
import exceptions.ExceptionsSenha;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nomeTeclado, senhaTeclado;

        Usuario user1 = new Usuario("Igor", "!!Igor!!123");
        Usuario user2 = new Usuario("Rafaela", "@@@Rafa123");
        Usuario user3 = new Usuario("Nubia", "!!Nubia123");

        try {
            login(user2);

        } catch (ExceptionsSenha e) {
            e.printStackTrace();
        }

    }

    public static void login(Usuario usuario) throws ExceptionsSenha {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o usuario: ");
        String usuarioLogin = teclado.nextLine();

        System.out.print("Digite a senha: ");
        String senhaLogin = teclado.nextLine();

        if (!usuario.getNome().equals(usuarioLogin)) {
            throw new ExceptionsSenha("Usuario invalido!");
        }
        if (!usuario.getSenha().equals(senhaLogin)) {
            throw new ExceptionsSenha("Senha invalida!");
        }
        System.out.println("Login realizado com sucesso!!!!");
    }
}
