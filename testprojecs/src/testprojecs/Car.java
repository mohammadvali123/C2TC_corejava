package testprojecs;

public class Car {
    // instance variables
    private String make;
    private String model;
    // constructor
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
    }

    // instance method
    public void startEngine() {
        System.out.println("The " + make + " " + model + " engine is starting...");
    }

    // main method
    public static void main(String[] args) {
        // creating objects of the Car class
        Car car1 = new Car("Honda", "Civic", 2022);
        new Car("Toyota", "Corolla", 2021);

        // calling the startEngine method on the car1 object
        car1.startEngine();
    }
}


