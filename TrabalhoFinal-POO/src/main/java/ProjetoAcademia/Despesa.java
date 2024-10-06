package ProjetoAcademia;

public class Despesa {
    private String descricao;
    private double valor;

    public Despesa(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    public void registrarDespesa() {
        System.out.println("Despesa registrada: " + descricao + " - Valor: R$ " + valor);
    }
}
