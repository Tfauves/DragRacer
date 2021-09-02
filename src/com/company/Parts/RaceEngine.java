package com.company.Parts;

public class RaceEngine extends Engine{

    public RaceEngine(int horsePower, String type, boolean isOperating) {
        super(horsePower, type, isOperating);
    }

    public void on() {
        if (!getIsOperating()) {
            setIsOperating(true);
            System.out.println("Engine is running");
        }
    }

    public void off() {
        if (getIsOperating()) {
            setIsOperating(false);
            System.out.println("Engine is off");
        }
    }

    public String toString() {
        return "| Type: " + getType() + " | Horse Power: " + getHorsePower() + " | \n";
    }
}
