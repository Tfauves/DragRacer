package com.company.Vehicles;

import com.company.Parts.Engine;

public class Car extends Vehicle {
    private Engine engine;
    private String type;

    public Car(int maxSpeed, int power, int accelerationRate, int brakingAbility, int speedometer, String type) {
        super(maxSpeed, power, accelerationRate, brakingAbility, speedometer);
        this.type = type;
    }

    public void start() {

    }

    public void turnOff() {

    }

    public void accelerate() {

    }

    public void coast() {

    }

    public void brake() {

    }

    public String toString() {
        return "Type: " + type + " " + getMaxSpeed() + " " + getPower() + " " + getAccelerationRate() + " " + getBrakingAbility() + " " + engine;
    }




}
