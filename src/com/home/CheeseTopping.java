package com.home;

public class CheeseTopping extends PizzaDecorator {
    public CheeseTopping(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double calculateCost() {
        return super.calculateCost() + 1;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Cheese";
    }
}
