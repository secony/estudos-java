import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a senha: ");
        int senha = input.nextInt();
        input.nextLine();

        int senhaCorreta = 2002;

        while (senha != senhaCorreta) {

            System.out.println("Senha Inválida");
            System.out.print("Digite a senha: ");
            senha = input.nextInt();
        }

        System.out.println("Senha correta");
    }
}