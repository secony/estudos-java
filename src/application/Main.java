package application;

import entities.Conta;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        // recebendo os dados

        System.out.print("Titular: ");
        String titular = input.nextLine();

        System.out.print("Conta: ");
        int numero = input.nextInt();

        System.out.print("Saldo: ");
        double saldo = input.nextDouble();

        // construtor

        Conta conta1 = new Conta(titular, numero, saldo);

        System.out.println(" ");

        System.out.print("Depósito: ");
        double deposito = input.nextDouble();
        conta1.depositar(deposito);

        System.out.println(" ");

        System.out.print("Saque: ");
        double saque = input.nextDouble();
        conta1.sacar(saque);


        System.out.println(conta1);

    }
}