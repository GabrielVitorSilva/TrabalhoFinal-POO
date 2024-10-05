package com.mycompany.trabalhofinal.poo;

import java.util.Scanner;

public class TrabalhoFinalPOO {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Variáveis para armazenar dados dos objetos
        Cliente cliente = null;
        Funcionario funcionario = null;
        Administrador admin = null;
        Produto produto = null;
        Despesa despesa = null;
        Venda venda = null;
        Agenda agenda = null;

        // Cadastro inicial
        System.out.println("=== Cadastro do Administrador ===");
        System.out.print("Nome: ");
        String nomeAdmin = scanner.nextLine();
        System.out.print("Endereço: ");
        String enderecoAdmin = scanner.nextLine();
        System.out.print("Telefone: ");
        String telefoneAdmin = scanner.nextLine();
        System.out.print("Email: ");
        String emailAdmin = scanner.nextLine();
        System.out.print("CPF: ");
        String cpfAdmin = scanner.nextLine();
        System.out.print("Senha: ");
        String senhaAdmin = scanner.nextLine();
        System.out.print("cargo: ");
        String cargoAdmin = scanner.nextLine();
        System.out.print("Id: ");
        String idAdmin = scanner.nextLine();
        admin = new Administrador(nomeAdmin, enderecoAdmin, telefoneAdmin, emailAdmin, cpfAdmin, senhaAdmin, cargoAdmin, idAdmin);

        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\n=== Sistema de Gerenciamento da Academia ===");
            System.out.println("1. Cadastrar Cliente");
            System.out.println("2. Cadastrar Funcionario");
            System.out.println("3. Realizar Agendamento (Cliente)");
            System.out.println("4. Cancelar Agendamento (Cliente)");
            System.out.println("5. Verificar Estoque de Produto (Funcionario)");
            System.out.println("6. Vender Produto (Funcionario)");
            System.out.println("7. Registrar Despesa (Funcionario)");
            System.out.println("8. Gerar Balanço Mensal (Administrador)");
            System.out.println("9. Emitir Relatório de Venda (Administrador)");
            System.out.println("10. Alterar Senha do Administrador");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();  // Consumir a quebra de linha

            switch (opcao) {
                case 1: // Cadastrar Cliente
                    System.out.println("=== Cadastro de Cliente ===");
                    System.out.print("Nome: ");
                    String nomeCliente = scanner.nextLine();
                    System.out.print("Endereço: ");
                    String enderecoCliente = scanner.nextLine();
                    System.out.print("Telefone: ");
                    String telefoneCliente = scanner.nextLine();
                    System.out.print("Email: ");
                    String emailCliente = scanner.nextLine();
                    System.out.print("CPF: ");
                    String cpfCliente = scanner.nextLine();
                    System.out.print("Plano (Mensal/Anual): ");
                    String planoCliente = scanner.nextLine();
                    cliente = new Cliente(nomeCliente, enderecoCliente, telefoneCliente, emailCliente, cpfCliente, planoCliente);
                    break;
                case 2: // Cadastrar Funcionario
                    System.out.println("=== Cadastro de Funcionario ===");
                    System.out.print("Nome: ");
                    String nomeFuncionario = scanner.nextLine();
                    System.out.print("Endereço: ");
                    String enderecoFuncionario = scanner.nextLine();
                    System.out.print("Telefone: ");
                    String telefoneFuncionario = scanner.nextLine();
                    System.out.print("Email: ");
                    String emailFuncionario = scanner.nextLine();
                    System.out.print("CPF: ");
                    String cpfFuncionario = scanner.nextLine();
                    System.out.print("ID Funcionario: ");
                    String idFuncionario = scanner.nextLine();
                    System.out.print("Cargo: ");
                    String cargoFuncionario = scanner.nextLine();
                    funcionario = new Funcionario(nomeFuncionario, enderecoFuncionario, telefoneFuncionario, emailFuncionario, cpfFuncionario, idFuncionario, cargoFuncionario);
                    break;
                case 3: // Realizar Agendamento
                    if (cliente != null) {
                        System.out.println("=== Realizar Agendamento ===");
                        System.out.print("Data (DD/MM/AAAA): ");
                        String dataAgenda = scanner.nextLine();
                        agenda = new Agenda(dataAgenda, true);
                        cliente.realizarAgendamento(agenda);
                    } else {
                        System.out.println("Por favor, cadastre um cliente primeiro.");
                    }
                    break;
                case 4: // Cancelar Agendamento
                    if (cliente != null && agenda != null) {
                        cliente.cancelarReserva(agenda);
                    } else {
                        System.out.println("Agendamento não encontrado ou cliente não cadastrado.");
                    }
                    break;
                case 5: // Verificar Estoque de Produto
                    if (funcionario != null) {
                        System.out.println("=== Verificar Estoque de Produto ===");
                        System.out.print("Nome do Produto: ");
                        String nomeProduto = scanner.nextLine();
                        System.out.print("Quantidade em Estoque: ");
                        int quantidadeEstoque = scanner.nextInt();
                        scanner.nextLine();  // Consumir quebra de linha
                        produto = new Produto(nomeProduto, quantidadeEstoque);
                        funcionario.verificarEstoqueProduto(produto);
                    } else {
                        System.out.println("Por favor, cadastre um funcionário primeiro.");
                    }
                    break;
                case 6: // Vender Produto
                    if (produto != null) {
                        System.out.print("Quantidade a vender: ");
                        int quantidade = scanner.nextInt();
                        produto.venderProduto(quantidade);
                    } else {
                        System.out.println("Produto não cadastrado.");
                    }
                    break;
                case 7: // Registrar Despesa
                    if (funcionario != null) {
                        System.out.println("=== Registrar Despesa ===");
                        System.out.print("Descrição: ");
                        String descricaoDespesa = scanner.nextLine();
                        System.out.print("Valor: ");
                        double valorDespesa = scanner.nextDouble();
                        scanner.nextLine();  // Consumir quebra de linha
                        despesa = new Despesa(descricaoDespesa, valorDespesa);
                        funcionario.registrarDespesaCliente(despesa);
                    } else {
                        System.out.println("Por favor, cadastre um funcionário primeiro.");
                    }
                    break;
                case 8: // Gerar Balanço Mensal
                    if (admin != null) {
                        admin.gerarBalancoMensal();
                    } else {
                        System.out.println("Administrador não encontrado.");
                    }
                    break;
                case 9: // Emitir Relatório de Venda
                    if (admin != null) {
                        System.out.println("=== Emitir Relatório de Venda ===");
                        System.out.print("Descrição da Venda: ");
                        String descricaoVenda = scanner.nextLine();
                        System.out.print("Valor da Venda: ");
                        double valorVenda = scanner.nextDouble();
                        scanner.nextLine();  // Consumir quebra de linha
                        venda = new Venda(descricaoVenda, valorVenda);
                        admin.emitirRelatorioVenda(venda);
                    } else {
                        System.out.println("Administrador não encontrado.");
                    }
                    break;
                case 10: // Alterar Senha do Administrador
                    if (admin != null) {
                        System.out.print("Digite a nova senha: ");
                        String novaSenha = scanner.nextLine();
                        admin.alterarSenha(novaSenha);
                    } else {
                        System.out.println("Administrador não encontrado.");
                    }
                    break;
                case 0:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
        
        scanner.close();
    }
}
