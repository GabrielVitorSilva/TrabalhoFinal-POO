package com.mycompany.trabalhofinal.poo;

public class Funcionario extends Pessoa {
    private String idFuncionario;
    private String cargo;

    public Funcionario(String nome, String endereco, String telefone, String email, String cpf, String idFuncionario, String cargo) {
        super(nome, endereco, telefone, email, cpf);
        this.idFuncionario = idFuncionario;
        this.cargo = cargo;
    }

    public void registrarDespesa(String descricao, double valor) {
    }

    public void acessarAgenda() {
    }

    public void gerenciarCliente(Cliente cliente) {
    }

    @Override
    public void exibirDados() {
        System.out.println(super.toString() + "\nID Funcionario: " + idFuncionario + "\nCargo: " + cargo);
    }
}
