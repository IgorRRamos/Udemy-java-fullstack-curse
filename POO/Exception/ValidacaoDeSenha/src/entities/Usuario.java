package entities;

import validations.Validacao;

public class Usuario {
    private String nome;
    private String senha;
    Validacao validacao = new Validacao();

    public Usuario(String nome, String senha) {
        try{

            this.nome = nome;
            this.senha = senha;

            validacao.validacaoUsuario(nome);
            validacao.validacaoSenha(senha);



        }catch (RuntimeException e){
            e.printStackTrace();
        }
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
