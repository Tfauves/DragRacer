package com.company;

import com.company.Parts.CarEngine;
import com.company.Parts.Engine;
import com.company.Vehicles.Car;
import com.company.Vehicles.Vehicle;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Garage {
    private List<Vehicle> vehicleList = new ArrayList<>();
    private List<Engine> engineList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    Car streetRacer1 = new Car(null, "Subaru Impreza WRX", 174, 5, 5, 3);
    Car streetRacer2 = new Car(null, "Volkswagen Golf/GTI", 155, 4, 5, 5);

    CarEngine boxerEngine  = new CarEngine("2.0 liter flat-four", false, false, false, false,205);
    CarEngine nissanVQ35HR  = new CarEngine(" 3.8 liter four valve DOHC", false, false, true, true, 394);


    public void listBuild() {
        vehicleList.add(streetRacer1);
        vehicleList.add(streetRacer2);
        engineList.add(boxerEngine);
        engineList.add(nissanVQ35HR);
        for (Vehicle vehicle : vehicleList) {
            System.out.println(vehicle);
        }
        for (Engine carEngine : engineList) {
            System.out.println(carEngine);
        }

    }


    public void carBuilder() {
        System.out.println("Select a car make: ");
        String userChoice = scanner.next();

    }

}
