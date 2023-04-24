package Vehicle;

import java.util.Scanner;

public class Parking {

    public static void main(String[] args) {

        Vehicle vehicle1 = new Vehicle();
        printDetails(vehicle1);

        Car car = new Car();

        Vehicle vehicle2 = new Vehicle(4, 5, 4);
        printDetails(vehicle2);

        car.drive();
    }

    public static void printDetails(Vehicle vehicle){
        System.out.println("\tnumber of doors = " + vehicle.getDoor());
        System.out.println("\tnumber of seats = " + vehicle.getSeats());
        System.out.println("\tnumber of wheels = " + vehicle.getWheels());
    }

}
