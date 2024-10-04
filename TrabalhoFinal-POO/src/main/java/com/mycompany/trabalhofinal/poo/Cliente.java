package com.mycompany.trabalhofinal.poo;

public class Cliente extends Pessoa {
    private String plano;
    private double saldoDevedor;

    public Cliente(String nome, String endereco, String telefone, String email, String cpf, String plano) {
        super(nome, endereco, telefone, email, cpf);
        this.plano = plano;
        this.saldoDevedor = 0;
    }

    public void realizarPagamento(double valor) {
        this.saldoDevedor -= valor;
    }

    public void atualizarDados(String telefone, String plano) {
        super.setNome(telefone);
        this.plano = plano;
    }

    public String verificarStatus() {
        return this.saldoDevedor > 0 ? "Devedor" : "Regularizado";
    }

    public boolean confirmarReserva() {
        return true;
    }

    public void cancelarReserva() {
    }

    @Override
    public void exibirDados() {
        System.out.println(super.toString() + "\nPlano: " + plano + "\nSaldo Devedor: " + saldoDevedor);
    }
}
