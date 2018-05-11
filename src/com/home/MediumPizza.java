package com.home;

public class MediumPizza extends Pizza {
    @Override
    public String getDescription() {
        return "Medium Pizza";
    }

    @Override
    public double calculateCost() {
        return 15;
    }
}
