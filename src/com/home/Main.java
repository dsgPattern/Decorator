package com.home;

public class Main {

    public static void main(String[] args) {
        SmallPizza small=new SmallPizza();
        MediumPizza medium=new MediumPizza();
        Pizza large=new LargePizza();

        System.out.println(small.getDescription());
        System.out.println(medium.getDescription());
        System.out.println(large.getDescription());

        large=new CheeseTopping(large);
        large=new HamTopping(large);
        System.out.println(large.getDescription());
        System.out.println(large.calculateCost());
    }
}
