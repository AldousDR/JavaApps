package Vehicle;

public class Car extends Vehicle{

    public Car(){
        System.out.println("Building a Car...");

    }

    @Override
    public void drive(){
        System.out.println("Driving a Car");
    }
}
