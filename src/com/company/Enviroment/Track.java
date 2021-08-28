package com.company.Enviroment;

public class Track {
    private int length;
    private String vehiclePosition;
    public Hazard hazard;

    public Track(int length, String vehiclePosition, Hazard hazard) {
        this.length = length;
        this.vehiclePosition = vehiclePosition;
        this.hazard = hazard;
    }
}
