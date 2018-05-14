package com.home;

public class HamTopping extends PizzaDecorator {
    public HamTopping(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription() +", Ham";
    }

    @Override
    public double calculateCost() {
        return super.calculateCost() +2;
    }
}
