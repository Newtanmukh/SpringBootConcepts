package com.example.demo.patterns.StrategyPattern.WithPattern.strategy.actual;

import com.example.demo.patterns.StrategyPattern.WithPattern.strategy.DriveStrategy;
import com.example.demo.patterns.StrategyPattern.WithPattern.strategy.NormalDriveStrategy;

public class NormalVehicle extends Vehicle{
    NormalVehicle(DriveStrategy driveStrategy) {
        super(new NormalDriveStrategy());
    }

    NormalVehicle(DriveStrategy driveStrategy, int x) {
        super(new NormalDriveStrategy(), 10*x);
    }
}
