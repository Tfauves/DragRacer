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
    private static final  Scanner scanner = new Scanner(System.in);
    private Car carChoice;
    private CarEngine engineChoice;
    private Vehicle playerCar;

    Car streetRacer1 = new Car(null, "Subaru Impreza WRX", 174, 5, 5, 3);
    Car streetRacer2 = new Car(null, "Volkswagen Golf/GTI", 155, 4, 5, 5);

    CarEngine engine1  = new CarEngine(" Boxer, 2.0 liter flat-four", false, false, false, false,205);
    CarEngine engine2  = new CarEngine(" Nissan-VQ35HR, 3.8 liter four valve DOHC", false, false, true, true, 394);



    public void listBuild() {
        System.out.println("------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("                                                     Engine Selection");
        System.out.println("------------------------------------------------------------------------------------------------------------------------------");
        int carCount = 0;
        int engineCount = 0;
        vehicleList.add(streetRacer1);
        vehicleList.add(streetRacer2);
        engineList.add(engine1);
        engineList.add(engine2);
        for (Engine carEngine : engineList) {
            engineCount++;
            System.out.println(engineCount + ":" + carEngine);
        }
        System.out.println("------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("                                                     Car Selection");
        System.out.println("------------------------------------------------------------------------------------------------------------------------------");
        for (Vehicle vehicle : vehicleList) {
            carCount ++;
            System.out.println(carCount + ":" + vehicle);
        }

    }

    public void carBuilder() {
        System.out.println("Select engine: ");
        int engineSelection = scanner.nextInt();
        scanner.nextLine();
        switch (engineSelection) {
            case 1:
                engineChoice = engine1;
                break;
            case 2:
                engineChoice = engine2;
                break;
            default:
                System.out.println("Not Valid:");
                break;
        }
        System.out.println("Select a car make: ");
        int carSelection = scanner.nextInt();
        scanner.nextLine();
        switch (carSelection) {
            case 1:
                carChoice = streetRacer1;
                break;
            case 2:
                carChoice = streetRacer2;
                break;
            default:
                System.out.println("Not Valid:");
                break;

        }
        buildCar(engineChoice, carChoice);
    }

    public void buildCar(CarEngine carEngine, Car car) {
       car.setEngine(carEngine);
       playerCar = car;
       System.out.println("Your Car:" + car);
    }


    public Vehicle getPlayerCar() {
        return playerCar;
    }
}
