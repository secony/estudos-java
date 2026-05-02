
package application;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double sum = 0;

        System.out.print("quantos numeros vai digitar? (até 10): ");
        int numDigitado = input.nextInt();

        int[] lista = new int[numDigitado];

        for (int i = 0; i < numDigitado; i++ ) {
            System.out.println("Digite um numero: ");
            lista[i] = input.nextInt();
        }

        for (int i = 0; i < numDigitado; i++) {
            sum += lista[i];

        }

        double media = sum / numDigitado;

        System.out.println("soma: " + sum+ " media: " + media);
    }
}