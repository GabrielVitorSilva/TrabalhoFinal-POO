package com.mycompany.trabalhofinal.poo;

import java.util.Scanner;

public class TrabalhoFinalPOO {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Inicialização de variáveis
        Cliente cliente = null;
        Funcionario funcionario = null;
        Administrador admin = null;
        Produto produto = null;
        Despesa despesa = null;
        Venda venda = null;
        Agenda agenda = null;
        RelatorioFinanceiro relatorioFinanceiro = new RelatorioFinanceiro();

        // Cadastro inicial do administrador
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
        System.out.print("Cargo: ");
        String cargoAdmin = scanner.nextLine();
        System.out.print("ID: ");
        String idAdmin = scanner.nextLine();
        admin = new Administrador(nomeAdmin, enderecoAdmin, telefoneAdmin, emailAdmin, cpfAdmin, senhaAdmin, cargoAdmin, idAdmin);

        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\n=== Sistema de Gerenciamento da Academia ===");
            System.out.println("1. Menu de Cadastros");
            System.out.println("2. Menu de Agendamentos");
            System.out.println("3. Menu de Loja");
            System.out.println("4. Menu de Relatórios");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();  // Consumir a quebra de linha

            switch (opcao) {
                case 1: // Menu de Cadastros
                    menuCadastros(scanner, cliente, funcionario);
                    break;
                case 2: // Menu de Agendamentos
                    menuAgendamentos(scanner, cliente, agenda);
                    break;
                case 3: // Menu de Produtos
                    menuProdutos(scanner, funcionario, produto);
                    break;
                case 4: // Menu de Relatórios
                    menuRelatorios(scanner, admin, venda, relatorioFinanceiro);
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

    // Menu de Cadastros
    private static void menuCadastros(Scanner scanner, Cliente cliente, Funcionario funcionario) {
        int opcao = -1;
        while (opcao != 0) {
            System.out.println("\n=== Menu de Cadastros ===");
            System.out.println("1. Cadastrar Cliente");
            System.out.println("2. Cadastrar Funcionario");
            System.out.println("0. Voltar ao menu principal");
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
                case 0:
                    System.out.println("Voltando ao menu principal...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }

    // Menu de Agendamentos
    private static void menuAgendamentos(Scanner scanner, Cliente cliente, Agenda agenda) {
        int opcao = -1;
        while (opcao != 0) {
            System.out.println("\n=== Menu de Agendamentos ===");
            System.out.println("1. Realizar Agendamento");
            System.out.println("2. Cancelar Agendamento");
            System.out.println("0. Voltar ao menu principal");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();  // Consumir a quebra de linha

            switch (opcao) {
                case 1: // Realizar Agendamento
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
                case 2: // Cancelar Agendamento
                    if (cliente != null && agenda != null) {
                        double valorCancelamento = 100.0; // Valor de exemplo
                        String motivoCancelamento = "Cliente desistiu"; // Motivo de exemplo
                        cliente.cancelarReserva(agenda, valorCancelamento, motivoCancelamento);
                    } else {
                        System.out.println("Agendamento não encontrado ou cliente não cadastrado.");
                    }
                    break;
                case 0:
                    System.out.println("Voltando ao menu principal...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }

    // Menu de Produtos
    private static void menuProdutos(Scanner scanner, Funcionario funcionario, Produto produto) {
        int opcao = -1;
        while (opcao != 0) {
            System.out.println("\n=== Menu de Produtos ===");
            System.out.println("1. Verificar Estoque de Produto");
            System.out.println("2. Vender Produto");
            System.out.println("0. Voltar ao menu principal");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();  // Consumir a quebra de linha

            switch (opcao) {
                case 1: // Verificar Estoque de Produto
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
                case 2: // Vender Produto
                    if (produto != null) {
                        System.out.print("Quantidade a vender: ");
                        int quantidade = scanner.nextInt();
                        produto.venderProduto(quantidade);
                    } else {
                        System.out.println("Produto não cadastrado.");
                    }
                    break;
                case 0:
                    System.out.println("Voltando ao menu principal...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }

    // Menu de Relatórios
    private static void menuRelatorios(Scanner scanner, Administrador admin, Venda venda, RelatorioFinanceiro relatorioFinanceiro) {
        int opcao = -1;
        while (opcao != 0) {
            System.out.println("\n=== Menu de Relatórios ===");
            System.out.println("1. Gerar Balanço Mensal");
            System.out.println("2. Emitir Relatório de Venda");
            System.out.println("0. Voltar ao menu principal");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();  // Consumir a quebra de linha

            switch (opcao) {
                case 1: // Gerar Balanço Mensal
                    if (admin != null) {
                        admin.gerarBalancoMensal(relatorioFinanceiro);
                    } else {
                        System.out.println("Administrador não encontrado.");
                    }
                    break;
                case 2: // Emitir Relatório de Venda
                    if (admin != null) {
                        System.out.println("=== Emitir Relatório de Venda ===");
                        System.out.print("Descrição da Venda: ");
                        String descricaoVenda = scanner.nextLine();
                        System.out.print("Valor da Venda: ");
                        double valorVenda = scanner.nextDouble();
                        scanner.nextLine();  // Consumir quebra de linha
                        venda = new Venda(descricaoVenda, valorVenda);
                        System.out.print("Período do relatório: ");
                        String periodo = scanner.nextLine();
                        admin.emitirRelatorioVenda(venda, periodo);
                    } else {
                        System.out.println("Administrador não encontrado.");
                    }
                    break;
                case 0:
                    System.out.println("Voltando ao menu principal...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }
}
