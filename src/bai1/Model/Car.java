package bai1.Model;

import bai1.Abstract.Vehicle;

public class Car extends Vehicle {
    int numberOfDoors;

    public Car(int id, String name, String model) {
        super(id, name, model);
    }


    @Override
    public void move() {
        System.out.println("Car is moving");
    }
}
