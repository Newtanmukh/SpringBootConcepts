package com.example.demo.patterns.DecoratorPattern.decorator;

import com.example.demo.patterns.DecoratorPattern.Pizza.BasePizza;

public abstract class ToppingDecorator extends BasePizza {
    @Override
    public int cost() {
        return 0;
    }
}
