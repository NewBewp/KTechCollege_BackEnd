package bai2;

import bai1.Model.Car;

import java.util.Scanner;

public class ShoppingApp {
    public static void main(String[] args) {
        Product product1 = new Product(1, "Laptop", 1500.00);
        Product product2 = new Product(2, "Smartphone", 800.00);
        Product product3 = new Product(3, "Tablet", 300.00);



        Cart cart = new Cart();
//        cart.addToCart(product1);
//        cart.addToCart(product2);
//        cart.addToCart(product3);

        cart.showCart();
        Scanner sc = new Scanner(System.in);
        boolean flag = true;

        while (flag){
            System.out.print("Chon chuc nang: ");
            int condition = sc.nextInt();
            switch (condition){
                case 1:
                    cart.showCart();
                    break;
                case 2:
                    cart.addToCart();
                    break;
                case 3:
                    cart.totalPrice();
                    break;
                default:
                    flag = false;
                    break;
            }
        }
    }
}
