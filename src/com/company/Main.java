package com.company;

import com.company.Enviroment.Garage;
import com.company.Enviroment.SpeedWay;


public class Main {

    public static void main(String[] args) {

        Garage garage01 = new Garage();
        SpeedWay race01 =new SpeedWay();
        garage01.listBuild();
        garage01.carBuilder();
        garage01.beginDrive();


    }
}
