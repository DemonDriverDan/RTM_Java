package com.abbitt.rtm.domain.circuits;

public class Corner extends CircuitPart {

    private final String name;
    private final int number;
    private final double radius;
    private final double camber;

    public Corner(int number, double radius, double camber) {
        this("", number, radius, camber);
    }

    public Corner(String name, int number, double radius, double camber) {
        this.name = name;
        this.number = number;
        this.radius = radius;
        this.camber = camber;
    }

    public double getRadius() {
        return radius;
    }

    public double getCamber() {
        return camber;
    }

    @Override
    String printableName() {
        if (!name.isEmpty()) {
            return name;
        }

        return "Turn " + number;
    }

    @Override
    public String toString() {
        if (!name.isEmpty()) {
            return "Corner{" +
                    "name='" + name + '\'' +
                    ", number=" + number +
                    ", radius=" + radius +
                    ", camber=" + camber +
                    '}';
        }

        return "Corner{" +
                "number=" + number +
                ", camber=" + camber +
                ", radius=" + radius +
                '}';
    }
}
