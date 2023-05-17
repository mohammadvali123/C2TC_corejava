package corejavac2tc;

class Vehicle {
    protected String make;
    protected String model;
    protected int year;

    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    protected void startEngine() {
        System.out.println("Starting engine of " + make + " " + model);
    }

    protected void stopEngine() {
        System.out.println("Stopping engine of " + make + " " + model);
    }
}

class Car extends Vehicle {
    private int numDoors;

    public Car(String make, String model, int year, int numDoors) {
        super(make, model, year);
        this.numDoors = numDoors;
    }

    public void drive() {
        startEngine();
        System.out.println("Driving the " + make + " " + model + " with " + numDoors + " doors.");
    }

    public void park() {
        stopEngine();
        System.out.println("Parking the " + make + " " + model);
    }
}

public class ProtectedModifiers {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Camry", 2022, 4);

        myCar.drive();
        myCar.park();
    }
}
