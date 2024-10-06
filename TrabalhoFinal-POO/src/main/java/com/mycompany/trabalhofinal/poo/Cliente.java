package com.mycompany.trabalhofinal.poo;

public class Cliente extends Pessoa {

    private String plano;
    private double saldoDevedor;

    public Cliente(String nome, String endereco, String telefone, String email, String cpf, String plano) {
        super(nome, endereco, telefone, email, cpf);
        this.plano = plano;
        this.saldoDevedor = 0;
    }

    public void realizarAgendamento(Agenda agenda) {
        agenda.realizarAgendamento();
    }

    public void cancelarReserva(Agenda agenda, double valorAgendamento, String dataAula) {
        agenda.cancelarAgendamento(valorAgendamento, dataAula);
    }

    public void realizarPagamento(double valor) {
        this.saldoDevedor -= valor;
    }

    @Override
    public void exibirDados() {
        System.out.println(super.toString() + "\nPlano: " + plano + "\nSaldo Devedor: " + saldoDevedor);
    }
}
