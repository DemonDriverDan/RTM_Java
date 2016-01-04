package com.abbitt.rtm.domain.vehicles;

import java.io.Serializable;

public class Car implements Serializable {

    private final String manufacturer;
    private final String model;
    private final double speed;
    private final double acceleration;
    private final double handling;
    private final double grip;

    public Car(String manufacturer, String model, double speed, double acceleration, double handling, double grip) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.speed = speed;
        this.acceleration = acceleration;
        this.handling = handling;
        this.grip = grip;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public double getSpeed() {
        return speed;
    }

    public double getAcceleration() {
        return acceleration;
    }

    public double getHandling() {
        return handling;
    }

    public double getGrip() {
        return grip;
    }

    @Override
    public String toString() {
        return "Car{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", speed=" + speed +
                ", acceleration=" + acceleration +
                ", handling=" + handling +
                ", grip=" + grip +
                '}';
    }
}
