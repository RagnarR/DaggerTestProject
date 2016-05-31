package com.example.alvarlega.daggertestproject.model;

/**
 * Created by alvarlega on 31/05/16.
 */
public class Motor {

    private int rpm;

    public Motor() {

        this.rpm = 0;
    }

    public int getRpm() {

        return rpm;
    }

    public void accelerate(int value){
        rpm = rpm + value;
    }

    public void brake(){
        rpm = 0;
    }
}
