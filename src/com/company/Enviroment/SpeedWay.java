package com.company.Enviroment;

import java.util.Timer;
import java.util.TimerTask;

public class SpeedWay {
//    private int timer;
//    public Track track;
//
//    public SpeedWay(Track track, int timer) {
//        this.timer = timer;
//        this.track = track;
//    }


        int ticksPassed = 0;
        Timer timeClock = new Timer();
        TimerTask distanceClock = new TimerTask() {
            @Override
            public void run() {
                ticksPassed++;
                System.out.println("Ticks passed: " + ticksPassed);
            }
        };

        public void startTimer() {
            timeClock.scheduleAtFixedRate(distanceClock, 1000, 2000);
        }



    public void race() {

    }

}
