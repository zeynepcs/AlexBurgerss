package org.example;

public class SideDish extends Item {
    public SideDish(String name, double price) {
        super(name, price);
    }
    public String getName(){
        return SideDish.this.getName();
    }
}


