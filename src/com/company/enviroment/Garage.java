package com.company.enviroment;

import com.company.Console;
import com.company.parts.CarEngine;
import com.company.parts.Engine;
import com.company.vehicles.Car;
import com.company.vehicles.Vehicle;

import java.util.*;

public class Garage {
    private final List<Vehicle> vehicleList = new ArrayList<>();
    private final List<Engine> engineList = new ArrayList<>();
    private Car carChoice;
    private CarEngine engineChoice;
    private Car playerCar;


    Car streetRacer1 = new Car(174, "Subaru Impreza WRX", null, 0, 0, 0,0);
    Car streetRacer2 = new Car(155, "Volkswagen Golf/GTI", null, 0, 0, 0,0);

    CarEngine engine1  = new CarEngine(205, "Boxer, 2.0 liter flat-four", false);
    CarEngine engine2  = new CarEngine(394, " Nissan-VQ35HR, 3.8 liter four valve DOHC", false);



    public void listBuild() {
        vehicleList.add(streetRacer1);
        vehicleList.add(streetRacer2);
        engineList.add(engine1);
        engineList.add(engine2);

    }

    public void carBuilder() {
        System.out.println("Select engine: ");
        int engineSelection = Console.scanner.nextInt();
        Console.scanner.nextLine();
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
        int carSelection = Console.scanner.nextInt();
        Console.scanner.nextLine();
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
        System.out.println();
       System.out.println("Your Car:" + car);
    }

    public Car getPlayerCar() {
        return playerCar;
    }

}
