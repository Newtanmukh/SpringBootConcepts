package com.example.demo.patterns.StrategyPattern.WithPattern.strategy;

public class SportsDriveStrategy implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("Sports Vehicle Driving");
    }
}
