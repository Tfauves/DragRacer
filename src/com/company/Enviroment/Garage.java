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

//    public void beginClock() {
//        isActiveTime = true;
//        if (isActiveTime) {
//            startTimer(100);
//        }
//    }
//
//    public void stopClock() {
//        if (isActiveTime) {
//            isActiveTime = false;
//            System.out.println("Your time: " + ticksPassed + " sec");
//        }
//    }
//
//    public void startTimer(int period) {
//        timeClock.scheduleAtFixedRate(distanceClock, 1000, period);
//    }
//

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

//    public void beginDrive() {
//        System.out.println("Would you like to drive? y/n");
//        String userChoice = Garage.scanner.next();
//        if (userChoice.equals("y")) {
//            race(playerCar);
//        } else {
//            System.out.println("Returning to garage");
//        }
//    }
//
//
//    public void race(Car playerVehicle) {
//        boolean isActive = true;
//        System.out.println("Press (s) to start your engine");
//        String userInput = scanner.next();
//        if (userInput.equals("s")) {
//            playerVehicle.start();
////            beginClock();
//        } else {
//            System.out.println("Please start your vehicle to begin driving.");
//        }
//        while (isActive) {
//            if (playerVehicle.getEngine().getIsOperating()) {
//                System.out.println("Press (a) to accelerate, (b) to brake, (x) to coast, (ab) to stop short, (y) to turn off vehicle, (xy) end race and to return to garage");
//                userInput = scanner.next();
//                switch (userInput) {
//                    case "a" -> playerVehicle.accelerate();
//                    case "b" -> playerVehicle.brake();
//                    case "x" -> playerVehicle.coast();
//                    case "ab" -> playerVehicle.stopShort();
//                    case "y" -> playerVehicle.turnOff();
//                    case "xy" -> {
//                        System.out.println("The race is over...heading back to garage");
////                        stopClock();
//                        isActive = false;
//                        System.exit(0);
//                    }
//                    default -> System.out.println("Not Valid");
//                }
//
//            }
//        }
//
//
//    }
//
//

    public Car getPlayerCar() {
        return playerCar;
    }

}
