package com.mycompany.trabalhofinal.poo;

public class Venda {
    private String descricao;
    private double valor;

    public Venda(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    public void emitirRelatorioVenda() {
        System.out.println("Venda: " + descricao + " - Valor: R$ " + valor);
    }
}
