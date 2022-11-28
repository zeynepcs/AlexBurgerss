package org.example;

public class Drink extends Item {
    public Drink(String name, double price) {
        super(name, price);
    }
    public String getName(){
        return Drink.super.getName();
    }
}
