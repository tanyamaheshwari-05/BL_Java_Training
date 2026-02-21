package DesignPrinciple.SOLID;

import java.util.*;

public class OCP {
    public static void main(String[] args) {
        Product p1 = new Product("Tumbler", 250);
        Product p2 = new Product("Water bottle", 800);
        ShoppingCart sc = new ShoppingCart();
        sc.addProduct(p1);
        sc.addProduct(p2);
        InvoicePrint invoice = new InvoicePrint(sc);
        invoice.printInvoice();
        SaveToDB db = new SaveToMongoDb();
        db.save();
        SaveToDB ls = new SavetoLocalStorage();
        ls.save();
    }
}

class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
}

class ShoppingCart {
    List<Product> list = new ArrayList<>();

    public void addProduct(Product p) {
        list.add(p);
    }

    public List<Product> geProducts() {
        return list;
    }

    public double calculateTotalPrice() {
        double sum = 0;
        for (Product p : list) {
            sum += p.price;
        }
        return sum;
    }
}

class InvoicePrint {
    ShoppingCart cart;

    InvoicePrint(ShoppingCart cart) {
        this.cart = cart;
    }

    public void printInvoice() {
        for (Product p : cart.geProducts()) {
            System.out.println(p.name + ":" + p.price);
        }
        System.out.println("Total Payable amount :" + cart.calculateTotalPrice());
    }
}

abstract class SaveToDB {
    public abstract void save();
}

class SaveToMongoDb extends SaveToDB {
    @Override
    public void save() {
        System.out.println("Saved to Mongo Db");
    }
}

class SavetoLocalStorage extends SaveToDB {
    @Override
    public void save() {
        System.out.println("Saved to Local Storage");
    }
}