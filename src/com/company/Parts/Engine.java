package com.company.Parts;

public abstract class Engine {
    private boolean hasSuperCharger;
    private boolean hasNitrous;

    public abstract void on();
    public abstract void idle();
    public abstract void off();
    public abstract void accelerate();


}
