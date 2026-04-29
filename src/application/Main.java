
package application;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a quantidade: ");
        int quantidade = input.nextInt();

        int[] lista = new int[quantidade];

        for (int i = 0; i < quantidade; i++) {
            System.out.print("digite o numero: ");
            lista[i] = input.nextInt();
        }

        double soma = 0;
        for (int i = 0; i < quantidade; i++) {
            soma = soma + lista[i];

        }
        double media =  soma / quantidade;

        System.out.println("Média: " + media);

    }
}