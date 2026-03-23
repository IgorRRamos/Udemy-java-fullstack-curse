package validations;

public class Validacao {

    public void validacaoUsuario(String usuario){

        if (usuario.length() > 10) {
            throw new RuntimeException("Usuario muito longo!");
        }

        if(usuario.matches(".*[^a-zA-z0-9].*")){
            throw new RuntimeException("Não é permitido ter caracteres no nome de usuario.");
        }
    }

    public void validacaoSenha(String senha){

        if(!senha.matches(".*[A-Z].*")){
            throw new RuntimeException("Necessario letra maiuscula.");
        }

        if(!senha.matches(".*[^a-zA-z0-9].*")){
            throw new RuntimeException("Necessario ao menos 1 caracter");
        }

        if(senha.length() < 3  || senha.length() > 12){
            throw new RuntimeException("Tamanho minimo 3 maximo 12");
        }

        if(!senha.matches(".*[0-9].*")){
            throw new RuntimeException("Necessario numeros");
        }
    }

}
