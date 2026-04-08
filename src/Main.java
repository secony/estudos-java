import java.util.Scanner;

public class Main {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite 3 numeros: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int higher = max(a,b,c);
        System.out.println(higher);

    }

    public static int max (int x, int y, int z) {
        int aux = 0;

        if (x > y && y > z) {
            aux = x;
        }
        else if (x < y && z < y) {
            aux = y;
        }
        else if (z > x && y < z) {
            aux = z;
        }
        return aux;
    }
}