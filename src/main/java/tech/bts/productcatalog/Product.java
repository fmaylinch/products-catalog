package tech.bts.productcatalog;

public class Product {

    String name;
    double price;
    int unitsInStock;

    public Product(String name, double price, int unitsInStock) {
        this.name = name;
        this.price = price;
        this.unitsInStock = unitsInStock;
    }

    public String toString() {
        return this.name + " - " + this.price + "€ - " + this.unitsInStock + " units";
    }
}
