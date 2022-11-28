package org.example;

public class DeluxeBurger extends Burger {


    private Item extra1;

    public DeluxeBurger(String Burger, int i) {
        super(Burger, i);
    }

    public Double getTotalPrice() {
        return extra1.getBasePrice();
    }

    public void setExtras(String extra1) {


    }

    protected void printToppings() {


    }

    public void printItem() {

        System.out.println(extra1.getName() + extra1.getBasePrice());


    }


}
