package com.example.demo.patterns.StrategyPattern.WithPattern.strategy.actual;

import com.example.demo.patterns.StrategyPattern.WithPattern.strategy.DriveStrategy;
import com.example.demo.patterns.StrategyPattern.WithPattern.strategy.SportsDriveStrategy;

public class OffRoadVehicle extends Vehicle{

    OffRoadVehicle() {
        super(new SportsDriveStrategy());
    }

    OffRoadVehicle(DriveStrategy driveStrategy, int x) {
        super(driveStrategy, x);
    }
}
