package com.example.SpringBoot_Practice.modal;

public class Product {

    private int productID;
    private String productName;
    private int price;

    public Product(int productID, String productName, int price) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
    }

    public int getProductID() {
        return productID;
    }

    public String getProductName() {
        return productName;
    }

    public int getPrice() {
        return price;
    }
}
