package com.home;

public class SmallPizza extends Pizza {
    @Override
    public String getDescription() {
        return "Small pizza";
    }

    @Override
    public double calculateCost() {
        return 10;
    }
}
