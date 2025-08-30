package Super;
class Animal {
    String color = "White";

    Animal() {
        System.out.println("Animal constructor called");
    }

    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    String color = "Black";

    Dog() {
        super(); // parent constructor call
        System.out.println("Dog constructor called");
    }

    void displayColor() {
        System.out.println("Dog color: " + color);
        System.out.println("Animal color: " + super.color); // parent variable
    }

    void sound() {
        super.sound(); // parent method call
        System.out.println("Dog barks");
    }
}

public class Super {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.displayColor();
        d.sound();
    }
}
