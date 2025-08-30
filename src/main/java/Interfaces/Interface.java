package Interfaces;
// Interface
interface Vehicle {
    void start();   // by default: public + abstract
    void stop();
}

// Bike implements Vehicle
class Bike implements Vehicle {
    @Override
    public void start() {
        System.out.println("Bike starts with Kick or Self-start ");
    }

    @Override
    public void stop() {
        System.out.println("Bike stopped!");
    }
}

// Car implements Vehicle
class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car starts with Push Button ");
    }

    @Override
    public void stop() {
        System.out.println("Car stopped!");
    }
}
public class Interface {
    public static void main(String[] args) {
        Vehicle v1 = new Bike();
        v1.start();
        v1.stop();

        Vehicle v2 = new Car();
        v2.start();
        v2.stop();
    }
}
