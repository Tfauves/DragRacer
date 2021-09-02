package com.company.Enviroment;
import com.company.Vehicles.Car;
import java.util.ArrayList;
import java.util.List;


public class SpeedWay {
    private Garage playerGarage;
    private List<Track> trackList = new ArrayList<>();
    private Track userTrack;


    Track track01 = new Track("beginner", 400, new Hazard(4, "watery lake"));
    Track track02 = new Track("novice", 600, new Hazard(6, "wall of flaming hay"));
    Track track03 = new Track("pro", 800, new Hazard(10, "brick wall"));


    public SpeedWay(Garage playerGarage) {
        this.playerGarage = playerGarage;
    }

    public void addToTrackList() {
        trackList.add(track01);
        trackList.add(track02);
        trackList.add(track03);
    }

    public void displayTrack() {
        int trackCount = 0;
        for (Track tracks : trackList) {
            trackCount++;
            System.out.println(trackCount + ": Level of difficulty: " + tracks.lvlOfDifficulty + " | end track hazard: " + tracks.hazard.getType() + " | Length to finish: " + tracks.getLength() + "m");
        }
    }

    public void beginDrive() {
            System.out.println("Select the track: ");
            displayTrack();
            try {
                int userChoice = Garage.scanner.nextInt();
                switch (userChoice) {
                    case 1 -> {
                        playerGarage.getPlayerCar().setFinishDistance(track01.getLength());
                        userTrack = track01;
                    }
                    case 2 -> {
                        playerGarage.getPlayerCar().setFinishDistance(track02.getLength());
                        userTrack = track02;
                    }
                    case 3 -> {
                        playerGarage.getPlayerCar().setFinishDistance(track03.getLength());
                        userTrack = track03;
                    }
                    default -> System.out.println("Invalid Input");
                }
            } catch (Exception e) {
                System.out.println("Invalid selection");
            }
            race(playerGarage.getPlayerCar());
    }

    // TODO: 9/2/2021 implement time and distance passes during acceleration. 
    public void race(Car playerVehicle) {
        boolean isActive = true;
        System.out.println("Press (s) to start your engine");
        String userInput = Garage.scanner.next();
        if (userInput.equals("s")) {
            playerVehicle.start();
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
                        playerGarage.getPlayerCar().setDistanceTraveled(playerGarage.getPlayerCar().getSpeedometer() * 2);
                        playerGarage.getPlayerCar().setTimer(playerGarage.getPlayerCar().getDistanceTraveled());
                        if (playerGarage.getPlayerCar().getDistanceTraveled() >= userTrack.getLength()) {
                            System.out.println("You are at the finish line stop!!!!");
                            break;
                        }
                    }
                    case "b" -> {
                        playerVehicle.brake();
                        playerGarage.getPlayerCar().setDistanceTraveled(playerGarage.getPlayerCar().getDistanceTraveled() + 1);
                        playerGarage.getPlayerCar().setTimer(playerGarage.getPlayerCar().getTimer() + 2);
                        break;
                    }
                    case "x" -> {
                        playerVehicle.coast();
                        playerGarage.getPlayerCar().setDistanceTraveled(playerGarage.getPlayerCar().getDistanceTraveled() + 2);
                        playerGarage.getPlayerCar().setTimer(playerGarage.getPlayerCar().getTimer() + 2);
                        break;
                    }
                    case "ab" -> {
                        playerVehicle.stopShort();
                        playerGarage.getPlayerCar().setTimer(playerGarage.getPlayerCar().getTimer() + 2);
                        break;
                    }
                    case "y" -> playerVehicle.turnOff();
                    case "xy" -> {
                        System.out.println("The race is over...heading back to garage");
                        isActive = false;
                        System.exit(0);
                    }
                    default -> System.out.println("Not Valid");
                }

            }
        }

    }
}
