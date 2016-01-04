package com.abbitt.rtm.domain.circuits;

import java.util.ArrayList;

public class CircuitBuilder {

    private final ArrayList<CircuitPart> parts;
    private final String name;

    private int numCorners = 0;

    public CircuitBuilder(String name) {
        this.name = name;
        this.parts = new ArrayList<>();
    }

    public Circuit build() {
        return new Circuit(name, parts);
    }

    public CircuitBuilder addStraight(String name, int length) {
        parts.add(new Straight(name, length));
        return this;
    }

    public CircuitBuilder addStraight(int length) {
        parts.add(new Straight(length));
        return this;
    }

    public CircuitBuilder addCorner(String name, double radius, double camber) {
        parts.add(new Corner(name, ++numCorners, radius, camber));
        return this;
    }

    public CircuitBuilder addCorner(double radius, double camber) {
        parts.add(new Corner(++numCorners, radius, camber));
        return this;
    }
}
