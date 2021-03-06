package com.example.alvarlega.daggertestproject.model;

import javax.inject.Inject;

/**
 * Created by alvarlega on 31/05/16.
 */
public class Vehicle {

    private Motor motor;

    @Inject
    public Vehicle(Motor motor) {

        this.motor = motor;
    }

    public void increaseSpeed(int value) {
        motor.accelerate(value);
    }

    public void stop() {
        motor.brake();
    }

    public int getSpeed() {
        return motor.getRpm();
    }
}
