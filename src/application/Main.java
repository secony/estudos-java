package application;
import entities.Product;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Product produto  = new Product();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter product data: ");
        System.out.print("name: ");
        produto.name = input.nextLine();
        System.out.print("price: ");
        produto.price = input.nextDouble();
        System.out.print("quantity: ");
        produto.quantity = input.nextInt();

        System.out.println(produto);

    }
}