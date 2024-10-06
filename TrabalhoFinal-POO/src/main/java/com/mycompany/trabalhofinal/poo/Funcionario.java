package com.mycompany.trabalhofinal.poo;

public class Funcionario extends Pessoa {

    private String idFuncionario;
    private String cargo;

    public Funcionario(String nome, String endereco, String telefone, String email, String cpf, String idFuncionario, String cargo) {
        super(nome, endereco, telefone, email, cpf);
        this.idFuncionario = idFuncionario;
        this.cargo = cargo;
    }

    public void verificarEstoqueProduto(Produto produto) {
        if (produto.verificarEstoque()) {
            System.out.println("Produto disponível em estoque.");
        } else {
            System.out.println("Produto indisponível.");
        }
    }

    public void gerenciarCliente(Cliente cliente) {
        System.out.println("Gerenciando cliente: " + cliente.getNome());
    }

    public void cancelarAgendamento(Agenda agenda, double valorAgendamento, String dataAula) {
        agenda.cancelarAgendamento(valorAgendamento, dataAula);
        System.out.println("50% do valor do agendamento foi retido.");
    }

    public void registrarDespesaCliente(Despesa despesa) {
        despesa.registrarDespesa();
    }

    public void gerenciarDespesasAcademia(Despesa despesa) {
        despesa.registrarDespesa();
    }

    @Override
    public void exibirDados() {
        System.out.println(super.toString() + "\nID Funcionario: " + idFuncionario + "\nCargo: " + cargo);
    }
}
