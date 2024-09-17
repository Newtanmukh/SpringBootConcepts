package com.example.demo.patterns.StrategyPattern.WithPattern.strategy;

public class NormalDriveStrategy implements DriveStrategy{

    @Override
    public void drive() {
        System.out.println("Normal Vehicle Driving");
    }
}
