package com.company.Enviroment;

public class Track {
    String lvlOfDifficulty;
    private int length;
    public Hazard hazard;

    public Track(String lvlOfDifficulty, int length, Hazard hazard) {
        this.lvlOfDifficulty = lvlOfDifficulty;
        this.length = length;
        this.hazard = hazard;
    }

    public int getLength() {
        return length;
    }
}
