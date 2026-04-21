package application;

import entities.Dados;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double saldo = 0;

        System.out.print("Enter accont number: ");
        int accountN = input.nextInt();
        System.out.print("Enter name: ");
        String name = input.next();

        Dados dados = new Dados(accountN, name, saldo);

        System.out.println("Is there a initial deposit (y/n)");
        String answer = input.next();

        if (answer.equals("y")) {
            System.out.println("enter initial deposit: ");
            dados.setSaldo(input.nextDouble());
        } else if (answer.equals("n")) {
            dados.setSaldo(0);
        }

        System.out.println(dados);
        System.out.println();

        System.out.println("Enter a deposit amount: ");
        dados.setValorAdd(input.nextDouble());

    }

}