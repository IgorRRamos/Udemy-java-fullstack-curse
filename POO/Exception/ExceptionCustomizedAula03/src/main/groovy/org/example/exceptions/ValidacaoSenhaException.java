package org.example.exceptions;

public class ValidacaoSenhaException extends RuntimeException{
    public ValidacaoSenhaException() {
        super("Senha invalida");
    }

    public ValidacaoSenhaException(String message) {
        super(message);
    }
}
