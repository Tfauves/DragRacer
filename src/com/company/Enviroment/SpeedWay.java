package com.company.Enviroment;

import com.company.Vehicles.Vehicle;

import java.util.Timer;
import java.util.TimerTask;

public class SpeedWay {
    private boolean isActiveTime = false;
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

        public void beginClock() {
            isActiveTime = true;
            if (isActiveTime) {
                startTimer(1000);
            }
        }

        public void stopClock() {
            if (isActiveTime) {
                isActiveTime = false;
            }
        }

        public void startTimer(int period) {
            timeClock.scheduleAtFixedRate(distanceClock, 1000, period);
        }





    public void race() {

    }

//
//    public boolean isActiveTime() {
//        return isActiveTime;
//    }
}
