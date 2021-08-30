package com.company.Vehicles;

import com.company.Parts.CarEngine;

public class Car extends Vehicle {
    private CarEngine engine;
    private int speedometer;

    public Car(CarEngine engine, String type, int maxSpeed, int power, int accelerationRate, int brakingAbility) {
        super(maxSpeed, power, accelerationRate, brakingAbility, type);
        this.engine = engine;
        speedometer = 0;
    }

    public void start() {
        engine.on();
    }

    public void turnOff() {
        engine.off();
    }

    public void accelerate() {
        int speedIncrement = 15;
        if (engine.getIsOperating() && speedometer < getMaxSpeed()) {
            speedometer += speedIncrement;
            System.out.println("\nAccelerate.. \nSpeedometer: " + speedometer + " mph.");
            //superCharger and nitrous will be able to be applied to increase the max speed amount.

        } else if (speedometer >= getMaxSpeed()) {
            speedometer = getMaxSpeed();
            System.out.println("\n The vehicle is at its max speed " + speedometer + " mph.");
        }
    }

    public void coast() {
        if ( engine.getIsOperating() && speedometer > 0) {
            System.out.println("\nCoasting. \n Speedometer: " + speedometer + " mph.");
        }

    }

    public void brake() {
        int speedDecrement = 2;
        if (engine.getIsOperating() && speedometer > 0) {
            speedometer -= speedDecrement;
            System.out.println("\nYou applied the brakes. \n Speedometer: " + speedometer + " mph. \n");
        } else if (speedometer <= 0) {
            System.out.println("The vehicle is stopped \n Speedometer: " + speedometer + " mph. \n");
        } else {
            System.out.println("The engine needs to be running to accelerate. Please start vehicle first.");
        }
    }

    public void stopShort() {
        if (engine.getIsOperating() && speedometer > 0) {
            speedometer = 0;
            System.out.println("The vehicle has skidded to a stop. \n Speedometer: " + speedometer);
        }

    }

    public String toString() {
        return " | Type: " + getType() + " | Engine" + getEngine() + " | Max Speed: " + getMaxSpeed() + " | Power Level " + getPower() + " | Acceleration Rate: " + getAccelerationRate() + " | Braking Ability " + getBrakingAbility() + " | \n";
    }

    public CarEngine getEngine() {
        return engine;
    }


    public void setEngine(CarEngine engine) {
        this.engine = engine;
    }
}
