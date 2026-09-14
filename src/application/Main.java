package application;
import util.Calculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.print("Digite o raio: ");
        double raio = sc.nextDouble();

        double c =  calculator.circunferencia(raio);
        double v = calculator.volume(raio);

        System.out.println("PI " + calculator.PI);
        System.out.println("Circunferencia: " + c);
        System.out.println("Volume: " + v);

        sc.close();
    }

}