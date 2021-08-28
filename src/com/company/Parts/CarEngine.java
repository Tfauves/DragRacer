package com.company.Parts;

public class CarEngine extends Engine {
    private String type;
    private boolean isOperating;

    public CarEngine(String type, boolean isOperating, boolean hasSuperCharger, boolean hasNitrous) {
        super(hasSuperCharger, hasNitrous);
        this.type = type;
        this.isOperating = isOperating;
    }

    public void on() {
        if (!isOperating) {
            isOperating = true;
            System.out.println("The engine is running.");
        }
    }

    public void idle() {

    }

    public void off() {
        if (isOperating) {
            isOperating = false;
            System.out.println("The engine is off.");
        }

    }

    public void accelerate() {

    }


}
