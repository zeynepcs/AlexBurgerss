package org.example;

public class Burger {
    private Item topping1;
    public Burger(String Burger, int i) {
    }
    public String getName(){

        return topping1.getName();
    }
    public Double getTotalPrice() {
        return topping1.getBasePrice();
    }

    public void setToppings(Item topping1, Item topping2) {
    }
    protected void printToppings() {
    }
    public void printItem() {

System.out.println(topping1.getName() + topping1.getBasePrice());

    }
}
