package com.example.demo.patterns.DecoratorPattern;

import com.example.demo.patterns.DecoratorPattern.Pizza.BasePizza;
import com.example.demo.patterns.DecoratorPattern.Pizza.FarmHouse;
import com.example.demo.patterns.DecoratorPattern.decorator.ExtraCheese;
import com.example.demo.patterns.DecoratorPattern.decorator.Mushroom;

public class Main {

    public static void main(String[] args) throws Exception {
        BasePizza basePizza =  new Mushroom(new ExtraCheese(new FarmHouse()));

        System.out.println(basePizza.cost());
    }
}
