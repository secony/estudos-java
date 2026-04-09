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

        double area1 = x.area();

        double area2 = y.area();

        System.out.printf("Area 1: %.4f%n", area1);
        System.out.printf("Area 2: %.4f%n", area2);

    }
}
