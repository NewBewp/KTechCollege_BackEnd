package bai1.Model;

import bai1.Abstract.Vehicle;

public class Bike extends Vehicle {
    boolean hasGear;

    public Bike(int id,String name,String model) {
        super(id,name,model);
    }

    @Override
    public void move() {
        System.out.println("Bike is moving");

    }
}
