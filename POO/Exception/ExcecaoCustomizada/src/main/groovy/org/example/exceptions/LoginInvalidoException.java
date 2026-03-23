package org.example.exceptions;

public class LoginInvalidoException extends Exception{
    public LoginInvalidoException() {
        System.out.println("Login invalido!");
    }

    public LoginInvalidoException(String message) {
        super(message);
    }


}
