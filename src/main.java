
import java.util.Scanner;
public class main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a quantidade de alunos: ");
        int n = input.nextInt();

        String [] nomes = new String[n];
        int [] idades = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Digite o nome do aluno: ");
            nomes[i] = input.next();

            System.out.println("Digite a idade do aluno: ");
            idades[i] = input.nextInt();

        }

        for  (int i = 0; i < n; i++) {
            System.out.println(nomes[i] + " " + idades[i]);
        }

    }
}
