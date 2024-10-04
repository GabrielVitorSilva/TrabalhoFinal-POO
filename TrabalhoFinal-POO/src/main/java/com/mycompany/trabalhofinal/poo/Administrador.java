package com.mycompany.trabalhofinal.poo;

public class Administrador extends Pessoa {
    private String senha;

    public Administrador(String nome, String endereco, String telefone, String email, String cpf, String senha) {
        super(nome, endereco, telefone, email, cpf);
        this.senha = senha;
    }

    public void alterarSenha(String novaSenha) {
        this.senha = novaSenha;
        System.out.println("Senha do administrador alterada com sucesso.");
    }

    public void gerarBalancoMensal() {
        System.out.println("Gerando balanço mensal com estatísticas básicas.");
    }

    public void emitirRelatorioVenda(Venda venda) {
        venda.emitirRelatorioVenda();
    }

    public void gerenciarUsuarios() {
        System.out.println("Gerenciando usuários da academia.");
    }

    @Override
    public void exibirDados() {
        System.out.println(super.toString());
    }
}
