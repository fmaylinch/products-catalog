package tech.bts.productcatalog;

import java.util.*;

/**
 * This program can read products from keyboard and store them in a file (products.json).
 *
 * When the program starts it will ask "What do you want to do?".
 * You can say "add" (add product) or "list" (display products).
 *
 * If you say "add" the program will ask for the product data (name, price, units).
 *
 * > What do you want to do? add
 * > Product name: iPhone
 * > Price: 1000
 * > Units: 5
 * > Product added
 * > What do you want to do? list
 * iPhone - 1000€ - 5 units
 * ....
 * > What do you want to do?
 */
public class ProductCatalog {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // scanner can read from keyboard

        List<Product> products = new ArrayList<Product>(); // creates an empty list

        while (true) {

            System.out.print("What do you want to do? ");
            String line = input.nextLine();

            System.out.println("You want to: " + line);

            if (line.equals("exit")) {
                break;
            }

            if (line.equals("add")) {

                System.out.print("Product name? ");
                String name = input.nextLine();

                System.out.print("Price? ");
                double price = Double.parseDouble( input.nextLine() );

                System.out.print("Units? ");
                int units = Integer.parseInt( input.nextLine() );

                Product p = new Product(name, price, units);
                System.out.println("Product added: " + p);
            }

            if (line.equals("list")) {

                // TODO: print the list of products I have added
            }

            System.out.println("Action done!");
        }
    }
}
