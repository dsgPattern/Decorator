package com.home;

public class LargePizza extends Pizza {
    @Override
    public String getDescription() {
        return "Large pizza";
    }

    @Override
    public double calculateCost() {
        return 20;
    }
}
