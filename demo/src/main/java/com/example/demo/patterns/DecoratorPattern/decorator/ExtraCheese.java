package com.example.demo.patterns.DecoratorPattern.decorator;

import com.example.demo.patterns.DecoratorPattern.Pizza.BasePizza;

public class ExtraCheese extends ToppingDecorator{

    BasePizza basePizza;

    int EXTRA_CHEESE_COST = 100;
    public ExtraCheese(BasePizza basePizza){
        this.basePizza = basePizza;
    }

    @Override
    public int cost(){
        return this.basePizza.cost() + EXTRA_CHEESE_COST;
    }
}
