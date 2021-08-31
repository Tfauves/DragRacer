package com.company.vehicles;

import com.company.parts.Engine;

public abstract class Vehicle {
    private int maxSpeed;
    private String type;
    private Engine engine;
    private int speedometer;
    private int distanceTraveled;
    private int distanceToDestination;
    private int timePassed;


    public Vehicle(int maxSpeed, String type, Engine engine, int speedometer, int distanceTraveled, int distanceToDestination, int timePassed) {
        this.maxSpeed = maxSpeed;
        this.type = type;
        this.engine = engine;
        this.speedometer = speedometer;
        this.distanceTraveled = distanceTraveled;
        this.distanceToDestination = distanceToDestination;
        this.timePassed = timePassed;

    }

    public abstract void start();
    public abstract void turnOff();
    public abstract void accelerate();
    public abstract void coast();
    public abstract void brake();

    public abstract String toString();

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public String getType() {
        return type;
    }


    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public int getSpeedometer() {
        return speedometer;
    }

    public void setSpeedometer(int speedometer) {
        this.speedometer = speedometer;
    }

    public int getDistanceTraveled() {
        return distanceTraveled;
    }

    public void setDistanceTraveled(int distanceTraveled) {
        this.distanceTraveled = distanceTraveled;
    }

    public int getDistanceToDestination() {
        return distanceToDestination;
    }

    public void setDistanceToDestination(int distanceToDestination) {
        this.distanceToDestination = distanceToDestination;
    }

    public int getTimePassed() {
        return timePassed;
    }

    public void setTimePassed(int timePassed) {
        this.timePassed = timePassed;
    }
}
