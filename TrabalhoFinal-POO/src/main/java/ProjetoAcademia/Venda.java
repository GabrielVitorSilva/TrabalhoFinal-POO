package ProjetoAcademia;

public class Venda {
    private String descricao;
    private double valor;

    public Venda(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    public void emitirRelatorioVenda(String periodo) {
        System.out.println("Relatório de vendas para o período: " + periodo);
        System.out.println("Venda: " + descricao + " - Valor: R$ " + valor);
    }
}
