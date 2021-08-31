package com.company.enviroment;

public class Track {
    private String lvlOfDifficulty;
    private int length;
    public Hazard hazard;

    public Track(String lvlOfDifficulty, int length, Hazard hazard) {
        this.length = length;
        this.hazard = hazard;
    }

    public static void trackBuilder(String lvlOfDifficulty, int distance, Hazard hazardType) {
        Track track  = new Track(lvlOfDifficulty, distance, hazardType);
    }

    public int getLength() {
        return length;
    }
}
