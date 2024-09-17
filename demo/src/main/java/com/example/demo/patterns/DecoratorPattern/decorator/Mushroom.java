package com.example.demo.patterns.DecoratorPattern.decorator;

import com.example.demo.patterns.DecoratorPattern.Pizza.BasePizza;

public class Mushroom extends ToppingDecorator{

    BasePizza basePizza;

    int MUSHROOM_COST = 500;

    public Mushroom(BasePizza basePizza){
        this.basePizza = basePizza;
    }

    @Override
    public int cost(){
        return this.basePizza.cost() + MUSHROOM_COST;
    }

}
