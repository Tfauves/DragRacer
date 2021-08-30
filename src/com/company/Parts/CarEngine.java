package com.company.Parts;

public class CarEngine extends Engine {
    private String type;
    private boolean isOperating;


    public CarEngine(String type, boolean isOperating, boolean hasSuperCharger, boolean hasNitrous, boolean hasTurboCharger, int horsePower) {
        super(hasSuperCharger, hasNitrous, hasTurboCharger, horsePower);
        this.type = type;
        this.isOperating = isOperating;
    }

    public void on() {
        if (!isOperating) {
            isOperating = true;
            System.out.println("\nThe engine is running.");
        }
    }

    public void off() {
        if (isOperating) {
            isOperating = false;
            System.out.println("\nThe engine is off.");
        }

    }

    public boolean getIsOperating() {
        return isOperating;
    }

    public void setOperating(boolean operating) {
        isOperating = operating;
    }

    public String getType() {
        return type;
    }
    //hasSuperCharger, hasNitrous, hasTurboCharger, horsePower
    public String toString() {
        return " Type:" + getType() + " | Horse Power: " + getHorsePower() + " | Super Charger: " + isHasSuperCharger() + " | Nitrous: " + isHasNitrous() + " | Turbo Charger: " + isHasTurboCharger() + "| \n";
    }

}
