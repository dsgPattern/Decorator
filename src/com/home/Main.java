package com.home;

public class Main {

    public static void main(String[] args) {
        SmallPizza small=new SmallPizza();
        MediumPizza medium=new MediumPizza();
        LargePizza large=new LargePizza();

        System.out.println(small.getDescription());
        System.out.println(medium.getDescription());
        System.out.println(large.getDescription());


    }
}
