package org.example;

public class Item {

    private String name;
    private String type;
    private double price;

    public Item (String name, double price){
        this.name = name;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public Double getBasePrice() {
        return price;
    }
}
