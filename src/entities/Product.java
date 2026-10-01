package entities;

public class Product {

    public String name;
    public double price;
    public int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

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
