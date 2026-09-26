package Teste_Crud.application;
import Teste_Crud.entities.Products;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        while (true) {
            System.out.print("""
                ------PRODUTOS------
                [1]-ADICIONAR
                [2]-VER PRODUTOS
                [3]-ATUALIZAR
                [4]-EXCLUIR
                [0]-SAIR
                """);
            System.out.print("Digite sua operação: ");
            int escolha = input.nextInt();

            switch (escolha) {}
        }

    }
}
