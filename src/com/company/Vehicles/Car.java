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
        int speedIncrement = 15;
        if (super.getEngine().getIsOperating() && getSpeedometer() < getMaxSpeed()) {
           setSpeedometer(getSpeedometer() + speedIncrement);
            System.out.println("\nAccelerate.. \nSpeedometer: " + getSpeedometer() + " mps.");
            dashDisplay();

        } else if (getSpeedometer() >= getMaxSpeed()) {
            setSpeedometer(getMaxSpeed());
            System.out.println("\n The vehicle is at its max speed " + getSpeedometer() + " mps.");
            dashDisplay();
        }

    }

    public void coast() {
        if ( super.getEngine().getIsOperating() && getSpeedometer() > 0) {
            System.out.println("\nCoasting. \n Speedometer: " + getSpeedometer() + " mps.");
            dashDisplay();
        }

    }

    public void brake() {
        int speedDecrement = 2;
        if (super.getEngine().getIsOperating() && getSpeedometer() > 0) {
           setSpeedometer(getSpeedometer() - speedDecrement);
            System.out.println("\nYou applied the brakes. \n Speedometer: " + getSpeedometer() + " mps. \n");
            dashDisplay();
        } else if (getSpeedometer() <= 0) {
            System.out.println("The vehicle is stopped \n Speedometer: " + getSpeedometer() + " mps. \n");
            dashDisplay();
        } else {
            System.out.println("The engine needs to be running to accelerate. Please start vehicle first.");
            dashDisplay();
        }
    }

    public void stopShort() {
        if (super.getEngine().getIsOperating() && getSpeedometer() > 0) {
           setSpeedometer(0);
            System.out.println("The vehicle has skidded to a stop. \n Speedometer: " + getSpeedometer());
            dashDisplay();
        }

    }

    // TODO: 9/2/2021 refactor and check where used. 
    public void dashDisplay() {
        System.out.println(" | Speedometer: " + getSpeedometer() + " | Finish: " + getFinishDistance() + " | Traveled: " + getDistanceTraveled() + " | Time: " + getTimer());
    }

    public String toString() {
        return " | Type: " + getType() + " | Engine: " + getEngine() + " | Max Speed: " + getMaxSpeed() + " |";
    }


    public void setEngine(RaceEngine engine) {
        super.setEngine(engine);
    }
}
