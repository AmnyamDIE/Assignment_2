package kz.aitu.oop.practice.practice2;

import java.util.ArrayList;
import java.util.List;

class TrainCar {
    private int capacity;

    public TrainCar(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }
}

class PassengerCar extends TrainCar {
    public PassengerCar(int capacity) {
        super(capacity);
    }
}

class CargoCar extends TrainCar {
    public CargoCar(int capacity) {
        super(capacity);
    }
}

class Locomotive {
    private String model;

    public Locomotive(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }
}

class Train {
    private List<Locomotive> locomotives;
    private List<TrainCar> trainCars;

    public Train() {
        this.locomotives = new ArrayList<>();
        this.trainCars = new ArrayList<>();
    }

    public void addLocomotive(Locomotive locomotive) {
        locomotives.add(locomotive);
    }

    public void addTrainCar(TrainCar trainCar) {
        trainCars.add(trainCar);
    }

    public int getTotalCapacity() {
        int totalCapacity = 0;

        for (TrainCar car : trainCars) {
            totalCapacity += car.getCapacity();
        }

        return totalCapacity;
    }
}

public class Main {
    public static void main(String[] args) {
        Train train1 = new Train();
        Train train2 = new Train();

        train1.addLocomotive(new Locomotive("Express-1000"));
        train2.addLocomotive(new Locomotive("CargoMaster-2000"));

        train1.addTrainCar(new PassengerCar(50));
        train1.addTrainCar(new PassengerCar(30));
        train2.addTrainCar(new CargoCar(100));
        train2.addTrainCar(new CargoCar(150));

        System.out.println("Train 1 Total Capacity: " + train1.getTotalCapacity() + " passengers");
        System.out.println("Train 2 Total Capacity: " + train2.getTotalCapacity() + " cargo units");
    }
}