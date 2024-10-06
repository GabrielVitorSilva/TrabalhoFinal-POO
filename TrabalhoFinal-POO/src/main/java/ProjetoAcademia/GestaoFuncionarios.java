package ProjetoAcademia;

import java.util.ArrayList;
import java.util.List;

public class GestaoFuncionarios {
    private List<Funcionario> funcionarios;

    public GestaoFuncionarios() {
        this.funcionarios = new ArrayList<>();
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
        System.out.println("Funcionário " + funcionario.getNome() + " adicionado com sucesso.");
    }

    public void removerFuncionario(String cpf) {
        funcionarios.removeIf(funcionario -> funcionario.getCPF().equals(cpf));
        System.out.println("Funcionário removido com sucesso.");
    }

    public void editarFuncionario(Funcionario funcionario) {
        for (Funcionario f : funcionarios) {
            if (f.getCPF().equals(funcionario.getCPF())) {
                f.setNome(funcionario.getNome());
                // outros atributos...
                System.out.println("Funcionário atualizado com sucesso.");
            }
        }
    }

    public Funcionario buscarFuncionario(String cpf) {
        return funcionarios.stream().filter(funcionario -> funcionario.getCPF().equals(cpf)).findFirst().orElse(null);
    }
}
