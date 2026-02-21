//Single Responsibility Principle - A class hould have only one reason (a class should do only single responsibility)

package DesignPrinciple.SOLID;

import java.util.*;

public class SRP {
    public static void main(String[] args) {
        Product p1= new Product("Laptop",500000);
        Product p2= new Product("Bag", 2500);
        ShoppingCart s= new ShoppingCart();
        s.addProduct(p1);
        s.addProduct(p2);
        InvoicePrinter print= new InvoicePrinter(s);
        print.printInvoice();
        ShoppingCartToDB db= new  ShoppingCartToDB();
        db.saveToDB(s);
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

    public List<Product> getProduct() {
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

class InvoicePrinter {
    ShoppingCart cart;

    InvoicePrinter(ShoppingCart cart) {
        this.cart = cart;
    }

    public void printInvoice() {
        System.out.println("---Invoice Print-----");
        for(Product p:cart.getProduct()){
            System.out.println(p.name+": "+ p.price);
        }
        System.out.println("Total payable amount: "+ cart.calculateTotalPrice());
    }
}
class ShoppingCartToDB{
    public void saveToDB(ShoppingCart cart){
        System.out.println("Save to DB");
    }
}
