package com.company.parts;

public abstract class Engine {
    private final int horsePower;
    private String type;
    private boolean isOperating;

    public Engine(int horsePower, String type, boolean isOperating) {
        this.horsePower = horsePower;
        this.type = type;
        this.isOperating = isOperating;
    }

    public abstract void on();
    public abstract void off();

    public int getHorsePower() {
        return horsePower;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean getIsOperating() {
        return isOperating;
    }

    public void setOperating(boolean operating) {
        isOperating = operating;
    }
}