package com.abbitt.rtm.domain.circuits;

public class CircuitBuilderTest {

    public static void main(String[] args) {
        CircuitBuilder builder = new CircuitBuilder("Dan Test Track");
        builder.addStraight("Brabham Straight", 800)
                .addCorner("Paddock Hill Bend", 90, -2)
                .addStraight("Paddock Hill", 150)
                .addCorner("Druids", 10, 0.5)
                .addStraight("Graham Hill", 100)
                .addCorner("Graham Hill Bend", 100, 1)
                .addStraight("Cooper Straight", 300)
                .addCorner("Surtees", 120, 1)
                .addCorner("McLaren", 150, 1)
                .addCorner("Clearways", 20, -0.5)
                .addStraight("Brabham Straight", 600);

        Circuit brands = builder.build();
        System.out.println(brands.toString());
    }

}
