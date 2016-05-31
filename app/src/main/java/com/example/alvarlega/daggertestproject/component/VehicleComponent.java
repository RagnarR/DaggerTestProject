package com.example.alvarlega.daggertestproject.component;

import com.example.alvarlega.daggertestproject.model.Vehicle;
import com.example.alvarlega.daggertestproject.module.VehicleModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by alvarlega on 31/05/16.
 */
@Singleton
@Component(modules = {VehicleModule.class})
public interface VehicleComponent {

    Vehicle provideVehicle();
}
