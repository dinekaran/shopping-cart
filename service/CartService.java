package service;

import model.Product;
import java.util.ArrayList;
import java.util.List;

public class CartService {

    private List<Product> cart = new ArrayList<>();

    public void addProduct(Product product) {
        cart.add(product);
        System.out.println("Product added to cart");
    }

    public void viewCart() {
        if (cart.isEmpty()) {
            System.out.println("Cart is empty");
            return;
        }

        for (Product p : cart) {
            System.out.println(
                "ID: " + p.getId() +
                " Name: " + p.getName() +
                " Price: " + p.getPrice()
            );
        }
    }

    public double calculateTotal() {
        double total = 0;
        for (Product p : cart) {
            total += p.getPrice();
        }
        return total;
    }

    public List<Product> getCart() {
        return cart;
    }
}
