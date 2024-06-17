package org.example.javawebapp.entity;

public class Product {
    private int id;
    private String name;
    private int category;
    private String description;

    public  Product( int prouctId) {
        this.id = prouctId;
    }
    public Product(int productId, String productName, int category, String description) {
        this.id = productId;
        this.name = productName;
        this.category = category;
        this.description = description;
    }
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getCategory() {
        return category;
    }

    public String getDescription() {
        return description;
    }
}
