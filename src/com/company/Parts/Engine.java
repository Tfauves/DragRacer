package com.company.Parts;

public abstract class Engine {
    private boolean hasSuperCharger;
    private boolean hasNitrous;

    public Engine(boolean hasSuperCharger, boolean hasNitrous) {
        this.hasSuperCharger = hasSuperCharger;
        this.hasNitrous = hasNitrous;
    }

    public abstract void on();
    public abstract void off();

}
