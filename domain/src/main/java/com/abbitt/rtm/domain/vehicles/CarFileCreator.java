package com.abbitt.rtm.domain.vehicles;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CarFileCreator {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String fileName = "carSerializationTest.txt";
        serialize(fileName);
        deserialize(fileName);
    }

    private static void serialize(String fileName) throws IOException {
        List<Car> list = new ArrayList<>();
        list.add(new Car("Peugeot", "306", 5.0, 5.0, 5.0, 5.0));
        list.add(new Car("Peugeot", "307", 2.0, 2.0, 3.5, 3.5));

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName));
        oos.writeObject(list);
        oos.close();
    }

    private static void deserialize(String fileName) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName));
        List<Car> list = (List<Car>) ois.readObject(); // cast is needed.
        ois.close();
        list.forEach(car -> System.out.println(car.toString()));
    }
}
