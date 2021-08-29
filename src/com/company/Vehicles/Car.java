package com.company.Vehicles;

import com.company.Parts.CarEngine;
import com.company.Parts.Engine;

public class Car extends Vehicle {
    private final CarEngine engine;
    private final String type;
    private int speedometer;

    public Car(CarEngine engine, int maxSpeed, int power, int accelerationRate, int brakingAbility, String type) {
        super(maxSpeed, power, accelerationRate, brakingAbility);
        this.type = type;
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
        int speedIncrement = 10;
        if (engine.getIsOperating()) {
            speedometer += speedIncrement;
            System.out.println("Current speed: " + speedometer);
        }
    }

    public void coast() {
        if ( engine.getIsOperating() && speedometer > 0) {
            System.out.println("Current coasting speed is: " + speedometer);
        }

    }

    public void brake() {
        int speedDecrement = 15;
        if (engine.getIsOperating() && speedometer > 0) {
            speedometer -= speedDecrement;
            System.out.println("You applied the brakes. Your speed is now " + speedometer + " mph.");
        } else if (speedometer <= 0) {
            System.out.println("the vehicle is stopped");
        } else {
            System.out.println("The engine needs to be running to accelerate. Please start vehicle first.");
        }
    }

    public String toString() {
        return "Type: " + type + " " + getMaxSpeed() + " " + getPower() + " " + getAccelerationRate() + " " + getBrakingAbility() + " " + engine;
    }


}
