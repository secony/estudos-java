package application;

import entidade.Triangle;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        Triangle x,y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("Medidas triangulo X: ");
        x.a = input.nextDouble();
        x.b = input.nextDouble();
        x.c = input.nextDouble();

        System.out.println("Medidas triangulo Y: ");
        y.a = input.nextDouble();
        y.b = input.nextDouble();
        y.c = input.nextDouble();

        double p1 = (x.a + x.b + x.c) / 2;
        double area1 = Math.sqrt(p1 * (p1 - x.a) * (p1 - x.b) * (p1 - x.c));

        double p2 = (y.a + y.b + y.c) / 2;
        double area2 = Math.sqrt(p2 * (p2 - y.a) * (p2 - y.b) * (p2 - y.c));

        System.out.printf("Area 1: %.4f%n", area1);
        System.out.printf("Area 2: %.4f%n", area2);

    }
}
