package com.company.Enviroment;

import com.company.Garage;
import com.company.Vehicles.Car;
import com.company.Vehicles.Vehicle;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class SpeedWay {
    private boolean isActiveTime = false;
    private Garage playerGarage;
//    private int timer;
//    public Track track;
//
//    public SpeedWay(Track track, int timer) {
//        this.timer = timer;
//        this.track = track;
//    }

//
//        int ticksPassed = 0;
//        Timer timeClock = new Timer();
//        TimerTask distanceClock = new TimerTask() {
//            @Override
//            public void run() {
//                ticksPassed++;
////                System.out.println("Ticks passed: " + ticksPassed);
//            }
//        };
//
//        public void beginClock() {
//            isActiveTime = true;
//            if (isActiveTime) {
//                startTimer(1000);
//            }
//        }
//
//        public void stopClock() {
//            if (isActiveTime) {
//                isActiveTime = false;
//                System.out.println(ticksPassed);
//            }
//        }
//
//        public void startTimer(int period) {
//            timeClock.scheduleAtFixedRate(distanceClock, 1000, period);
//        }

//    public void beginDrive() {
//        System.out.println("Would you like to drive? y/n");
//        String userChoice = Garage.scanner.next();
//        if (userChoice.equals("y")) {
//            race(playerGarage.getPlayerCar());
//        } else {
//            System.out.println("Returning to garage");
//        }
//    }
//
//
//    public void race(Car playerVehicle) {
//        System.out.println("Press (s) to start your engine");
//        String userInput = Garage.scanner.next();
//        if (userInput.equals("s")) {
//            playerVehicle.start();
//        } else {
//            System.out.println("Please start your vehicle to begin driving.");
//        }
//        if (playerVehicle.getEngine().getIsOperating()) {
//            System.out.println("Press (a) to accelerate: ");
//            if (userInput.equals("a")) {
//                playerVehicle.accelerate();
//            }
//        }
//
//
//    }



//
//    public boolean isActiveTime() {
//        return isActiveTime;
//    }
}
