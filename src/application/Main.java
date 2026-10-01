package application;
import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        // Recebendo os "atributos"

        System.out.print("Nome do produto: ");
        String name = input.nextLine();
        System.out.print("Preco do produto: ");
        int price = input.nextInt();
        System.out.print("Quantidade: ");
        int quantity = input.nextInt();

        // somente agora instanciar o objeto para que ele ja receba os atributos com valores reais.
        Product product = new Product(name, price, quantity);

        // Atuializando o nome com set e printando o novo nome pelo get
        product.setName("computer");
        System.out.println("Novo nome de produto: " + product.getName());
        product.setPrice(4000);
        System.out.println("Novo preco do produto: " + product.getPrice());

        System.out.println(product);

        System.out.print("Quantidade para adicionar: ");
        int quantidadeAdd = input.nextInt();
        product.addQuantity(quantidadeAdd);

        System.out.println(product);

        System.out.println("Quantidade para tirar: ");
        int quantidadeRemove = input.nextInt();
        product.subtractQuantity(quantidadeRemove);
        System.out.println(product);


    }
}
