package com.company.Vehicles;

import com.company.Parts.Engine;
import com.company.Parts.RaceEngine;

public class Car extends Vehicle {

    public Car(Engine engine, String type, int maxSpeed, int speedometer, int finishDistance, int distanceTraveled, int timer) {
        super(engine, type, maxSpeed, speedometer, finishDistance, distanceTraveled, timer);
        this.setEngine(engine);
    }

    public void start() {
        super.getEngine().on();
    }

    public void turnOff() {
        super.getEngine().off();
    }

    public void accelerate() {
        int speedIncrement = 10;
        if (super.getEngine().getIsOperating()) {
           setSpeedometer(getSpeedometer() + speedIncrement);
            System.out.println("\nAccelerate...");
            dashDisplay();

        }

    }

    public void coast() {
        if ( super.getEngine().getIsOperating() && getSpeedometer() > 0) {
            System.out.println("\nCoasting...");
            dashDisplay();
        }

    }

    public void brake() {
        int speedDecrement = 2;
        if (super.getEngine().getIsOperating() && getSpeedometer() > 0) {
           setSpeedometer(getSpeedometer() - speedDecrement);
            System.out.println("\nYou applied the brakes...");
            dashDisplay();
        } else if (getSpeedometer() <= 0) {
            System.out.println("The vehicle is stopped...");
            dashDisplay();
        }
    }

    public void stopShort() {
        if (super.getEngine().getIsOperating() && getSpeedometer() > 0) {
           setSpeedometer(0);
            System.out.println("The vehicle has skidded to a stop...");
            dashDisplay();
        }

    }

    // TODO: 9/2/2021 refactor and check where used. 
    public void dashDisplay() {
        System.out.println(" | Speedometer: " + getSpeedometer() + "mps | Finish: " + getFinishDistance() + " | Traveled: " + getDistanceTraveled() + "m | Time: " + getTimer() + "s | ");
    }

    public String toString() {
        return " | Type: " + getType() + " | Engine: " + getEngine() + " | Max Speed: " + getMaxSpeed() + " |";
    }


    public void setEngine(RaceEngine engine) {
        super.setEngine(engine);
    }
}
