package com.abbitt.rtm.domain.circuits;

import java.io.Serializable;
import java.util.List;

public class Circuit implements Serializable {

    private final String name;
    private final List<CircuitPart> parts;

    public Circuit(String name, List<CircuitPart> parts) {
        this.name = name;
        this.parts = parts;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name).append("{\n");
        parts.forEach(part -> sb.append(part.printableName()).append("\n"));
        sb.append("}");

        return sb.toString();
    }
}
