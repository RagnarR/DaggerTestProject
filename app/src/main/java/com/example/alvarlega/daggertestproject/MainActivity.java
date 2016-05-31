package com.example.alvarlega.daggertestproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.alvarlega.daggertestproject.component.DaggerVehicleComponent;
import com.example.alvarlega.daggertestproject.component.VehicleComponent;
import com.example.alvarlega.daggertestproject.model.Vehicle;
import com.example.alvarlega.daggertestproject.module.VehicleModule;

public class MainActivity extends AppCompatActivity {

    Vehicle vehicle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        VehicleComponent component = DaggerVehicleComponent.builder()
                                                           .vehicleModule(new VehicleModule()).build();

        vehicle = component.provideVehicle();

        vehicle.increaseSpeed(20);

        Toast.makeText(this, String.valueOf(vehicle.getSpeed()), Toast.LENGTH_SHORT).show();
    }
}
