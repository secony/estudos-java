package application;

import entities.Livro;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        ArrayList<Livro> livrosLista = new ArrayList<>();

        int senhaAdiministrador = 2805;

        int opcao = -1;
        while (opcao != 0) {
            System.out.println("\n===== BIBLIOTECA =====");
            System.out.println("[1] - Cadastrar livro");
            System.out.println("[2] - Listar livros");
            System.out.println("[3] - Buscar livro");
            System.out.println("[4} - Pegar emprestado um livro");
            System.out.println("[5] - Devolver livro");
            System.out.println("[6] - Administrador! ");
            System.out.println("[0] - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = input.nextInt();
            input.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do livro: ");
                    String nome = input.nextLine();
                    System.out.println("Digite o autor do livro: ");
                    String autor = input.nextLine();
                    System.out.println("Digite o ano de pubicação do livro: ");
                    int anoPubicaao = input.nextInt();
                    Livro livro = new Livro(nome, autor, anoPubicaao, true);
                    livrosLista.add(livro);

                    System.out.println("Livro cadastrado com sucesso!");

                    break;

                case 2:
                    for (int i = 0; i < livrosLista.size(); i++) {
                        System.out.println(livrosLista.get(i));
                    }
                    break;


                case 3:
                    boolean encontrado = false;
                    System.out.println("[1] - Título ");
                    System.out.println("[2] - Autor ");
                    System.out.println("[3] - Ano de publicaçao ");
                    System.out.println("Digite o tipo de busca: ");
                    int tipoBusca = input.nextInt();
                    input.nextLine();

                    switch (tipoBusca) {
                        case 1:
                            System.out.println("Digite o nome do livro:");
                            String nomeBuscado = input.nextLine();
                            for (int i = 0; i < livrosLista.size(); i++) {
                                if (livrosLista.get(i).getTitulo().equalsIgnoreCase(nomeBuscado)) {
                                    System.out.println(livrosLista.get(i));
                                    encontrado = true;
                                }
                            }
                            if (!encontrado) {
                                System.out.println("Nao encontrado");
                            }
                            break;

                        case 2:
                            System.out.println("Digite o nome do autor do livro:");
                            String autorBuscado = input.nextLine(); // Ajustado o nome para evitar conflito caso declare no mesmo escopo
                            for (int i = 0; i < livrosLista.size(); i++) {
                                if (livrosLista.get(i).getAutor().equalsIgnoreCase(autorBuscado)) {
                                    System.out.println(livrosLista.get(i));
                                    encontrado = true;
                                }
                            }
                            if (!encontrado) {
                                System.out.println("Nao encontrado");
                            }
                            break;

                        case 3:
                            System.out.println("Digite a data do livro:");
                            int data = input.nextInt();
                            input.nextLine();
                            for (int i = 0; i < livrosLista.size(); i++) {
                                if (livrosLista.get(i).getAnoPublicacao() == data) {
                                    System.out.println(livrosLista.get(i));
                                    encontrado = true;
                                }
                            }
                            if (!encontrado) {
                                System.out.println("Nao encontrado");
                            }
                            break;

                        default:
                            System.out.println("Opcao invalida!");
                            break;


                    }

                    break;

                case 4:
                    boolean encontrado2 = false;
                    System.out.println("Digite o nome do livro: ");
                    String nomeBuscadoEmprestimo = input.nextLine();

                    for (int i = 0; i < livrosLista.size(); i++) {

                        if (livrosLista.get(i).getTitulo().equalsIgnoreCase(nomeBuscadoEmprestimo)) {

                            encontrado2 = true;

                            if (livrosLista.get(i).isDisponivel()) {
                                livrosLista.get(i).emprestimo();
                                System.out.println("Emprestado com sucesso!");

                            } else {
                                System.out.println("Já emprestado!");
                            }
                            break;
                        }
                    }
                    if (!encontrado2) {
                        System.out.println("Nao encontrado");
                    }
                    break;


                case 5:
                    boolean encontrado3 = false;

                    System.out.println("Digite o nome do livro: ");
                    String nomeDevolucao = input.nextLine();

                    for (int i = 0; i < livrosLista.size(); i++) {

                        if (livrosLista.get(i).getTitulo().equalsIgnoreCase(nomeDevolucao)) {

                            encontrado3 = true;

                            if (livrosLista.get(i).isDevolver()) {
                                livrosLista.get(i).devolver();
                                System.out.println("Devolvido com sucesso!");
                            } else {
                                System.out.println("Ja devolvido!");
                            }
                            break;
                        }
                    }
                    if (!encontrado3) {
                        System.out.println("Nao encontrado");
                    }

                    break;

                case 6:
                    for (int i = 1; i < 4; i++) {

                        System.out.println("Digite a senha: ");
                        int senhaDigitada = input.nextInt();

                        if (senhaDigitada == senhaAdiministrador) {
                            System.out.println("===== ADMINISTRADOR =====");
                            System.out.println("[1] - Alterar dados de um livro");
                            System.out.println("[2] - Excluir livro");
                            System.out.println("[0] - Voltar ao menu principal");
                            System.out.println("Digite o que deseja alterar: ");
                            int alteracao = input.nextInt();

                            switch (alteracao) {
                                case 1:
                                    System.out.println("[1] - Alterar Título");
                                    System.out.println("[2] - Alterar Autor ");
                                    System.out.println("[3] - Alterar Ano ");
                                    System.out.println("[0] - Voltar ao menu principal");
                                    System.out.println("Digite o que deseja alterar: ");
                                    int alteracao2 = input.nextInt();
                                    input.nextLine();
                                    switch (alteracao2) {
                                        case 1:
                                            System.out.println("Digite o nome atual do livro: ");
                                            String nomeParaAlterar = input.nextLine();

                                            boolean encontrado4 = false;

                                            for (int p = 0; p < livrosLista.size(); p++) {

                                                if (livrosLista.get(p).getTitulo().equalsIgnoreCase(nomeParaAlterar)) {

                                                    encontrado4 = true;

                                                    System.out.println("Digite o novo titulo do livro: ");
                                                    String novoTitulo = input.nextLine();

                                                    livrosLista.get(p).setTitulo(novoTitulo);
                                                    System.out.println("Titulo alterado com sucesso!");

                                                    break;
                                                }
                                            }

                                            if (!encontrado4) {
                                                System.out.println("Livro nao encontrado!");
                                            }
                                            break;


                                        case 2:
                                            System.out.println("Digite o autor atual do livro: ");
                                            String autorParaAlterar = input.nextLine();

                                            boolean encontrado5 = false;

                                            for (int p = 0; p < livrosLista.size(); p++) {

                                                if (livrosLista.get(p).getAutor().equalsIgnoreCase(autorParaAlterar)) {

                                                    encontrado5 = true;

                                                    System.out.println("Digite o novo autor do livro: ");
                                                    String novoAutor = input.nextLine();

                                                    livrosLista.get(p).setAutor(novoAutor);
                                                    System.out.println("Autor alterado com sucesso!");

                                                    break;
                                                }
                                            }

                                            if (!encontrado5) {
                                                System.out.println("Autor nao encontrado!");
                                            }
                                            break;

                                        case 3:
                                            System.out.println("Digite o ano atual do livro: ");
                                            int anoParaAlterar = input.nextInt();
                                            input.nextLine();

                                            boolean encontrado6 = false;

                                            for (int p = 0; p < livrosLista.size(); p++) {

                                                if (livrosLista.get(p).getAnoPublicacao() == anoParaAlterar) {

                                                    encontrado6 = true;

                                                    System.out.println("Digite o novo ano do livro: ");
                                                    int novoAno = input.nextInt();

                                                    livrosLista.get(p).setAnoPublicacao(novoAno);
                                                    System.out.println("Ano alterado com sucesso!");

                                                    break;
                                                }
                                            }

                                            if (!encontrado6) {
                                                System.out.println("ano nao encontrado!");
                                            }

                                            break;

                                        default:
                                            break;

                                    }


                            }
                            break;


                        } else {
                            System.out.println("Senha errada! Mais " + (3 - i) + " tentativas");
                        }
                    }

                    break;

                case 0:
                    return;
            }


        }

    }
}