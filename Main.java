package com.sgp.app;

import java.util.ArrayList;
import java.util.Scanner;

import com.sgp.modelos.Novela;

public class Main {

    private static ArrayList<Novela> novelas = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean executando = true;

        while (executando) {
            exibirMenu();
            int opcao = Integer.parseInt(scanner.nextLine());

            switch (opcao) {
                case 1 -> cadastrarNovela();
                case 2 -> listarNovelas();
                case 3 -> exibirResumo();
                case 4 -> alterarCapitulos();
                case 0 -> executando = false;
                default -> System.out.println("Opção inválida!");
            }
        }

        scanner.close();
        System.out.println("Sistema encerrado.");
    }

    private static void exibirMenu() {
        System.out.println("\n=== SISTEMA DE NOVELAS ===");
        System.out.println("1 - Cadastrar nova novela");
        System.out.println("2 - Listar novelas");
        System.out.println("3 - Exibir resumo de uma novela");
        System.out.println("4 - Alterar número de capítulos");
        System.out.println("0 - Sair");
        System.out.print("Escolha uma opção: ");
    }

    private static void cadastrarNovela() {
        System.out.println("\n=== CADASTRAR NOVELA ===");

        System.out.print("Título: ");
        String titulo = scanner.nextLine();

        System.out.print("Autor: ");
        String autor = scanner.nextLine();

        System.out.print("Número de capítulos: ");
        int numeroCapitulos = Integer.parseInt(scanner.nextLine());

        Novela novaNovela = new Novela(titulo, autor, numeroCapitulos);
        novelas.add(novaNovela);

        System.out.println("Novela cadastrada com sucesso!");
    }

    private static void listarNovelas() {
        System.out.println("\n=== LISTA DE NOVELAS ===");

        if (novelas.isEmpty()) {
            System.out.println("Nenhuma novela cadastrada.");
            return;
        }

        for (int i = 0; i < novelas.size(); i++) {
            System.out.println((i + 1) + " - " + novelas.get(i));
        }
    }

    private static void exibirResumo() {
        System.out.println("\n=== EXIBIR RESUMO ===");

        Novela novela = buscarNovela();
        if (novela != null) {
            novela.exibirResumo();
        }
    }

    private static void alterarCapitulos() {
        System.out.println("\n=== ALTERAR CAPÍTULOS ===");

        Novela novela = buscarNovela();
        if (novela != null) {
            System.out.print("Novo número de capítulos: ");
            int novoNumero = Integer.parseInt(scanner.nextLine());
            novela.setNumeroCapitulos(novoNumero);
            System.out.println("Número de capítulos atualizado com sucesso!");
        }
    }

    private static Novela buscarNovela() {
        if (novelas.isEmpty()) {
            System.out.println("Nenhuma novela cadastrada.");
            return null;
        }

        listarNovelas();
        System.out.print("Escolha o número da novela: ");
        int indice = Integer.parseInt(scanner.nextLine()) - 1;

        if (indice >= 0 && indice < novelas.size()) {
            return novelas.get(indice);
        }

        System.out.println("Novela não encontrada.");
        return null;
    }
}