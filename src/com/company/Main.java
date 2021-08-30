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
//        garage01.listBuild();

        Car streetRacer1 = new Car(null, "Subaru Impreza WRX", 174, 5, 5, 3);
        Car streetRacer2 = new Car(null, "Volkswagen Golf/GTI", 155, 4, 5, 5);

        CarEngine boxerEngine  = new CarEngine("2.0 liter flat-four", false, false, false, false,205);
        CarEngine nissanVQ35HR  = new CarEngine(" 3.8 liter four valve DOHC", false, false, true, true, 394);
                garage01.carBuilder(nissanVQ35HR, streetRacer1);

    }
}
