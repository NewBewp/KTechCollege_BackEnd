package bai2;

import java.util.ArrayList;
import java.util.Scanner;

public class Cart {
    ArrayList<Product> products;
    Scanner sc = new Scanner(System.in);

    public Cart() {
        products = new ArrayList<>();
    }

    public void addToCart() {
        System.out.println("productId: ");
        int productId = sc.nextInt();
        System.out.println("productName: ");
        String productName = sc.next();
        System.out.println("productPrice: ");
        double productPrice = sc.nextDouble();

        products.add(new Product(productId, productName, productPrice));
    }

    public void totalPrice() {
        double total = 0;
        for (Product product : products) {
            total += product.price;
        }
        System.out.println(total);
    }

    public void showCart() {
        for (Product product : products) {
            System.out.println(product);
        }
    }
}
