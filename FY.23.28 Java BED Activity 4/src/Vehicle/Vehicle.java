package Vehicle;

public class Vehicle {
    private static int door;
    private static int seats;
    private static int wheels;

    public Vehicle(){
        System.out.println("Building a vehicle...");
    }

    public Vehicle(int d, int s, int w){
        this.door = d;
        this.seats = s;
        this.wheels = w;
    }


    public void drive(){
        System.out.println("Driving a vehicle...");
    }

    public static int getDoor() {
        return door;
    }

    public void setDoor(int door) {
        this.door = door;
    }

    public static int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public static int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

}
