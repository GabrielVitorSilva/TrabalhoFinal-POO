package com.mycompany.trabalhofinal.poo;

public class TrabalhoFinalPOO {

    public static void main(String[] args) {
        // Criando um cliente
        System.out.println("Cliente");
        Cliente cliente = new Cliente("João Silva", "Rua A", "99999-9999", "joao@exemplo.com", "123.456.789-00", "Mensal");
        cliente.realizarPagamento(100);
        cliente.atualizarDados("88888-8888", "Anual");
        cliente.confirmarReserva();
        cliente.cancelarReserva();
        System.out.println(cliente.verificarStatus());
        cliente.exibirDados();
        System.out.println("-------------------------------------------------------------------------");
     
        System.out.println("Funcionário");
        // Criando um funcionário
        Funcionario funcionario = new Funcionario("Maria Souza", "Rua B", "99988-7777", "maria@exemplo.com", "987.654.321-00", "F001", "Instrutora");
        funcionario.registrarDespesa("Compra de Equipamento", 1500.50);
        funcionario.acessarAgenda();
        funcionario.gerenciarCliente(cliente);
        funcionario.exibirDados();
        System.out.println("-------------------------------------------------------------------------");

        System.out.println("Administrador");
       
        Administrador admin = new Administrador("Carlos Pereira", "Rua C", "97777-6666", "carlos@exemplo.com", "111.222.333-44", "admin123");
        admin.gerarBalancoMensal();
        admin.exibirDados();
    }
}
