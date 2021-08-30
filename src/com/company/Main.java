package com.company;


import com.company.Enviroment.SpeedWay;
import com.company.Parts.CarEngine;
import com.company.Vehicles.Car;

public class Main {

    public static void main(String[] args) {
//        SpeedWay location1 = new SpeedWay();
//        Car dragster1 = new Car(new CarEngine("big block v8", false, false, false), "Dragster", 250, 5, 5, 2);
//        System.out.println(dragster1.toString());
//        dragster1.start();
//        dragster1.accelerate();
//        dragster1.accelerate();
//        dragster1.accelerate();
//        dragster1.coast();
//        dragster1.coast();
//        location1.startTimer(1000);

//        dragster1.accelerate();
//        dragster1.accelerate();
//        dragster1.accelerate();
//        dragster1.brake();
//        dragster1.stopShort();
//        dragster1.turnOff();

        Garage garage01 = new Garage();
        SpeedWay race01 =new SpeedWay();
        garage01.listBuild();
        garage01.carBuilder();
//        garage01.getPlayerCar().start();
//        garage01.getPlayerCar().accelerate();
//        garage01.getPlayerCar().accelerate();
        garage01.beginDrive();



    }
}
