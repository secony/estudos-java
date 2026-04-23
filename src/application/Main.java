package application;

import entities.Dados;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int senha = 2805;
        double saldo = 0;

        System.out.println("--------WELLCOME---------");

        //ADIQUIRINDO DADOS DO USUARIO

        System.out.print("Enter accont number: ");
        int accountN = input.nextInt();

        if  (accountN != senha) {
            System.out.println("SENHA INCORRETA!");
            return;
        }
        System.out.print("Enter name: ");
        String name = input.next();

        Dados dados = new Dados(accountN, name, saldo);

        System.out.print("Is there a initial deposit (y/n): ");
        String answer = input.next();

        // VERIFICANDO SE QUER FAZER DEPOSITO, SE SIM INSIRA A QUANTIDADE
        if (answer.equals("y")) {
            System.out.print("enter initial deposit: R$");
            dados.setSaldo(input.nextDouble());
        } else if (answer.equals("n")) {
            dados.setSaldo(0);
        }

        System.out.println(dados);
        System.out.println();

        // DEPOSITO
        System.out.print("Enter a deposit amount: R$");
        double depositAmount = input.nextDouble();
        dados.deposit(depositAmount);

        System.out.println(dados);

        System.out.println();

        // SAQUE, COM R$ 5,00 DE TAXA
        System.out.print("Enter a withdraw amount: R$");
        double withdrawAmount = input.nextDouble();
        dados.withdraw(withdrawAmount);

        System.out.println(dados);


    }

}