package application;
import java.util.Scanner;
import entities.Student;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Student student = new Student();

        System.out.print("Nome: ");
        student.name = sc.nextLine();

        System.out.print("Primeiro trimeste: ");
        student.nota1 = sc.nextInt();

        while (student.nota1 > 30 || student.nota1 < 0) {
            System.out.println("nota invalida!");
            System.out.print("Primeiro trimeste: ");
            student.nota1 = sc.nextInt();
        }

        System.out.print("Segundo trimeste: ");
        student.nota2 = sc.nextInt();
        while (student.nota2 > 35 || student.nota2 < 0) {
            System.out.println("nota invalida!");
            System.out.print("Segundo trimeste: ");
            student.nota2 = sc.nextInt();

        }

        System.out.print("Terceito trimeste: ");
        student.nota3 = sc.nextInt();
        while (student.nota3 > 35 || student.nota3 < 0) {
            System.out.println("nota invalida!");
            System.out.print("Terceito trimeste: ");
            student.nota3 = sc.nextInt();

        }



        System.out.println(student.finalNota());
        System.out.println(student.AprovadoReprovado());

        sc.close();
    }

}