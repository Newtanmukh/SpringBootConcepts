package com.example.demo.patterns.StrategyPattern.WithPattern.strategy.actual;

import com.example.demo.patterns.StrategyPattern.WithPattern.strategy.NormalDriveStrategy;

public class Main {

    public static void main(String[] args) throws Exception{
        Vehicle vehicle = new OffRoadVehicle();
        vehicle.drive();


    }
}
