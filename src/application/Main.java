import CurrencyConverter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Valor do dollar: ");
        double dollarPrice = sc.nextDouble();

        System.out.println("Quantos dollar vai comprar: ");
        double dollarTotal = sc.nextDouble();

        double reais = CurrencyConverter.converter(dollarPrice, dollarTotal);

        System.out.println("Quantos reais: " + reais);
    }
}