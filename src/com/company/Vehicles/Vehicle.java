package com.company.Vehicles;

import com.company.Parts.Engine;

public abstract class Vehicle {
    private Engine engine;
    private String type;
    private int maxSpeed;
    private int speedometer;
    private int finishDistance;
    private int distanceTraveled;
    private int timer;


    public Vehicle(Engine engine, String type, int maxSpeed, int speedometer, int finishDistance, int distanceTraveled, int timer) {
        this.engine = engine;
        this.type = type;
        this.maxSpeed = maxSpeed;
        this.speedometer = speedometer;
        this.finishDistance = finishDistance;
        this.distanceTraveled = distanceTraveled;
        this.timer = timer;

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

    public int getFinishDistance() {
        return finishDistance;
    }

    public void setFinishDistance(int finishDistance) {
        this.finishDistance = finishDistance;
    }

    public int getDistanceTraveled() {
        return distanceTraveled;
    }

    public int setDistanceTraveled(int distanceTraveled) {
        this.distanceTraveled = distanceTraveled;
        return distanceTraveled;
    }

    public int getTimer() {
        return timer;
    }

    public void setTimer(int timer) {
        this.timer = timer;
    }
}
