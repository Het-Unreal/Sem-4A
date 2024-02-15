class Vehicle {
    protected String name;
    protected int wheels;

    public Vehicle(String name, int wheels) {
        this.name = name;
        this.wheels = wheels;
    }

    public void startEngine() {
        System.out.println(name + " engine started!");
    }
}

class Car extends Vehicle {
    private int doors;

    public Car(String name, int wheels, int doors) {
        super(name, wheels);
        this.doors = doors;
    }

    public void openDoors() {
        System.out.println(name + " doors opened!");
    }
}

class SportsCar extends Car {
    private double topSpeed;

    public SportsCar(String name, int wheels, int doors, double topSpeed) {
        super(name, wheels, doors);
        this.topSpeed = topSpeed;
    }

    public void accelerate() {
        System.out.println(name + " accelerating! Reaching top speed of " + topSpeed + "mph.");
    }
}

public class prac15 {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Generic Vehicle", 4);
        Car car = new Car("Sedan", 4, 4);
        SportsCar sportsCar = new SportsCar("Supercar", 4, 2, 200.0);

        vehicle.startEngine();

        car.startEngine();
        
        sportsCar.startEngine();
        sportsCar.openDoors();
        sportsCar.accelerate();
    }
}
