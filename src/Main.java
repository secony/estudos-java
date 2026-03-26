import java.util.Scanner;

public class Main {

    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        System.out.println("""
                [1]- ÁLCOOL
                [2]- GASOLINA
                [4]- SAIR
                """);
        System.out.print("DIGITE O COOMBUSTIVEL: ");
        int tipo = input.nextInt();

        while (tipo != 4) {

            if (tipo == 1) {

                alcool++;
            }else if (tipo == 2) {
                gasolina++;
            }
            else if (tipo == 3) {
                diesel++;
            }else if (tipo > 4 || tipo < 1) {
                System.out.print("NUMERO INVÁLIDO, DIGITE NOVAMENTE");
                tipo = input.nextInt();
            }
            System.out.println("""
                [1]- ÁLCOOL
                [2]- GASOLINA
                [4]- SAIR
                """);
            System.out.print("DIGITE O COOMBUSTIVEL: ");
            tipo = input.nextInt();
        }
        System.out.printf("""
                MUITO OBRIGADO
                alcool : %d
                gasolina : %d
                diesel : %d
                """,  alcool, gasolina, diesel);
    }

}