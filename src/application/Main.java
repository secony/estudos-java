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

        System.out.print("Enter the number of products you want to add: ");
        int quantity = input.nextInt();
        produto.AddProducts(quantity);

        System.out.println("Product added successfully");

        System.out.println(produto);

        System.out.print("Enter the number of products you want to remove: ");
        int quantity2 = input.nextInt();
        produto.RemoveProducts(quantity2);

        System.out.println(produto);

    }
}