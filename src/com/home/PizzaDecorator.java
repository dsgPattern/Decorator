package com.home;

public class PizzaDecorator extends Pizza {
    private Pizza _originalPizza;

    public PizzaDecorator(Pizza pizza){
        _originalPizza=pizza;
    }

    @Override
    public String getDescription() {
        return _originalPizza.getDescription();
    }

    @Override
    public double calculateCost() {
        return _originalPizza.calculateCost();
    }
}
