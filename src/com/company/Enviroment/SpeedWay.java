package com.company.Enviroment;

import com.company.Vehicles.Car;

import java.util.ArrayList;
import java.util.List;

public class SpeedWay {
//    private boolean isActiveTime = false;
    private Garage playerGarage;
    public Track track;
    private List<Track> trackList = new ArrayList<>();


    public SpeedWay(Garage playerGarage) {
        this.playerGarage = playerGarage;
    }

//    public void buildTrack(String lvlOfDifficulty, int length) {
//        Track track = new Track(lvlOfDifficulty, length);
//        trackList.add(track);
//    }
        Track track01 = new Track("beginner", 400, null);

    public void addToTrackList() {
        trackList.add(track01);
    }

    public void displayTrack() {
        int trackCount = 0;
        for (Track tracks : trackList) {
            trackCount++;
            System.out.println(trackCount + ": Level of difficulty: " + tracks.lvlOfDifficulty + " | end track hazard: " + tracks.hazard + " | Length to finish: " + tracks.getLength() + "m");
        }
    }


    public void beginDrive() {
        System.out.println("Select the track: ");
        displayTrack();
        int userChoice = Garage.scanner.nextInt();
        switch (userChoice) {
            case 1:
              playerGarage.getPlayerCar().setFinishDistance(track01.getLength());
        }
//        if (userChoice.equals("y")) {
//            race(playerGarage.getPlayerCar());
//        } else {
//            System.out.println("Returning to garage");
//        }
        race(playerGarage.getPlayerCar());
    }

    // TODO: 9/2/2021 implement time and distance passes during acceleration. 
    public void race(Car playerVehicle) {
        boolean isActive = true;
        System.out.println("Press (s) to start your engine");
        String userInput = Garage.scanner.next();
        if (userInput.equals("s")) {
            playerVehicle.start();
//            playerGarage.beginClock();
        } else {
            System.out.println("Please start your vehicle to begin driving.");
        }
        while (isActive) {
            if (playerVehicle.getEngine().getIsOperating()) {
                System.out.println("Press (a) to accelerate, (b) to brake, (x) to coast, (ab) to stop short, (y) to turn off vehicle, (xy) end race and to return to garage");
                userInput = Garage.scanner.next();
                switch (userInput) {
                    case "a" -> {
                        playerVehicle.accelerate();
                        playerGarage.getPlayerCar().setDistanceTraveled(playerGarage.getPlayerCar().getDistanceTraveled() + 8);
                        playerGarage.getPlayerCar().setTimer(playerGarage.getPlayerCar().getTimer() + 2);
                    }
                    case "b" -> {
                        playerVehicle.brake();
                        playerGarage.getPlayerCar().setDistanceTraveled(playerGarage.getPlayerCar().getDistanceTraveled() + 1);
                        playerGarage.getPlayerCar().setTimer(playerGarage.getPlayerCar().getTimer() + 2);
                    }
                    case "x" -> {
                        playerVehicle.coast();
                        playerGarage.getPlayerCar().setDistanceTraveled(playerGarage.getPlayerCar().getDistanceTraveled() + 2);
                        playerGarage.getPlayerCar().setTimer(playerGarage.getPlayerCar().getTimer() + 2);
                    }
                    case "ab" -> {
                        playerVehicle.stopShort();
                        playerGarage.getPlayerCar().setTimer(playerGarage.getPlayerCar().getTimer() + 2);
                    }
                    case "y" -> playerVehicle.turnOff();
                    case "xy" -> {
                        System.out.println("The race is over...heading back to garage");
//                        playerGarage.stopClock();
                        isActive = false;
                        System.exit(0);
                    }
                    default -> System.out.println("Not Valid");
                }

            }
        }


    }

    public List<Track> getTrackList() {
        return trackList;
    }
}
