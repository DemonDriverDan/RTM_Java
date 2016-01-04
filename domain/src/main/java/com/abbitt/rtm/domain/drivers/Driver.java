package com.abbitt.rtm.domain.drivers;

import java.io.Serializable;

public class Driver implements Serializable {

    private final String firstName;
    private final String lastName;
    private final String printableName;
    private final double speed;
    private final double bravery;
    private final double aggressiveness;
    private final double intelligence;
    private final double fitness;

    public Driver(String firstName, String lastName, double speed, double bravery, double aggressiveness, double intelligence, double fitness) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.printableName = firstName + " " + lastName;
        this.speed = speed;
        this.bravery = bravery;
        this.aggressiveness = aggressiveness;
        this.intelligence = intelligence;
        this.fitness = fitness;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPrintableName() {
        return printableName;
    }

    public double getSpeed() {
        return speed;
    }

    public double getBravery() {
        return bravery;
    }

    public double getAggressiveness() {
        return aggressiveness;
    }

    public double getIntelligence() {
        return intelligence;
    }

    public double getFitness() {
        return fitness;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", printableName='" + printableName + '\'' +
                ", speed=" + speed +
                ", bravery=" + bravery +
                ", aggressiveness=" + aggressiveness +
                ", intelligence=" + intelligence +
                ", fitness=" + fitness +
                '}';
    }
}
