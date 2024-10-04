package com.mycompany.trabalhofinal.poo;

public class Administrador extends Pessoa {
    private String senha;

    public Administrador(String nome, String endereco, String telefone, String email, String cpf, String senha) {
        super(nome, endereco, telefone, email, cpf);
        this.senha = senha;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public void exibirDados() {
        System.out.println(super.toString());
    }

    public void gerarBalancoMensal() {
    }
}
