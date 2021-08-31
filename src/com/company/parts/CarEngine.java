package com.company.parts;

public class CarEngine extends Engine {

    public CarEngine(int horsePower, String type, boolean isOperating) {
        super(horsePower, type, isOperating);

    }

    public void on() {
        if (!getIsOperating()) {
            setOperating(true);
            System.out.println("\nThe engine is running.");
        }
    }

    public void off() {
        if (getIsOperating()) {
            setOperating(false);
            System.out.println("\nThe engine is off.");
        }

    }

    public String toString() {
        return " Type:" + getType() + " | Horse Power: " + getHorsePower() + "| \n";
    }

}
