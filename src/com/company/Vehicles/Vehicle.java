package com.company.Vehicles;

public abstract class Vehicle {
    private int maxSpeed;
    private int power;
    private int acceleration;
    private int braking;
    private int speedometer = 0;

    public abstract void start();
    public abstract void turnOff();
    public abstract void accelerate();
    public abstract void coast();
    public abstract void brake();




}
