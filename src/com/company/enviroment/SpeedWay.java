package com.company.enviroment;

import com.company.Console;
import com.company.vehicles.Car;

import java.util.ArrayList;
import java.util.List;

public class SpeedWay {
    private List<Track> trackList = new ArrayList<>();


    public void trackBuilder(String lvlOfDifficulty, int distance, Hazard hazardType) {
        Track track  = new Track(lvlOfDifficulty, distance, hazardType);
        trackList.add(track);
    }

    public List<Track> getTracks() {
        return trackList;
    }

//    public void beginDrive() {
//        System.out.println("Would you like to drive? y/n");
//        String userChoice = Console.scanner.next();
//        if (userChoice.equals("y")) {
//            race(playerCar);
//        } else {
//            System.out.println("Returning to garage");
//        }
//    }

//    public void race(Car playerVehicle) {
//        boolean isActive = true;
//        int accelerateCounter = 0;
//        System.out.println("Press (s) to start your engine");
//        String userInput = Console.scanner.next();
//        if (userInput.equals("s")) {
//            playerVehicle.start();
////            beginClock();
//        } else {
//            System.out.println("Please start your vehicle to begin driving.");
//        }
//        while (isActive) {
//            if (playerVehicle.getEngine().getIsOperating()) {
//                playerVehicle.dashDisplay();
//                System.out.println("Press (a) to accelerate, (b) to brake, (x) to coast, (ab) to stop short, (y) to turn off vehicle, (xy) end race and to return to garage");
//                userInput = scanner.next();
//                switch (userInput) {
//                    case "a":
//                        if (playerVehicle.getDistance() >= playerVehicle.getDestination()) {
//                            System.out.println("you are at the end of the track stop now!!!");
//                        }
//                        accelerateCounter++;
//                        playerVehicle.accelerate();
//                        playerVehicle.setDistance(playerVehicle.getDistance() + (5 * accelerateCounter));
//                        playerVehicle.setTimePassed(playerVehicle.getTimePassed() + 3);
//
//                        break;
//                    case "b":
//                        playerVehicle.brake();
//                        playerVehicle.setDistance(playerVehicle.getDistance() + 1);
//                        playerVehicle.setTimePassed(playerVehicle.getTimePassed() + 8);
//                        break;
//                    case "x":
//                        playerVehicle.coast();
//                        playerVehicle.setDistance(playerVehicle.getDistance() + 2);
//                        playerVehicle.setTimePassed(playerVehicle.getTimePassed() + 6);
//                        break;
//                    case "ab":
//                        playerVehicle.stopShort();
//                        break;
//                    case "y":
//                        playerVehicle.turnOff();
//                        break;
//                    case "xy":
//                        System.out.println("whoo nice race your total time was " + playerVehicle.getTimePassed());
//                        //stopClock();
//                        isActive = false;
//                        // System.exit(0);
//                        break;
//                    default:
//                        System.out.println("Not Valid");
//                        break;
//                }
//
//            }
//        }
//
//
//    }
}
