package com.example.alvarlega.daggertestproject.module;

import com.example.alvarlega.daggertestproject.model.Motor;
import com.example.alvarlega.daggertestproject.model.Vehicle;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by alvarlega on 31/05/16.
 */
@Module
public class VehicleModule {

    @Provides @Singleton
    Motor provideMotor() {
        return new Motor();
    }

    @Provides @Singleton
    Vehicle provideVehicle() {
        return new Vehicle(new Motor());
    }
}
