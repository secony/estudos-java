package entities;

public class Product {

    private String name;
    private double price;
    private int quantity;

    // Criando um construtor para inicializar um objeto ja com atributos

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // Criando outro construtor para que se eu quiser somente adicionar nome e preço, a quantidade ja vai comerçar inicializada com 0,
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
        quantity = 0;
    }

    // Getters e Setters

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public double getPrice(){
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    // Recebe uma quantidade e um preço, e retorna a multiplicação deles

    public double totalPrice(int quantity, double price) {
        return price * quantity;
    }

    public int addQuantity(int quantityAdd) {
        return quantity += quantityAdd;
    }
    public double subtractQuantity(int quantitySub) {
        return quantity -= quantitySub;
    }

    @Override
    public String toString() {
        return "product name: " + name
                + ", price: " + price
                + ", quantity: " + quantity
                + ", Total: " + totalPrice((int) price, quantity);    }
}
