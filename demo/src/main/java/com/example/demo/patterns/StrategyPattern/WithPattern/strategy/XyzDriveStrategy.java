package com.example.demo.patterns.StrategyPattern.WithPattern.strategy;

public class XyzDriveStrategy implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("Random Vehicle Driving");
    }
}
