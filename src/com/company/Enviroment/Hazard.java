package com.company.Enviroment;

public class Hazard {
    private int damage;
    private String type;

    public Hazard(int damage, String type) {
        this.damage = damage;
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
