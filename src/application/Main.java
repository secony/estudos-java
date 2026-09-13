package application;
import java.util.Scanner;
import entities.Funcionario;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Funcionario funcionario = new Funcionario();

        System.out.print("Digite o nome do funcionario: ");
        funcionario.nome = input.nextLine();
        System.out.println();

        System.out.print("Salario bruto do Funcionario: ");
        funcionario.salarioBruto = input.nextDouble();
        System.out.println();

        System.out.print("Taxa do Funcionario: ");
        funcionario.taxa = input.nextDouble();
        System.out.println();

        System.out.println(funcionario);

        System.out.println("Porcentagem de aumento: ");
        int porcentagemAumento = input.nextInt();
        funcionario.aumento(porcentagemAumento);

        System.out.println(funcionario);
    }

}