package org.example.javawebapp.entity;

public class ProductInStore {
    private String upc;
    private int id;
    private double price;
    private int quantity;
    private boolean isPromotional;

    public ProductInStore(String upc) {
        this.upc = upc;
    }
    public ProductInStore(String upc,  int id, double price, int quantity, boolean isPromotional) {
        this.upc = upc;
        this.id = id;
        this.price = price;
        this.quantity = quantity;
        this.isPromotional = isPromotional;
    }

    //Write getters
    public String getUpc() {
        return upc;
    }
    public int getId() {
        return id;
    }
    public double getPrice() {
        return price;
    }
    public int getQuantity() {
        return quantity;
    }
    public boolean getIsPromotional() {
        return isPromotional;
    }

}
