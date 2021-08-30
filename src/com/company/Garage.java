package com.company;

import com.company.Parts.CarEngine;
import com.company.Parts.Engine;
import com.company.Vehicles.Car;
import com.company.Vehicles.Vehicle;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Garage {
    private final List<Vehicle> vehicleList = new ArrayList<>();
    private final List<Engine> engineList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
//    Car streetRacer1 = new Car(null, "Subaru Impreza WRX", 174, 5, 5, 3);
//    Car streetRacer2 = new Car(null, "Volkswagen Golf/GTI", 155, 4, 5, 5);
//
//    CarEngine boxerEngine  = new CarEngine("2.0 liter flat-four", false, false, false, false,205);
//    CarEngine nissanVQ35HR  = new CarEngine(" 3.8 liter four valve DOHC", false, false, true, true, 394);

    public void carBuilder(CarEngine carEngine, Car car) {
        car.setEngine(carEngine);
        System.out.println(car.toString());

    }


//    public void listBuild() {
//        System.out.println("                                                     Car Selection");
//        System.out.println("------------------------------------------------------------------------------------------------------------------------------");
//
//        int carCount = 0;
//        int engineCount = 0;
//        vehicleList.add(streetRacer1);
//        vehicleList.add(streetRacer2);
//        engineList.add(boxerEngine);
//        engineList.add(nissanVQ35HR);
//        for (Vehicle vehicle : vehicleList) {
//            carCount ++;
//            System.out.println(carCount + ":" + vehicle);
//        }
//        System.out.println("------------------------------------------------------------------------------------------------------------------------------");
//        System.out.println("                                                     Engine Selection");
//        System.out.println("------------------------------------------------------------------------------------------------------------------------------");
//
//        for (Engine carEngine : engineList) {
//            engineCount++;
//            System.out.println(engineCount + ":" + carEngine);
//        }
//        System.out.println("------------------------------------------------------------------------------------------------------------------------------");
//
//    }
//
//
//    public void carBuilder() {
//        System.out.println("Select engine: ");
//        int engineSelection = scanner.nextInt();
//        scanner.nextLine();
//        switch (engineSelection) {
//            case 1:
//                CarEngine boxerEngine  = new CarEngine("2.0 liter flat-four", false, false, false, false,205);
//                break;
//            case 2:
//                CarEngine nissanVQ35HR  = new CarEngine(" 3.8 liter four valve DOHC", false, false, true, true, 394);
//                break;
//            default:
//                System.out.println("Not Valid:");
//                break;
//        }
//        System.out.println("Select a car make: ");
//        int carSelection = scanner.nextInt();
//        scanner.nextLine();
//        switch (carSelection) {
//            case 1:
//                Car streetRacer1 = new Car(boxerEngine, "Subaru Impreza WRX", 174, 5, 5, 3);
//                break;
//            case 2:
//                Car streetRacer2 = new Car(null, "Volkswagen Golf/GTI", 155, 4, 5, 5);
//
//                break;
//            default:
//                System.out.println("Not Valid:");
//                break;
//
//        }
//
//
//
//    }

}
