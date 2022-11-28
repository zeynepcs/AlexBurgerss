package org.example;

public class Topping extends Item{
    public Topping(String name, double price) {
        super(name, price);
    }
    public String getName(){
        return Topping.this.getName();
    }
}
