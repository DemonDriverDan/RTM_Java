package com.abbitt.rtm.domain.circuits;

public class Straight extends CircuitPart {

    private final String name;
    private final int length;
    // Elevation?

    public Straight(int length) {
        this("", length);
    }

    public Straight(String name, int length) {
        this.name = name;
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public String getName() {
        return name;
    }

    @Override
    String printableName() {
        if (!name.isEmpty()) {
            return name;
        }

        return "Straight";
    }

    @Override
    public String toString() {
        if (name.isEmpty()) {
            return "Straight{" +
                    "length=" + length +
                    '}';
        }

        return "Straight{" +
                "name='" + name + '\'' +
                ", length=" + length +
                '}';
    }
}
