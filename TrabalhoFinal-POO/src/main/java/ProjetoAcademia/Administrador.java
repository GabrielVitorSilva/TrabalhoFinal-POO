package ProjetoAcademia;

public class Administrador extends Funcionario {
    private String senha;

    public Administrador(String nome, String endereco, String telefone, String email, String cpf, String senha, String cargo, String idFuncionario) {
        super(nome, endereco, telefone, email, cpf, idFuncionario, cargo);
        this.senha = senha;
    }

    public void alterarSenha(String novaSenha) {
        this.senha = novaSenha;
        System.out.println("Senha do administrador alterada com sucesso.");
    }

    public void gerarBalancoMensal(RelatorioFinanceiro relatorioFinanceiro) {
        relatorioFinanceiro.gerarRelatorio();
    }

    public void emitirRelatorioVenda(Venda venda, String periodo) {
        venda.emitirRelatorioVenda(periodo);
    }

    public void gerenciarUsuarios() {
        System.out.println("Gerenciando usuários da academia.");
    }

    @Override
    public void exibirDados() {
        System.out.println(super.toString());
    }
}
