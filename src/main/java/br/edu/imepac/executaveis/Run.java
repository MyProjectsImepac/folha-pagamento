package br.edu.imepac.executaveis;

import br.edu.imepac.entidades.*;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Funcionario[] funcionarios = new Funcionario[5];
        int count = 0;

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Cadastrar Professor");
            System.out.println("2. Cadastrar Coordenador");
            System.out.println("3. Cadastrar Bibliotecario");
            System.out.println("4. Calcular Folha de Pagamento");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha

            if (opcao == 1) {
                if (count < funcionarios.length) {
                    Professor professor = new Professor();
                    System.out.print("Nome: ");
                    professor.setNome(scanner.nextLine());
                    System.out.print("CPF: ");
                    professor.setCpf(scanner.nextLine());
                    System.out.print("Quantidade de Aulas: ");
                    professor.setQuantidadeAulas(scanner.nextInt());
                    System.out.print("Valor Hora Aula: ");
                    professor.setValorHoraAula(scanner.nextDouble());
                    scanner.nextLine(); // Consumir a nova linha
                    funcionarios[count++] = professor;
                } else {
                    System.out.println("Limite de funcionários atingido.");
                }
            } else if (opcao == 2) {
                if (count < funcionarios.length) {
                    Coordenador coordenador = new Coordenador();
                    System.out.print("Nome: ");
                    coordenador.setNome(scanner.nextLine());
                    System.out.print("CPF: ");
                    coordenador.setCpf(scanner.nextLine());
                    System.out.print("Quantidade de Alunos: ");
                    coordenador.setQuantidadeAlunos(scanner.nextInt());
                    System.out.print("Mensalidade: ");
                    coordenador.setMensalidade(scanner.nextDouble());
                    scanner.nextLine(); // Consumir a nova linha
                    funcionarios[count++] = coordenador;
                } else {
                    System.out.println("Limite de funcionários atingido.");
                }
            } else if (opcao == 3) {
                if (count < funcionarios.length) {
                    Bibliotecario bibliotecario = new Bibliotecario();
                    System.out.print("Nome: ");
                    bibliotecario.setNome(scanner.nextLine());
                    System.out.print("CPF: ");
                    bibliotecario.setCpf(scanner.nextLine());
                    System.out.print("Salário: ");
                    bibliotecario.setSalario(scanner.nextDouble());
                    scanner.nextLine(); // Consumir a nova linha
                    funcionarios[count++] = bibliotecario;
                } else {
                    System.out.println("Limite de funcionários atingido.");
                }
            } else if (opcao == 4) {
                double folhaPagamento = 0;
                for (Funcionario f : funcionarios) {
                    if (f != null) {
                        folhaPagamento += f.getSalario();
                    }
                }
                System.out.println("Folha de pagamento: " + folhaPagamento);
            } else if (opcao == 5) {
                break;
            } else {
                System.out.println("Opção inválida.");
            }
        }

        scanner.close();
    }
}