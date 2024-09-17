package com.example.demo.patterns.StrategyPattern.WithPattern.strategy.actual;

import com.example.demo.patterns.StrategyPattern.WithPattern.strategy.DriveStrategy;

public class Vehicle {
    DriveStrategy driveStrategy;
    int x;
    Vehicle(DriveStrategy driveStrategy){
        this.driveStrategy = driveStrategy;
    }

    Vehicle(DriveStrategy driveStrategy, int x){
        this.driveStrategy = driveStrategy;
        this.x= x;
    }


    public void drive(){
        this.driveStrategy.drive();//now when you call the drive method, it will call the method of sport drive.
    }
}
