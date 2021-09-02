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

    int ticksPassed = 0;
    Timer timeClock = new Timer();
    TimerTask distanceClock = new TimerTask() {
        @Override
        public void run() {
            ticksPassed++;
//            System.out.println("Ticks passed: " + ticksPassed);
        }
    };

    public void beginClock() {
        isActiveTime = true;
        if (isActiveTime) {
            startTimer(100);
        }
    }

    public void stopClock() {
        if (isActiveTime) {
            isActiveTime = false;
            System.out.println("Your time: " + ticksPassed + " sec");
        }
    }

    public void startTimer(int period) {
        timeClock.scheduleAtFixedRate(distanceClock, 1000, period);
    }


    public void listBuild() {
        System.out.println();

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

    public void buildCar(RaceEngine carEngine, Car car) {
       car.setEngine(carEngine);
       playerCar = car;
        System.out.println();
       System.out.println("Your Car:" + car);
    }

    public void beginDrive() {
        System.out.println("Would you like to drive? y/n");
        String userChoice = Garage.scanner.next();
        if (userChoice.equals("y")) {
            race(playerCar);
        } else {
            System.out.println("Returning to garage");
        }
    }


    public void race(Car playerVehicle) {
        boolean isActive = true;
        System.out.println("Press (s) to start your engine");
        String userInput = scanner.next();
        if (userInput.equals("s")) {
            playerVehicle.start();
            beginClock();
        } else {
            System.out.println("Please start your vehicle to begin driving.");
        }
        while (isActive) {
            if (playerVehicle.getEngine().getIsOperating()) {
                System.out.println("Press (a) to accelerate, (b) to brake, (x) to coast, (ab) to stop short, (y) to turn off vehicle, (xy) end race and to return to garage");
                userInput = scanner.next();
                switch (userInput) {
                    case "a":
                        playerVehicle.accelerate();
                        break;
                    case "b":
                        playerVehicle.brake();
                        break;
                    case "x":
                        playerVehicle.coast();
                        break;
                    case "ab":
                        playerVehicle.stopShort();
                        break;
                    case "y":
                        playerVehicle.turnOff();
                        break;
                    case "xy":
                        System.out.println("The race is over...heading back to garage");
                        stopClock();
                        isActive = false;
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Not Valid");
                        break;
                }

            }
        }


    }



    public Car getPlayerCar() {
        return playerCar;
    }

}
