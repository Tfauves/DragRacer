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
            System.out.println("\nAccelerate.. \nSpeedometer: " + getSpeedometer() + " mph.");
            //superCharger and nitrous will be able to be applied to increase the max speed amount.

        } else if (getSpeedometer() >= getMaxSpeed()) {
            setSpeedometer(getMaxSpeed());
            System.out.println("\n The vehicle is at its max speed " + getSpeedometer() + " mph.");
        }
    }

    public void coast() {
        if ( super.getEngine().getIsOperating() && getSpeedometer() > 0) {
            System.out.println("\nCoasting. \n Speedometer: " + getSpeedometer() + " mph.");
        }

    }

    public void brake() {
        int speedDecrement = 2;
        if (super.getEngine().getIsOperating() && getSpeedometer() > 0) {
           setSpeedometer(getSpeedometer() - speedDecrement);
            System.out.println("\nYou applied the brakes. \n Speedometer: " + getSpeedometer() + " mph. \n");
        } else if (getSpeedometer() <= 0) {
            System.out.println("The vehicle is stopped \n Speedometer: " + getSpeedometer() + " mph. \n");
        } else {
            System.out.println("The engine needs to be running to accelerate. Please start vehicle first.");
        }
    }

    public void stopShort() {
        if (super.getEngine().getIsOperating() && getSpeedometer() > 0) {
           setSpeedometer(0);
            System.out.println("The vehicle has skidded to a stop. \n Speedometer: " + getSpeedometer());
        }

    }

    public String toString() {
        return " | Type: " + getType() + " | Engine: " + getEngine() + " | Max Speed: " + getMaxSpeed() + " |";
    }


    public void setEngine(RaceEngine engine) {
        super.setEngine(engine);
    }
}
