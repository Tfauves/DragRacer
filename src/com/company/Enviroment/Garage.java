package com.company.Enviroment;

import com.company.Parts.Engine;
import com.company.Parts.RaceEngine;
import com.company.Vehicles.Car;
import com.company.Vehicles.Vehicle;

import java.util.*;

public class Garage {
    private final List<Vehicle> vehicleList = new ArrayList<>();
    private final List<Engine> engineList = new ArrayList<>();
    public static final Scanner scanner = new Scanner(System.in);
    private Car carChoice;
    private RaceEngine engineChoice;
    private Car playerCar;
    boolean isActiveTime = false;

    Car streetRacer1 = new Car(null, "Subaru Impreza WRX",170, 0, 0, 0, 0);
    Car streetRacer2 = new Car(null, "Volkswagen Golf/GTI",155, 0, 0, 0, 0);

    RaceEngine engine1  = new RaceEngine(205, "V6 gas", false);
    RaceEngine engine2  = new RaceEngine(394, "in6 gas", false);

    public void listBuild() {
        int carCount = 0;
        int engineCount = 0;
        vehicleList.add(streetRacer1);
        vehicleList.add(streetRacer2);
        engineList.add(engine1);
        engineList.add(engine2);
        System.out.println();
        System.out.println("------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("                                                     Car Selection");
        System.out.println("------------------------------------------------------------------------------------------------------------------------------");
        System.out.println();
        for (Vehicle vehicle : vehicleList) {
            carCount ++;
            System.out.println(carCount + ":" + vehicle + "\n");
        }
        System.out.println("------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("                                                     Engine Selection");
        System.out.println("------------------------------------------------------------------------------------------------------------------------------");
        System.out.println();
        for (Engine carEngine : engineList) {
            engineCount++;
            System.out.println(engineCount + ":" + carEngine + "\n");
        }
        System.out.println("------------------------------------------------------------------------------------------------------------------------------");
    }

    public void carBuilder() {
        System.out.println("Select a car make: ");
        int carSelection = scanner.nextInt();
        scanner.nextLine();
        switch (carSelection) {
            case 1 -> carChoice = streetRacer1;
            case 2 -> carChoice = streetRacer2;
            default -> System.out.println("Not Valid:");
        }
        System.out.println("Select engine: ");
        int engineSelection = scanner.nextInt();
        scanner.nextLine();
        switch (engineSelection) {
            case 1 -> engineChoice = engine1;
            case 2 -> engineChoice = engine2;
            default -> System.out.println("Not Valid:");
        }
        buildCar(engineChoice, carChoice);
    }

    public void buildCar(RaceEngine carEngine, Car car) {
       car.setEngine(carEngine);
       playerCar = car;
        System.out.println();
       System.out.println("Your Car:" + car);
    }

    public Car getPlayerCar() {
        return playerCar;
    }

}
