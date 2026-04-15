
package Application;
import util.Calculator;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.print("Digite o raio: ");
        double raio = sc.nextDouble();

        double c = calculator.circunferencia(raio);
        double v = calculator.volume(raio);

        System.out.println(c);
        System.out.println(v);
        System.out.println(calculator.PI);

        sc.close();
    }


}