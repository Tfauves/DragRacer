package com.company;


import com.company.Parts.CarEngine;
import com.company.Vehicles.Car;

public class Main {

    public static void main(String[] args) {
        Car dragster1 = new Car(new CarEngine("big block v8", false, false, false), "Dragster", 250, 5, 5, 2);
        System.out.println(dragster1.toString());
        dragster1.start();
        dragster1.accelerate();
        dragster1.accelerate();
        dragster1.accelerate();
        dragster1.coast();
        dragster1.coast();
//        dragster1.accelerate();
//        dragster1.accelerate();
//        dragster1.accelerate();
//        dragster1.brake();
//        dragster1.stopShort();
//        dragster1.turnOff();



    }
}
