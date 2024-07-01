package bai2;

public class Product {
    int productId;
    String productName;
    double price;
    static final String storeName = "ABC Store";

    public Product(int productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

    public String toString() {
        return "Product ID: " + productId
                + ", Product Name: " + productName
                + ", Price: " + price
                + ", Store Name: " + storeName;
    }
}