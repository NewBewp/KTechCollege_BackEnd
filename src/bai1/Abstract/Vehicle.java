package bai1.Abstract;

public abstract class Vehicle {
    final int id;
    String name;
    String model;
    public static int vehicleCount = 0;

    public Vehicle(int id, String name, String model) {
        this.id = id;
        this.name = name;
        this.model = model;
        vehicleCount++;
    }

    public abstract void move();
}
