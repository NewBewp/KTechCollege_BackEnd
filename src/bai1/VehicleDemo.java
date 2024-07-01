package bai1;

import bai1.Abstract.Vehicle;
import bai1.Model.Bike;
import bai1.Model.Car;


public class VehicleDemo {
    public static void main(String[] args) {

        Vehicle car = new Car(1,"Car1","Model1")  ;
        Vehicle bike = new Bike(2,"Bike2","Model2")  ;
        Vehicle bike1 = new Bike(3,"Bike2","Model2")  ;

        car.move();
        bike.move();

        int vehicleCount = Vehicle.vehicleCount;
        System.out.println(vehicleCount);

    }

}
