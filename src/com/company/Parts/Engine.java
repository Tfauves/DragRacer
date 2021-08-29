package com.company.Parts;

public abstract class Engine {
    private boolean hasSuperCharger;
    private boolean hasNitrous;
    private boolean hasTurboCharger;
    private int horsePower;

    public Engine(boolean hasSuperCharger, boolean hasNitrous, boolean hasTurboCharger, int horsePower) {
        this.hasSuperCharger = hasSuperCharger;
        this.hasNitrous = hasNitrous;
        this.hasTurboCharger = hasTurboCharger;
        this.horsePower = horsePower;
    }

    public abstract void on();
    public abstract void off();

    public boolean isHasSuperCharger() {
        return hasSuperCharger;
    }

    public boolean isHasNitrous() {
        return hasNitrous;
    }

    public boolean isHasTurboCharger() {
        return hasTurboCharger;
    }

    public int getHorsePower() {
        return horsePower;
    }
}
