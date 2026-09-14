package application;
import java.util.Scanner;

public class Main {

    public static final double PI = 3.14;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o raio: ");
        double raio = sc.nextDouble();

        double c =  circunferencia(raio);
        double v = volume(raio);

        System.out.println("PI " + PI);
        System.out.println("Circunferencia: " + c);
        System.out.println("Volume: " + v);

        sc.close();
    }
    public static double circunferencia(double raio){
        return (2 * PI * raio);
    }
    public static double volume(double raio){
        return (4* PI * raio *  raio * raio) /3;
    }
}