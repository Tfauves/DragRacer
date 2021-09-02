package com.company.Parts;

public abstract class Engine {
    private int horsePower;
    private String type;
    private boolean isOperating;

    public Engine(int horsePower, String type, boolean isOperating) {
        this.horsePower = horsePower;
        this.type = type;
        this.isOperating = isOperating;
    }

    public abstract void on();
    public abstract void off();
    public abstract String toString();

    public int getHorsePower() {
        return horsePower;
    }

    public String getType() {
        return type;
    }

    public boolean getIsOperating() {
        return isOperating;
    }

    public void setIsOperating(boolean operating) {
        isOperating = operating;
    }
}