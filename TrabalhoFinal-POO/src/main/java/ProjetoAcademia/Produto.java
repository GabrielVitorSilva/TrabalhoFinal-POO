package ProjetoAcademia;

public class Produto {
    private String nome;
    private int quantidadeEmEstoque;

    public Produto(String nome, int quantidadeEmEstoque) {
        this.nome = nome;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public boolean verificarEstoque() {
        return quantidadeEmEstoque > 0;
    }

    public void venderProduto(int quantidade) {
        if (quantidade <= quantidadeEmEstoque) {
            quantidadeEmEstoque -= quantidade;
            System.out.println(quantidade + " " + nome + "(s) vendido(s).");
        } else {
            System.out.println("Estoque insuficiente.");
        }
    }

    public void reporEstoque(int quantidade) {
        quantidadeEmEstoque += quantidade;
        System.out.println(quantidade + " " + nome + "(s) reposto(s) no estoque.");
    }
}
