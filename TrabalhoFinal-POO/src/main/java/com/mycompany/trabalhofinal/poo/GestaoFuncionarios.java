package com.mycompany.trabalhofinal.poo;

import java.util.ArrayList;
import java.util.List;

public class GestaoFuncionarios {
    private static GestaoFuncionarios instanciaUnica;
    private List<Funcionario> funcionarios;

    // Construtor privado para impedir instâncias externas
    private GestaoFuncionarios() {
        this.funcionarios = new ArrayList<>();
    }

    // Método para obter a única instância da classe
    public static synchronized GestaoFuncionarios getInstancia() {
        if (instanciaUnica == null) {
            instanciaUnica = new GestaoFuncionarios();
        }
        return instanciaUnica;
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
                System.out.println("Funcionário atualizado com sucesso.");
            }
        }
    }

    public Funcionario buscarFuncionario(String cpf) {
        return funcionarios.stream().filter(funcionario -> funcionario.getCPF().equals(cpf)).findFirst().orElse(null);
    }
}
