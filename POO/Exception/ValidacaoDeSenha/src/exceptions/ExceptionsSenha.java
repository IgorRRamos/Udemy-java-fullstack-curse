package exceptions;

public class ExceptionsSenha extends Exception{
    public ExceptionsSenha() {
        System.out.println("Usuario ou senha invalido!");
    }

    public ExceptionsSenha(String message) {
        super(message);
    }
}
