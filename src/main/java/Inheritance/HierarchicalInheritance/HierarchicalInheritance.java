package Inheritance.HierarchicalInheritance;
// Hierarchical Inheritance Example

class Animal {
    void eat() {
        System.out.println("Animals eat food.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks.");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("Cat meows.");
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        Cat c = new Cat();

        d.eat();   // parent method
        d.bark();  // child method

        c.eat();   // parent method
        c.meow();  // child method
    }
}
