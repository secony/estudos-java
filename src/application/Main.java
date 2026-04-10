package application;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product product = new Product();
        System.out.println("Enter product data: ");
        System.out.print("Product name: ");
        product.name = sc.nextLine();
        System.out.print("Product price: ");
        product.price = sc.nextDouble();
        System.out.print("Product quantity: ");
        product.quantity = sc.nextInt();

        System.out.println(product.name + product.price + product.quantity);
    }
}
