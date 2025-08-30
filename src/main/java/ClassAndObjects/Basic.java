package ClassAndObjects;
// Class and Object Example in Java

/*
- Class is a blueprint/template for creating objects.
- Object is an instance of a class (real-world entity).
- A class can have variables (fields) and methods (functions).
*/

class Car {
    // Fields (properties) Or Data Members
    String brand;
    int year;

    // Method (behavior) Or Member functions
    void displayInfo() {
        System.out.println("Brand: " + brand + ", Year: " + year);
    }
}


public class Basic {
    public static void main(String[] args) {
        // Creating objects of Car class
        Car car1 = new Car();
        car1.brand = "Tesla";
        car1.year = 2023;

        Car car2 = new Car();
        car2.brand = "BMW";
        car2.year = 2022;

        // Calling method
        car1.displayInfo();
        car2.displayInfo();// Creating objects of Car class

    }
}
