package org.example;

public class Meal {
    private Burger burger;
    private Item drink;
    private Item side;

    public Meal(Burger burger, Item coke, Item fries) {
    }
    public double getToptalPrice() {
        return burger.getTotalPrice() + drink.getBasePrice() + side.getBasePrice();
    }
    public void printMeal(){
        System.out.println("MEAL:"  + drink.getName() + side.getName());
 }
}
