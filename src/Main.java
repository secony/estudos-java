import java.util.Scanner;

public class Main {

    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o X: ");
        int x = input.nextInt();
        System.out.print("Digite o Y: ");
        int y = input.nextInt();

        while (x != 0 && y != 0) {


            if (x > 0 && y > 0) {
                System.out.println("primeiro");
            }
            else if (x > 0 && y < 0) {
                System.out.println("quarto");
            }
            else if (x < 0 && y < 0) {
                System.out.println("terceiro");
            }
            else {
                System.out.println("segundo");
            }

                System.out.print("Digite o X: ");
                x = input.nextInt();
                System.out.print("Digite o Y: ");
                y = input.nextInt();

        }
