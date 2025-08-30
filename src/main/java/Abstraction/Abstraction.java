package Abstraction;
// Abstract class
abstract class Vehicle {
    // Abstract method (no body) → force child class to implement
    abstract void start();

    // Normal method (can have implementation)
    public void stop() {
        System.out.println("Vehicle stopped!");
    }
}

// Concrete subclass 1
class Bike extends Vehicle {
    @Override
    void start() {
        System.out.println("Bike starts with Kick or Self-start 🚴");
    }
}

// Concrete subclass 2
class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car starts with Push Button or Key 🚗");
    }
}
public class Abstraction {
    public static void main(String[] args) {
        Vehicle v1 = new Bike(); // reference = parent, object = child
        v1.start();  // calls Bike's start()
        v1.stop();

        Vehicle v2 = new Car();
        v2.start();  // calls Car's start()
        v2.stop();
    }
}
