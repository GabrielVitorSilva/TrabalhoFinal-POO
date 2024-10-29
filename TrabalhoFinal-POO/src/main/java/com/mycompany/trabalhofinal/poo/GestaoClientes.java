package com.mycompany.trabalhofinal.poo;

import java.util.ArrayList;
import java.util.List;

public class GestaoClientes {
    private static GestaoClientes instanciaUnica;
    private List<Cliente> clientes;

    // Construtor privado para impedir instâncias externas
    private GestaoClientes() {
        this.clientes = new ArrayList<>();
    }

    // Método para obter a única instância da classe
    public static synchronized GestaoClientes getInstancia() {
        if (instanciaUnica == null) {
            instanciaUnica = new GestaoClientes();
        }
        return instanciaUnica;
    }

    public void adicionarCliente(Cliente cliente) {
        clientes.add(cliente);
        System.out.println("Cliente " + cliente.getNome() + " adicionado com sucesso.");
    }

    public void removerCliente(String cpf) {
        clientes.removeIf(cliente -> cliente.getCPF().equals(cpf));
        System.out.println("Cliente removido com sucesso.");
    }

    public void editarCliente(Cliente cliente) {
        for (Cliente c : clientes) {
            if (c.getCPF().equals(cliente.getCPF())) {
                c.setNome(cliente.getNome());
                System.out.println("Cliente atualizado com sucesso.");
            }
        }
    }

    public Cliente buscarCliente(String cpf) {
        return clientes.stream().filter(cliente -> cliente.getCPF().equals(cpf)).findFirst().orElse(null);
    }
}
