package application;
import util.Calculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o raio: ");
        double raio = sc.nextDouble();

        double c =  Calculator.circunferencia(raio);
        double v = Calculator.volume(raio);

        System.out.println("PI " + Calculator.PI);
        System.out.println("Circunferencia: " + c);
        System.out.println("Volume: " + v);

        sc.close();
    }

}